class Pedido {
    private int id;
    private String cliente;
    private StatusPedido status;

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    public void avancarStatus() {
        switch (this.status) {
            case AGUARDANDO_PAGAMENTO:
                this.status = StatusPedido.PROCESSANDO;
                break;
            case PROCESSANDO:
                this.status = StatusPedido.ENVIADO;
                break;
            case ENVIADO:
                this.status = StatusPedido.ENTREGUE;
                break;
            default:
                break;
        }
    }

    public void cancelarPedido() {
        if (this.status != StatusPedido.ENTREGUE) {
            this.status = StatusPedido.CANCELADO;
            System.out.println("Pedido cancelado com sucesso.");
        } else {
            System.out.println("Erro: Não é possível cancelar um pedido que já foi entregue.");
        }
    }
    public int getId() { return id; }
    public String getCliente() { return cliente; }
    public StatusPedido getStatus() { return status; }
    public void setStatus(StatusPedido status) { this.status = status; }
}
