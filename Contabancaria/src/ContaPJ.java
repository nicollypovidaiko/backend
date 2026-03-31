public class ContaPJ extends Conta {
    private final double TAXA_SAQUE = 1.50;

    public ContaPJ(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + TAXA_SAQUE;
        if (valorTotal <= saldo) {
            this.saldo -= valorTotal;
            System.out.println("Saque PJ: R$ " + valor + " (+ R$ " + TAXA_SAQUE + " taxa). Saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para cobrir o saque e a taxa.");
        }
    }

    @Override
    public double calcularTarifaMensal() {
        return 20.00;
    }
}

