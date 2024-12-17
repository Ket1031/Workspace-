package aula01;

public class aula02 {
    public static void main(String[] args){

        Caneta c1 = new Caneta();

        c1.modelo = "bic cristal";
        c1.cor = "azul";
        //c1.ponta = 0.5F;
        c1.carga = 80;
        //c1.tampada = false;

        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
