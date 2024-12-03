public class Main {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i <= 50; i++) {
            if ( i % 2 == 0){
                soma = soma + i;
            }
        }
        System.out.println("A soma dos numeros pares de 1 a 50 é: "+soma);
    }
}