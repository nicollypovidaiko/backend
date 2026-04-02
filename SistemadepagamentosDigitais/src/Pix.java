public class Pix extends Pagamento{

    public Pix() {
    }

    public Pix(double valor, String destinatario) {
        super(valor, destinatario);
    }

    public boolean validar(double valor, double conta) {
        System.out.println("Pix validadado");
        System.out.println("Validando compra");
        if (valor >=  conta) {
            System.out.println("Pix Realizado no valor de R$"+valor);
            return true;
        }
        else  {
            System.out.println("Pix Invalido");
            return false;
        }
    }

    @Override
    public boolean validar() {
        System.out.println("Validando Pix");
        System.out.println("Pix de R$"+super.getValor()+" enviado para "+super.getDestinatario());
        return true;
    }
    @Override
    public void processar() {
        System.out.println("Pix Realizado no valor de R$"+super.getValor());
    }
}
