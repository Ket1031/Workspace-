public class Main {
    public static void main(String[] args) {
        int idade = 20;
        int rendaMensal = 2500;

        if (idade >= 18 && rendaMensal >= 2000) {
            System.out.println("Elegível para o empréstimo");
        } else {
            System.out.println("Não elegível para o empréstimo");
        }
    }
}