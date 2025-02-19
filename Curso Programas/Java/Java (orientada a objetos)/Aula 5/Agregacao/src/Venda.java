public class Venda {
    private Produto produto;
    private Vendedor vendedor;
    private Comprador comprador;

    public Venda(Produto produto, Vendedor vendedor, Comprador comprador) {
        this.produto = produto;
        this.vendedor = vendedor;
        this.comprador = comprador;
    }

    public void realizaVenda() {
        vendedor.vende(produto);
        produto.concretizaVenda();
        comprador.compra(produto);
    }

    public void cancelaVenda() {
        produto.cancelaVenda();
    }
}