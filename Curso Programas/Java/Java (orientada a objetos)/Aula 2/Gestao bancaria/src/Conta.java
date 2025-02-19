import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    private List<String> extrato;
    private DecimalFormat df = new DecimalFormat("#.00");

    /**
     * Construtor para criar uma nova conta
     * @param numero Número da conta
     * @param titular Cliente titular da conta
     */
    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
    }

    /**
     * Método para depositar dinheiro
     * @param valor Quantia a depositar
     * @return true se depósito for bem-sucedido, false caso contrário
     */
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            extrato.add("Depósito: +" + df.format(valor) + "€");
            return true;
        }
        return false;
    }

    /**
     * Método para levantar dinheiro
     * @param valor Quantia a levantar
     * @return true se levantamento for bem-sucedido, false caso contrário
     */
    public boolean levantar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            extrato.add("Levantamento: -" + df.format(valor) + "€");
            return true;
        }
        return false;
    }

    /**
     * Método para consultar extrato
     */
    public void consultarExtrato() {
        System.out.println("Conta Número: " + numero);
        System.out.println("Titular: " + titular.getNome() + " (Nº Cliente: " + titular.getNumeroCli() + ")");
        System.out.println("Saldo atual: " + df.format(saldo) + "€");
        System.out.println("Histórico de Movimentos:");
        for (String movimento : extrato) {
            System.out.println(movimento);
        }
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
