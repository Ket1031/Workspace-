import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int somatorioNotas = 0;
        int contador = 0;

        System.out.println("Digite um numero total para as notas: ");
        int totalNotas = s.nextInt();

        for (int i = 0; i < totalNotas; i++){
            System.out.println("Digite uma nota: ");
            int nota = s.nextInt();

            if( nota >= 0 && nota <= 20){
                somatorioNotas =  somatorioNotas + nota;
                contador++;

            }
            else{
                System.out.println("numero fora da margem permitida. tente novamente");
            }
        }

        int media = somatorioNotas/contador;

        System.out.println("A média das notas corresponde a: " + media);

        //sout
    }
}