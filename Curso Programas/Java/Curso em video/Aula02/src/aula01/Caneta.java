package aula01;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor:  " + this.cor);
        System.out.println("Ponta: " + ponta);
        System.out.println("Carga: " + carga);
        if (tampada){
            System.out.println("Tampada ");
        }else {
            System.out.println("Destampada ");
        }
    }

    public void rabiscar(){
        if (tampada){
            System.out.println("Erro, caneta tampada");
        }
        else {
            System.out.println("Rabiscando..");
        }
    }
    public void tampar(){
        tampada = true;
    }
    public void destampar(){
        tampada = false;
    }
}

//Privado so quem ta na classe pode mecher
//publico todos podem mecher
//Protegido so minha mae e os filhos dela