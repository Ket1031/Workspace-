import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        int maiorNumero = numeros[0];
        int menorNumero = numeros[0];


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }
        }
        System.out.println("Marior valor: " + maiorNumero);
        System.out.println("Menor valor: " + menorNumero);
    }
}