package aula01;

public class aula02 {
    public static void main(String[] args){

        //chamada de atributo

        Caneta c1 = new Caneta();
        c1.modelo = "Esferografica";
        c1.cor = "Azul";
        c1.ponta = 0.5F;
        c1.tampada = false;

        //chamada de metodo

        c1.tampar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo =  "Bic";
        c2.cor = "Vermelha";
        c2.ponta = 0.7f;
        c2.tampada = true;
        c2.status();
        c2.destampar();
        c2.rabiscar();
    }
}
