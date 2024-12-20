public class Main {
    public static void main(String[] args) {

        Gerente G1 = new Gerente(1, "joao", 26, "RH");

        System.out.println("Dados completos Gerente");
        G1.imprimeDados();

        System.out.println("Dados de funcionário Gerente");
        G1.imprimeDados('g');

    }
}