import java.util.ArrayList;
import java.util.Scanner;

public class GestaoDeProdutos {
    private ArrayList<Produto> produtos;

    // Construtor
    public GestaoDeProdutos() {
        this.produtos = new ArrayList<>();
    }

    // Metodo para adicionar produto
    public void adicionarProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto:");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    // Metodo para listar produtos
    public void listarProdutos() {
        System.out.println("\n==== LISTA DE PRODUTOS ====");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    // Metodo para remover produto
    public void removerProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto a remover:");
        String nomeRemover = scanner.nextLine();

        produtos.removeIf(produto -> produto.getNome().equals(nomeRemover));
        System.out.println("Produto removido com sucesso!");
    }

    // Metodo principal
    public static void main(String[] args) {
        GestaoDeProdutos gestao = new GestaoDeProdutos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar Produto\n2. Listar Produtos\n3. Remover Produto\n4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gestao.adicionarProduto();
                    break;
                case 2:
                    gestao.listarProdutos();
                    break;
                case 3:
                    gestao.removerProduto();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
