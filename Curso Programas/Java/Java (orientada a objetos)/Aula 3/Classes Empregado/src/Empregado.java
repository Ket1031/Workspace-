public class Empregado {
    // Atributos
    private String nome;
    private String departamento;
    private double horasNormaisTrabalhadasNoMes;
    private double horasExtrasTrabalhadasNoMes;
    private double salarioPorHoraNormal;
    private double salarioPorHoraExtra;

    // Construtor
    public Empregado(String nome, String departamento,
                     double horasNormaisTrabalhadasNoMes,
                     double horasExtrasTrabalhadasNoMes,
                     double salarioPorHoraNormal,
                     double salarioPorHoraExtra) {
        this.nome = nome;
        this.departamento = departamento;
        this.horasNormaisTrabalhadasNoMes = horasNormaisTrabalhadasNoMes;
        this.horasExtrasTrabalhadasNoMes = horasExtrasTrabalhadasNoMes;
        this.salarioPorHoraNormal = salarioPorHoraNormal;
        this.salarioPorHoraExtra = salarioPorHoraExtra;
    }

    // Método para mostrar todos os dados do empregado
    public void mostraDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Horas Normais Trabalhadas: " + horasNormaisTrabalhadasNoMes);
        System.out.println("Horas Extras Trabalhadas: " + horasExtrasTrabalhadasNoMes);
        System.out.println("Salário por Hora Normal: R$ " + salarioPorHoraNormal);
        System.out.println("Salário por Hora Extra: R$ " + salarioPorHoraExtra);
    }

    // Método para calcular salário mensal
    public double calculaSalarioMensal() {
        return (horasNormaisTrabalhadasNoMes * salarioPorHoraNormal) +
                (horasExtrasTrabalhadasNoMes * salarioPorHoraExtra);
    }

    // Método para calcular salário mensal com bônus para Direção
    public double calculaSalarioMensalBonus() {
        double salarioBase = calculaSalarioMensal();

        // Adiciona 10% de bônus se for do departamento de Direção
        if (departamento.equalsIgnoreCase("Direção")) {
            return salarioBase * 1.1; // 10% de bônus
        }

        return salarioBase;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getHorasNormaisTrabalhadasNoMes() {
        return horasNormaisTrabalhadasNoMes;
    }

    public void setHorasNormaisTrabalhadasNoMes(double horasNormaisTrabalhadasNoMes) {
        this.horasNormaisTrabalhadasNoMes = horasNormaisTrabalhadasNoMes;
    }

    public double getHorasExtrasTrabalhadasNoMes() {
        return horasExtrasTrabalhadasNoMes;
    }

    public void setHorasExtrasTrabalhadasNoMes(double horasExtrasTrabalhadasNoMes) {
        this.horasExtrasTrabalhadasNoMes = horasExtrasTrabalhadasNoMes;
    }

    public double getSalarioPorHoraNormal() {
        return salarioPorHoraNormal;
    }

    public void setSalarioPorHoraNormal(double salarioPorHoraNormal) {
        this.salarioPorHoraNormal = salarioPorHoraNormal;
    }

    public double getSalarioPorHoraExtra() {
        return salarioPorHoraExtra;
    }

    public void setSalarioPorHoraExtra(double salarioPorHoraExtra) {
        this.salarioPorHoraExtra = salarioPorHoraExtra;
    }
}