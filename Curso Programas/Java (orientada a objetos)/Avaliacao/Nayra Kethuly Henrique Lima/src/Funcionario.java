public class Funcionario {
    private int numero;
    private String nome;

    // construtor

    public Funcionario(){

    }

    public Funcionario(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }


    // get e set numero

    public int getNumero(){
        return numero;
    }
    void setSetor(int numero){
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
}
