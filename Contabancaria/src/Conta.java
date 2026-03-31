public abstract class Conta {
    protected String numero;
    protected String agencia;
    protected String titular;
    protected double saldo;

    public Conta(String numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + this.saldo);
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: R$ " + String.format("%.2f", saldo));
    }
    
    public abstract double calcularTarifaMensal();
}


