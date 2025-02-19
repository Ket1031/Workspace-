public class Vendedor {
    private float comissao;

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public void vende(Produto produto) {
        // Implementação da lógica para o vendedor vender o produto
        System.out.println("Vendedor vendeu o produto.");
    }
}