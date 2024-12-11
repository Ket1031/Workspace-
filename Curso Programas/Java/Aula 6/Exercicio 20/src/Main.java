import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        String[] nomes = {"arroz","feijao","batata","macarrao","abacaxi","chocolate"};
        int[] quantidades = {3,4,12,3,1,175};

        Scanner s = new Scanner(System.in);


        /*Apresente um menu de opções ao usuário usando switch-case;
        Permite ao usuário adicionar uma quantidade a um produto existente.
        */

        System.out.println("Menu: ");
        System.out.println("1. Adicionar quantidade de produto. ");
        System.out.println("2. Subtrair quantidade de produto.");
        System.out.println("3. Exibir produtos.");
        System.out.println("4. Terminar programa.");
        System.out.println("Escolha uma opcao: ");

        int menu = s.nextInt();

        switch (menu) {
            case 1 :
                System.out.println("Digite o produto: ");
                String produto = s.nextLine();

                
        }


    }
}