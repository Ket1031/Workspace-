import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(10) + 1;
        int resposta = 0;

        do {
            System.out.println("Adivinhe um numero entre 1 e 10: ");
            resposta = scanner.nextInt();

            if( numero == resposta){
                System.out.println("Parabéns! Você acertou.");
            }
            else {
                System.out.println("Tente novamente.");
            }
        }
        while (numero != resposta);

    }
}