class Banco {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA BANCÁRIO ---\n");

        Conta cc = new ContaCorrente("123-X", "0001", "Ana Silva", 1000.0);
        Conta cp = new ContaPoupanca("456-Y", "0001", "Bruno Souza", 500.0);
        Conta pj = new ContaPJ("789-Z", "0002", "Empresa Tech Ltda", 5000.0);

        // Operações Conta Corrente
        System.out.println("[Conta Corrente]");
        cc.depositar(200);
        cc.sacar(100);
        System.out.println("Tarifa Mensal: R$ " + cc.calcularTarifaMensal());
        cc.exibirSaldo();

        System.out.println("\n[Conta Poupança]");
        cp.sacar(50);
        System.out.println("Tarifa Mensal: R$ " + cp.calcularTarifaMensal());
        cp.exibirSaldo();

        System.out.println("\n[Conta PJ]");
        pj.sacar(1000); // Deve cobrar 1.50 extra
        System.out.println("Tarifa Mensal: R$ " + pj.calcularTarifaMensal());
        pj.exibirSaldo();
    }
}