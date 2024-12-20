public class Gerente extends Funcionario{
    private int equipeId;
    private String area;

    // construtor

    public Gerente(){

    }

    public Gerente(int numero, String nome, int equipeId, String area){
        super(numero, nome);
        this.equipeId = equipeId;
        this.area = area;
    }

    public int getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(int equipeId) {
        this.equipeId = equipeId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void imprimeDados(){
        System.out.println("Numero de funcionário: " + getNumero());
        System.out.println("Nome: " + getNome());
        System.out.println("Area: " + getArea());
        System.out.println("Equipe responsável: " + getEquipeId());
    }

    public void imprimeDados(char g){
        if (g == 'g'){
            System.out.println("Numero de funcionário: " + getNumero());
            System.out.println("Nome: " + getNome());
        }

    }

}
