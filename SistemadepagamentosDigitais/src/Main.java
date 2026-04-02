import java.time.LocalDate;

void main() {
    // --- BOLETO ---
    Pagamento boleto = new Boleto(
            890.00,
            "1234567890123",
            LocalDate.now().plusDays(5)
    );

    // --- PIX ---
    Pagamento pix = new Pix(
            200.0,
            "Luan"
    );

    // --- CARTÃO DE CRÉDITO ---
    Pagamento cartao = new Cartao(
            100.0,           // valor da compra
            "Marta",
            500.0            // limite do cartão
    );

    System.out.println(("=== Tentativa de pagamento Boleto ==="));
    if (boleto.validar()) {
        boleto.processar();
    } else {
        System.out.println("Boleto inválido!");
    } System.out.println("\n=== Tentativa de pagamento Pix ===");
    if (pix.validar()) {
        pix.processar();
    } else {
        System.out.println("Pix inválido!");
    }

    System.out.println("\n=== Tentativa de pagamento Cartão de Crédito ===");
    if (cartao.validar()) {
        cartao.processar();
    } else {
        System.out.println("Pagamento no cartão recusado!");
    }

    // --- Teste Cartão com limite insuficiente ---
    Pagamento cartaoExcedido = new Cartao(
            600.0,           // valor maior que limite
            "Pedro",
            500.0
    );

    System.out.println("\n=== Tentativa de pagamento Cartão com limite insuficiente ===");
    if (cartaoExcedido.validar()) {
        cartaoExcedido.processar();
    } else {
        System.out.println("Pagamento no cartão recusado!");
    }
}