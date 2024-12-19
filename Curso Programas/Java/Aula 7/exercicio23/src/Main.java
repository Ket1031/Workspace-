public class Main {
    public static void main(String[] args) {
        int numero = 7;
        String resultado = verificarParOuImpar(numero);
        System.out.println("O número " + numero + " é: " + resultado);
    }
    public static String verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }

}