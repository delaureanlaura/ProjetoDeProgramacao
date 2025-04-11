public class VendaService {
    private EstoqueService estoqueService;

    public VendaService(EstoqueService estoqueService){

        this.estoqueService = estoqueService;
    }

    public Venda registrarVenda(List<ItemVenda> itens) {

    }
    public double CalcularTotal(List<ItemVenda> itens) {

    }
    public void atualizarEstoque(List<ItemVenda> itens) {

    }
}
