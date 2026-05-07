import javax.swing.*;
import java.awt.*;

public class Telalogin {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Login SENAI");
        janela.setLayout(new FlowLayout());
        janela.setSize(250, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField campoEmail = new JTextField(15);
        JPasswordField campoSenha = new JPasswordField(15);
        JButton btnLogin = new JButton("Login");
        JButton btnLimpar = new JButton("Limpar");

        janela.add(new JLabel("E-mail:"));
        janela.add(campoEmail);
        janela.add(new JLabel("Senha:"));
        janela.add(campoSenha);
        janela.add(btnLogin);
        janela.add(btnLimpar);

        btnLogin.addActionListener(e -> {
            String email = campoEmail.getText();
            String senha = new String(campoSenha.getPassword());

            if (email.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(janela, "Preencha todos os campos!");
            } else if (email.equals("admin@senai.com") && senha.equals("123456")) {
                JOptionPane.showMessageDialog(janela, "Sucesso! O login foi realizado.");
            } else {
                JOptionPane.showMessageDialog(janela, "Dados incorretos!");
            }
        });

        btnLimpar.addActionListener(e -> {
            campoEmail.setText("");
            campoSenha.setText("");
        });

        janela.setVisible(true);
    }
}