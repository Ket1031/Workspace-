public class TesteExcecao {
    // Método que lança a exceção personalizada
    public static void teste() throws MinhaExcecao {
        // Lança uma nova instância da exceção personalizada
        throw new MinhaExcecao();
    }

    public static void main(String[] args) {
        // Inicializa a variável de exceção como nula
        MinhaExcecao me = null;

        try {
            // Bloco try: primeira coisa a ser executada
            // Imprime "try" antes de chamar o método que lançará a exceção

            System.out.println("try ");

            // Chama o método que lança a exceção personalizada
            teste();
        } catch (MinhaExcecao e) {
            // Bloco catch: captura a exceção personalizada MinhaExcecao
            // Imprime "catch" quando a exceção é capturada
            System.out.println("catch ");

            // Atribui a exceção capturada à variável me
            me = e;
        } finally {
            // Bloco finally: sempre executado, independentemente de exceção
            // Imprime "finally" 
            System.out.println("finally ");
        }

        // Após todos os blocos, imprime "fim"
        System.out.println("fim");
    }
}
