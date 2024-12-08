import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaixaMultibanco {
    private List<Cliente> clientes;
    private List<Conta> contas;
    private String pinCorrecto;
    private Scanner scanner;

    public CaixaMultibanco() {
        clientes = new ArrayList<>();
        contas = new ArrayList<>();
        pinCorrecto = "1234";
        scanner = new Scanner(System.in);
    }

    // Métodos getters
    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Conta> getContas() {
        return contas;
    }

    /**
     * Método para criar um novo cliente
     * @param nome Nome do cliente
     * @param nif NIF do cliente
     * @return Cliente criado
     */
    public Cliente criarCliente(String nome, String nif, String morada, String email, String telefone) {
        Cliente cliente = new Cliente(nome, nif, morada, email, telefone);
        clientes.add(cliente);
        return cliente;
    }

    /**
     * Método para criar uma nova conta para um cliente
     * @param cliente Cliente titular da conta
     * @return Conta criada
     */
    public Conta criarConta(Cliente cliente) {
        int numeroConta = contas.size() + 1;
        Conta conta = new Conta(numeroConta, cliente);
        contas.add(conta);
        return conta;
    }

    public boolean autenticar() {
        int tentativas = 0;
        while (tentativas < 3) {
            System.out.print("Insira o PIN: ");
            String pin = scanner.nextLine();
            if (pin.equals(pinCorrecto)) {
                System.out.println("PIN correto. Bem-vindo!");
                return true;
            }
            tentativas++;
            System.out.println("PIN incorreto. Tentativas restantes: " + (3 - tentativas));
        }
        System.out.println("Número máximo de tentativas alcançado. Saindo...");
        return false;
    }

    public void menuPrincipal() {
        int opcao;
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Criar Cliente");
            System.out.println("2. Criar Conta");
            System.out.println("3. Consultar Extrato");
            System.out.println("4. Levantar");
            System.out.println("5. Depositar");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1 -> criarClienteMenu();
                case 2 -> criarContaMenu();
                case 3 -> consultarExtrato();
                case 4 -> realizarOperacao("levantar");
                case 5 -> realizarOperacao("depositar");
                case 6 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }

    private void criarClienteMenu() {
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("NIF: ");
        String nif = scanner.nextLine();
        System.out.print("Morada: ");
        String morada = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        Cliente novoCliente = criarCliente(nome, nif, morada, email, telefone);
        System.out.println("Cliente criado com sucesso. Número do cliente: " + novoCliente.getNumeroCli());
    }

    private void criarContaMenu() {
        if (clientes.isEmpty()) {
            System.out.println("Primeiro crie um cliente.");
            return;
        }

        System.out.println("Selecione um cliente para a nova conta:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i+1) + ". " + clientes.get(i).getNome());
        }

        System.out.print("Escolha o número do cliente: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        if (escolha < 1 || escolha > clientes.size()) {
            System.out.println("Seleção inválida.");
            return;
        }

        Cliente clienteSelecionado = clientes.get(escolha - 1);
        Conta novaConta = criarConta(clienteSelecionado);
        System.out.println("Conta criada com sucesso. Número da conta: " + novaConta.getNumero());
    }

    public void realizarOperacao(String tipo) {
        if (contas.isEmpty()) {
            System.out.println("Não existem contas cadastradas.");
            return;
        }

        System.out.println("Selecione uma conta:");
        for (int i = 0; i < contas.size(); i++) {
            Conta conta = contas.get(i);
            System.out.println((i+1) + ". Conta " + conta.getNumero() +
                    " - Titular: " + conta.getTitular().getNome());
        }

        System.out.print("Escolha o número da conta: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        if (escolha < 1 || escolha > contas.size()) {
            System.out.println("Seleção inválida.");
            return;
        }

        Conta conta = contas.get(escolha - 1);

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir nova linha

        if (tipo.equals("levantar")) {
            if (conta.levantar(valor)) {
                System.out.println("Levantamento efetuado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente ou valor inválido.");
            }
        } else if (tipo.equals("depositar")) {
            if (conta.depositar(valor)) {
                System.out.println("Depósito efetuado com sucesso.");
            } else {
                System.out.println("Valor inválido.");
            }
        }
    }

    public void consultarExtrato() {
        if (contas.isEmpty()) {
            System.out.println("Não existem contas cadastradas.");
            return;
        }

        System.out.println("Selecione uma conta para consultar o extrato:");
        for (int i = 0; i < contas.size(); i++) {
            Conta conta = contas.get(i);
            System.out.println((i+1) + ". Conta " + conta.getNumero() +
                    " - Titular: " + conta.getTitular().getNome());
        }

        System.out.print("Escolha o número da conta: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        if (escolha < 1 || escolha > contas.size()) {
            System.out.println("Seleção inválida.");
            return;
        }

        Conta contaSelecionada = contas.get(escolha - 1);
        contaSelecionada.consultarExtrato();
    }
}