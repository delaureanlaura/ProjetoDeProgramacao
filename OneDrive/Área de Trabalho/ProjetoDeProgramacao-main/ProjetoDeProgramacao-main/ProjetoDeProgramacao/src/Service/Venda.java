import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private int id;
    private List<Produto> produtosVendidos = new ArrayList<>();
    private double valorTotal;
    private Date dataVenda;

    public Venda(int id, List<Produto> produtosVendidos, double valorTotal, Date dataVenda) {
        this.id = id;
        this.produtosVendidos = produtosVendidos;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
    }

    public int getId() {
        return id;
    }

    public List<Produto> getProdutosVendidos() {
        return produtosVendidos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", produtosVendidos=" + produtosVendidos +
                ", valorTotal=" + valorTotal +
                ", dataVenda=" + dataVenda +
                '}';
    }
}