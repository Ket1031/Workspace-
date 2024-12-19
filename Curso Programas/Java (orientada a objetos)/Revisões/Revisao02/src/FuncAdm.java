public class FuncAdm extends Funcionario{
    private String setor;
    private String funcao;

    // get e set setor

    public String getSetor(){
        return setor;
    }
    void setSetor(String setor){
        this.setor = setor;
    }

    // get e set funcao

    public String getFuncao(){
        return funcao;
    }
    void setFuncao(String funcao){
        this.funcao = funcao;
    }

    // construtor

    public FuncAdm(){

    }
    public FuncAdm(String setor, String funcao, double salario,
                   String nome, int idade, String endereco){
        this.setSetor(setor);
        this.setFuncao(funcao);
        this.setSalario(salario);
        this.setNome(nome);
        this.setIdade(idade);
        this.setEndereco(endereco);
    }

    public void exibirInformacoes() {
        System.out.println("Setor: " + getSetor());
        System.out.println("Função: " + getFuncao());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Salário: R$ " + getSalario());
        System.out.println("-------------------------");
    }
}
