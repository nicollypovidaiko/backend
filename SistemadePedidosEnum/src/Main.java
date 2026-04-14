public class Main {
    public static void main(String[] args) {
        // Criar um pedido
        Pedido pedido = new Pedido(1, "João Silva");
        System.out.println("Pedido criado: " + pedido.getStatus());

        pedido.avancarStatus();
        System.out.println("Status atualizado: " + pedido.getStatus());

        pedido.avancarStatus();
        System.out.println("Status atualizado: " + pedido.getStatus());

        pedido.cancelarPedido();
        System.out.println("Pedido cancelado");

        System.out.println("Status final: " + pedido.getStatus());
    }
}