public class Main {
    public static void main(String[] args) {
        // Criando empregados de diferentes departamentos
        Empregado funcionario1 = new Empregado(
                "João Silva",       // nome
                "Vendas",           // departamento
                160,                // horas normais no mês
                20,                 // horas extras no mês
                25.50,              // salário por hora normal
                38.25               // salário por hora extra
        );

        Empregado funcionario2 = new Empregado(
                "Maria Souza",      // nome
                "Direção",          // departamento
                160,                // horas normais no mês
                10,                 // horas extras no mês
                50.00,              // salário por hora normal
                75.00               // salário por hora extra
        );

        // Mostrando dados dos funcionários
        System.out.println("Dados do Funcionário 1:");
        funcionario1.mostraDados();
        System.out.println("\nSalário Mensal: R$ " + funcionario1.calculaSalarioMensal());
        System.out.println("Salário Mensal com Bônus: R$ " + funcionario1.calculaSalarioMensalBonus());

        System.out.println("\n-------------------\n");

        System.out.println("Dados do Funcionário 2:");
        funcionario2.mostraDados();
        System.out.println("\nSalário Mensal: R$ " + funcionario2.calculaSalarioMensal());
        System.out.println("Salário Mensal com Bônus: R$ " + funcionario2.calculaSalarioMensalBonus());
    }
}