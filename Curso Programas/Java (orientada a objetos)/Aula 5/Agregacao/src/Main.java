public class Main {

    public static void main(String[] args) {

        // Exemplo de uso
        Produto produto = new Produto();
        produto.setPreco(10.0f);
        produto.setTamanho(5);

        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(2.0f);

        Comprador comprador = new Comprador();

        Venda venda = new Venda(produto, vendedor, comprador);
        venda.realizaVenda();
        venda.cancelaVenda();
    }
}
