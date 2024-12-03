import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        while (numero < 1 || numero > 10){

            System.out.println("Digite um valor entre 1 e 10: ");
            numero = scanner.nextInt();

            if (numero > 10){
                System.out.println("Número inválido. Tente novamente. ");
            }
            else if (numero < 1){
                System.out.println("Número inválido. Tente novamente. ");
            }
            else{
                System.out.println("Número válido: "+numero);
            }
        }
    }
}