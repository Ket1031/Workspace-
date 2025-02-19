import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorInteiros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int contador = 0;

        System.out.println("Digite até 10 números inteiros (insira 0 para encerrar):");

        while (contador < 10) {
            try {
                System.out.printf("Digite o %dº número: ", contador + 1);
                int numero = scanner.nextInt();

                if (numero == 0) {
                    vetor[contador] = numero;
                    break;
                }

                vetor[contador] = numero;
                contador++;

            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um valor numérico inteiro.");
                scanner.nextLine(); // Limpar buffer do scanner
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Limite máximo de 10 números atingido.");
                break;
            }
        }

        // Imprimir vetor
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < contador + 1; i++) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}