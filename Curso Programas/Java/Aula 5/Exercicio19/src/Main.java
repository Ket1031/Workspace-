public class Main {
    public static void main(String[] args) {

        int soma = 0;
        int indice = 0;
        int indiceImpar = 0;
        int[] numerosImpares = new int[5];

        int[] numeros = {10,11,12,13,14};

        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                soma = soma + numeros[i] ;
            }
        }
        while (indice < numerosImpares.length){
            if(numeros[indice] % 2 != 0){
                numerosImpares[indiceImpar] = numeros[indice];
                indiceImpar++;
            }
            indice++;
        }

        System.out.println("Soma dos numeros pares: " + soma);
        System.out.println("Array de numeros impares: ");
        for(int i = 0; i < indiceImpar; i++){
            System.out.print(numerosImpares[i] + " ");
        }
    }
}