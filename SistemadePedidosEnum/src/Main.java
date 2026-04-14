public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, "Isabela Andrelino");
        
        System.out.println("Status: " + pedido.getStatus());

        pedido.avancarStatus();
        System.out.println("Status: " + pedido.getStatus());

        pedido.avancarStatus();
        System.out.println("Status: " + pedido.getStatus());

        pedido.avancarStatus();
        System.out.println("Status: " + pedido.getStatus());

        Pedido pedidoCancelado = new Pedido(2, "Maria");
        pedidoCancelado.cancelarPedido();
        System.out.println("Status: " + pedidoCancelado.getStatus());
    }
}