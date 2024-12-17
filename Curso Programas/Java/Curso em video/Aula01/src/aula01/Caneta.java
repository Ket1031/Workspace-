package aula01;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
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

    void rabiscar(){
        if (tampada){
            System.out.println("Erro");
        }
        else {
            System.out.println("Rabisco");
        }
    }
    void tampar(){
        tampada = true;
    }
    void destampar(){
        tampada = false;
    }
}

//sempre que modificar um objeto na proproa classe use o this