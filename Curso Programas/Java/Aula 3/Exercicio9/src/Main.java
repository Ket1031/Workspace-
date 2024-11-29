import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        int quebra = nomeCompleto.indexOf(" ");

        String primeiroNome = nomeCompleto.substring(0,quebra);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá,"+primeiroNome+ "!"+" Você tem "+idade+"anos.");

    }
}