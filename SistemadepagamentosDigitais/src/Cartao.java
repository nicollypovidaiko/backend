public class Cartao extends Pagamento{
    private double limite;

    public Cartao(double limite) {
        this.limite = limite;
    }

    public Cartao(double valor, String destinatario, double limite) {
        super(valor, destinatario);
        this.limite = limite;
    }


    @Override
    public boolean validar() {
        System.out.println("Validando cartão");
        if (super.getValor() > limite) {
            System.out.println("Limite insuficiente");
            return false;
        }else {
            System.out.println("Compra aprovada");
            return true;
        }
    }

    @Override
    public void processar() {
        double taxa = super.getValor() * 0.02; // 2%
        double total = super.getValor() + taxa;

        System.out.println("Pagamento no Cartão aprovado!");
        System.out.println("Total com taxa: R$ " + total);
    }
}


