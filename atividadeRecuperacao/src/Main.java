import javax.swing.*;

void main() {

    JFrame janela = new JFrame("cadastrar");
    janela.setSize(800, 500);
    janela.setLayout(null);

    JLabel labelproduto = new JLabel("Nome:");
    labelproduto.setBounds(200, 60, 400, 48);
    JTextField inputProduto = new JTextField();
    inputProduto.setBounds(200, 90, 400, 40);

    JLabel labelPreco = new JLabel("Preço");
    labelPreco.setBounds(200, 130, 150, 48);
    JTextField inputpreco = new JTextField();
    inputpreco.setBounds(200, 160, 400, 40);

    JLabel labelQuantidade = new JLabel("Quantidade");
    labelQuantidade.setBounds(200, 200, 150, 48);
    JTextField inputquantidade = new JTextField();
    inputquantidade.setBounds(200, 230, 400, 40);

    JButton botaoCadastrar = new JButton("Cadastrar");
    botaoCadastrar.setBounds(200, 300, 150, 40);

    botaoCadastrar.addActionListener(e -> {

        if ("".equals(inputProduto.getText()) || "".equals(inputpreco.getText()) || "".equals(inputquantidade.getText())) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else if (Double.parseDouble(inputpreco.getText()) <= 0 || Integer.parseInt(inputquantidade.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "preço e quantidade deve ser maiores que zero ");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nome: Mouse\n" +
                            "Preço: R$ 50.00\n" +
                            "Quantidade: 2\n" +
                            "Valor total em estoque: R$ 100.00\n " +
                            "Cadastrado com sucesso!");
        }
    });

    JButton botaoLimpar = new JButton("Limpar");
    botaoLimpar.setBounds(400, 300, 150, 40);

    botaoLimpar.addActionListener(e -> {
        inputpreco.setText("");
        inputquantidade.setText("");
        inputProduto.setText("");
    });

    janela.add(labelproduto);
    janela.add(inputProduto);
    janela.add(labelPreco);
    janela.add(inputpreco);
    janela.add(labelQuantidade);
    janela.add(inputquantidade);
    janela.add(botaoCadastrar);
    janela.add(botaoLimpar);
    janela.setVisible(true);

}
