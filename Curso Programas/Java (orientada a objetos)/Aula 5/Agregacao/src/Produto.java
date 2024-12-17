public class Produto {
    private float preco;
    private int tamanho;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void concretizaVenda() {
        // Implementação da lógica para concretizar a venda
        System.out.println("Venda concretizada.");
    }

    public void cancelaVenda() {
        // Implementação da lógica para cancelar a venda
        System.out.println("Venda cancelada.");
    }
}