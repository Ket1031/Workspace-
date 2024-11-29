import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digire uma palavra: ");
        String palavraUm = scanner.nextLine();

        System.out.println("digite outra palavra: ");
        String palavraDois = scanner.nextLine();

        boolean retornoEquals = palavraUm.equals(palavraDois);

        boolean retornoEqualsIgnore = palavraUm.equalsIgnoreCase(palavraDois);

        System.out.println("As palavras são exatamente iguais? "+retornoEquals);
        System.out.println("As palavras são iguais ignorando maiúsculas/minúsculas? "+retornoEqualsIgnore);


    }
}