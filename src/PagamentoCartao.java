public class PagamentoCartao extends Pagamento{
    @Override
    public void pagar() {
        System.out.println("pagamento realizdado com cartao de credito.");
    }
}
