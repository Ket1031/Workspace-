public class Main {
    public static void main(String[] args) {
        // Criação do Caixa Multibanco
        CaixaMultibanco caixa = new CaixaMultibanco();

        // Verificação de PIN antes de iniciar
        if (caixa.autenticar()) {
            // Criação de um cliente inicial
            Cliente clienteInicial = caixa.criarCliente(
                    "João Silva",
                    "123456789",
                    "Rua Principal, 123, Cidade, País",
                    "joao.silva@email.com",
                    "+351 912345678"
            );

            // Criação de contas para o cliente
            Conta conta1 = caixa.criarConta(clienteInicial);
            Conta conta2 = caixa.criarConta(clienteInicial);

            // Realizar algumas operações para demonstração
            conta1.depositar(1000.00);
            conta2.depositar(1500.50);

            conta1.levantar(200.00);
            conta2.levantar(300.25);

            // Iniciar o menu principal
            caixa.menuPrincipal();
        }
    }
}