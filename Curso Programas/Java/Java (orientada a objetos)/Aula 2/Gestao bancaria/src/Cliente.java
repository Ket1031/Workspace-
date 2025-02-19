public class Cliente {
    private String nome;
    private String nif;
    private String morada;
    private String email;
    private String telefone;
    private int numeroCli; // Número único de cliente
    private static int contadorClientes = 1; // Contador estático para gerar números de cliente

    /**
     * Construtor para criar um novo cliente com informações detalhadas
     * @param nome Nome completo do cliente
     * @param nif NIF do cliente
     * @param morada Endereço do cliente
     * @param email Email do cliente
     * @param telefone Telefone do cliente
     */
    public Cliente(String nome, String nif, String morada, String email, String telefone) {
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.email = email;
        this.telefone = telefone;
        this.numeroCli = contadorClientes++; // Gera número único de cliente
    }

    /**
     * Método para mostrar dados do cliente
     * @param tipo 'r' para resumido, 't' para todos os dados
     * @return String com os dados do cliente
     */
    public String mostrarDados(char tipo) {
        if (tipo == 'r') {
            return String.format("Número Cliente: %d - Nome: %s", numeroCli, nome);
        } else if (tipo == 't') {
            return String.format(
                    "Detalhes do Cliente:\n" +
                            "Número Cliente: %d\n" +
                            "Nome: %s\n" +
                            "NIF: %s\n" +
                            "Morada: %s\n" +
                            "Email: %s\n" +
                            "Telefone: %s",
                    numeroCli, nome, nif, morada, email, telefone
            );
        }
        return "";
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNif() {
        return nif;
    }

    public int getNumeroCli() {
        return numeroCli;
    }

    public String getMorada() {
        return morada;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}