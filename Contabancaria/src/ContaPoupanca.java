public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public double calcularTarifaMensal() {
        return 0.0; // Isenta de tarifa
    }
}