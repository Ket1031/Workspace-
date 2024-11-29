import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        int fraseTamanho = frase.length();


        System.out.println("A frase tem "+fraseTamanho+" caracteres.");
        if(fraseTamanho >= 10) {
            System.out.println("Frase longa");
        }
        else {
            System.out.println("Frase curta");
        }



    }
}