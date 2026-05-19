import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) {

        JFrame tela = new JFrame("Tela de Cadastro");
        tela.setSize(500, 400);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelNome = new JLabel("Nome");
        labelNome.setBounds(20, 50, 150, 40);
        tela.add(labelNome);

        JTextField Nome = new JTextField();
        Nome.setBounds(20, 80, 250, 40);
        tela.add(Nome);

        JLabel labelEmail = new JLabel("Email");
        labelEmail.setBounds(20, 120, 150, 40);
        tela.add(labelEmail);

        JTextField Email = new JTextField();
        Email.setBounds(20, 150, 250, 40);
        tela.add(Email);

        JButton enviar = new JButton("Enviar");
        enviar.setBounds(80, 200, 150, 40);
        tela.add(enviar);

        enviar.addActionListener(e -> {

            String sql = "INSERT INTO usuario(nome,email) VALUES (?,?)";

            String nomeCompleto = Nome.getText();
            String emailUsuario = Email.getText();

            try {

                Connection conexao = Conexao.conectar();

                PreparedStatement ps = conexao.prepareStatement(sql);

                ps.setString(1, nomeCompleto);
                ps.setString(2, emailUsuario);

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

                ps.close();
                conexao.close();

            } catch (Exception ex) {

                ex.printStackTrace();

                JOptionPane.showMessageDialog(null, ex.getMessage());

            }

        });

        tela.setVisible(true);
    }
}