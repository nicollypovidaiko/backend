public abstract class Pagamento {

    private double valor;
    private String destinatario;


    public Pagamento() {
    }

    public Pagamento(double valor, String destinatario) {
        this.valor = valor;
        this.destinatario = destinatario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public abstract boolean validar();
    public abstract void processar();
}
