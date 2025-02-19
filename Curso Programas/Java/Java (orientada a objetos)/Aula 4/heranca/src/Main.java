
public class Main {
    public static void main(String[] args) {

        System.out.println("Atvidade 1");

        Animal animal = new Animal();
        Gato gato = new Gato();

        animal.fazSom(); // Imprime: O Animal emite um som
        gato.fazSom();   // Imprime: O Gato mia

        System.out.println("Atividade 2");

        // Classe principal para testar
        Pessoa pessoa = new Pessoa("João", "Silva");
        Empregado empregado = new Empregado("Maria", "Souza", 1234, "Gerente");

        System.out.println("Primeiro nome da Pessoa: " + pessoa.getPrimeiroNome());
        System.out.println("Último nome da Pessoa: " + pessoa.getUltimoNome());

        System.out.println("Primeiro nome do Empregado: " + empregado.getPrimeiroNome());
        System.out.println("Último nome do Empregado: " + empregado.getUltimoNome());
        System.out.println("ID do Empregado: " + empregado.getIdEmpregado());

    }
}