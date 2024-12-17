import java.util.InputMismatchException;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1 = 0, numero2 = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                // Solicitar primeiro número
                System.out.print("Digite o primeiro número: ");
                numero1 = scanner.nextDouble();

                // Solicitar segundo número
                System.out.print("Digite o segundo número: ");
                numero2 = scanner.nextDouble();

                // Realizar divisão
                double resultado = numero1 / numero2;
                System.out.printf("Resultado da divisão: %.2f\n", resultado);
                entradaValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um valor numérico válido.");
                scanner.nextLine(); // Limpar buffer do scanner
            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        }

        scanner.close();
    }
}