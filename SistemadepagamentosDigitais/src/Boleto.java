import java.time.LocalDate;

public class Boleto extends Pagamento{

    private String codigoBarras;
    private LocalDate dataVencimento;

    public Boleto(double valor, String codigoBarras, LocalDate dataVencimento) {
        super(valor," ");
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean validar() {

        if (super.getValor() <= 0) {
            System.out.println("Valor inválido");
            return false;
        } else if (codigoBarras == null || codigoBarras.length() < 10) {

            System.out.println("Código de barras inválido");
            return false;
        }
        else if (dataVencimento.isBefore(LocalDate.now())) {
            System.out.println("Boleto vencido");
            return false;
        }

        return true;
    }  @Override
    public void processar() {
        System.out.println("Boleto gerado com sucesso!");
    }

}