// Classe Pessoa (classe base)
class Pessoa {
    private String primeiroNome;
    private String ultimoNome;

    // Construtores
    public Pessoa() {}

    public Pessoa(String primeiroNome, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    // Métodos getters
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }
}

// Classe Empregado (subclasse de Pessoa)
class Empregado extends Pessoa {
    private int idEmpregado;
    private String cargo;

    // Construtor
    public Empregado(String primeiroNome, String ultimoNome, int idEmpregado, String cargo) {
        super(primeiroNome, ultimoNome);
        this.idEmpregado = idEmpregado;
        this.cargo = cargo;
    }

    // Método para obter ID do empregado
    public int getIdEmpregado() {
        return idEmpregado;
    }

    // Sobrescrevendo método getUltimoNome para incluir o cargo
    @Override
    public String getUltimoNome() {
        return super.getUltimoNome() + " - " + cargo;
    }
}