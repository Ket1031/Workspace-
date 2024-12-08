public class Main {
    public static void main(String[] args) {

        int[] numeros = {10,20,30,40,50};
        int[] numerosInverso = new int[5];

        for(int i = 4; i > 0; i--){

            numerosInverso[4-i] = numeros[i];
        }

        for(int i = 0; i < numeros.length ; i++){
            System.out.print(numerosInverso[i] + " ");
        }

    }
}