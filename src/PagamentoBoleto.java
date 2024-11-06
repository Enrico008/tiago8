public class PagamentoBoleto extends Pagamento {
    @Override
    public void pagar() {
        System.out.println("pagamento realizado com boleto bancario.");
    }
}
