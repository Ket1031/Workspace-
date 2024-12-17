import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] nomes = {"arroz","feijao","batata","macarrao","abacaxi","chocolate"};
        int[] quantidades = {3,4,12,3,1,175};

        Scanner scanner = new Scanner(System.in);
        int menu;


        do {
            System.out.println("Menu: ");
            System.out.println("1. Adicionar quantidade de produto. ");
            System.out.println("2. Subtrair quantidade de produto.");
            System.out.println("3. Exibir produtos.");
            System.out.println("4. Terminar programa.");
            System.out.println("Escolha uma opcao: ");

            menu = scanner.nextInt();

            switch (menu) {
                case 1 :
                    System.out.println("Digite o produto: ");
                    String produtoAdicionar = scanner.next();

                    for(int i = 0; i < nomes.length; i++){
                        if (produtoAdicionar.equals(nomes[i])) {
                            produtoAdicionar = nomes[i];
                            System.out.println(produtoAdicionar);
                            System.out.println(" Digite a quantia de deseja: ");
                            int produtoAdicionado = scanner.nextInt();
                            quantidades[i] = quantidades[i] + produtoAdicionado;
                            System.out.println("Valor Adicionado");

                            System.out.println("Valor atual: " + quantidades[i]);

                        }

                    }
                    break;
                case 2 :
                    System.out.println("Digite o produto: ");
                    String produtoSubtrair = scanner.next();

                    for(int i = 0; i < nomes.length; i++){
                        if (produtoSubtrair.equals(nomes[i])) {
                            produtoSubtrair = nomes[i];
                            System.out.println(produtoSubtrair);
                            System.out.println(" Digite a quantia de deseja: ");
                            int produtoAdicionado = scanner.nextInt();
                            quantidades[i] = quantidades[i] - produtoAdicionado;

                            if (quantidades[i] < 0){
                                System.out.println("Estoque esgotado. ");
                            }
                            else{
                                System.out.println("Valor Subtraido");
                                System.out.println("Valor atual: " + quantidades[i]);
                            }

                            break;

                        }
                    }

                case 3 :
                    for(int i = 0; i < nomes.length; i++){
                        System.out.println("produto: " + nomes[i]);
                        System.out.println("Quantidade: " + quantidades[i]);
                    }
            }

        }
        while (menu != 4);



    }
}