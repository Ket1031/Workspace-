public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int numero = 3;

        switch (numero) {
            case 1:
                System.out.println("Variável é igual a 1");
                break;
            case 2:
                System.out.println("Variável é igual a 2");
                break;
            case 3:
                System.out.println("Variável é igual a 3");
                break;
            case 4:
                System.out.println("Variável é igual a 4");
                break;

            default:
                System.out.println("Default");
                break;
        }
    }
}