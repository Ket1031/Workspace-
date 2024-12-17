package aula04;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    //metodo construtor sempre tem o mesmo nome da classe
    //use sempre this. para referir a objetos na classe
    // nao tem retorno (sem void)

    public Caneta(String m,String c, float p) {
        this.modelo = m; //define no metodo construtor
        this.cor = c;
        this.setPonta(p);  //define os parametros no get e chama no metodo construtor
        this.tampar();

    }

    public String getModelo(){
        return this.modelo;
    }

    // GET retorna o objeto e tem que ser do mesmo tipo (string) não void

    public void setModelo(String m){
        this.modelo = m;
    }

    //SET tem que ter um parametro que tambem sera do mesmo tipo do objeto

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("about caneta");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: "  + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " +  this.tampada);
    }
}
