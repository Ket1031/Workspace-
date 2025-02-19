public class Lampada {
    public String tipo;
    public String cor;
    public int wats;
    public boolean estado;

    public Lampada(){

    }
    public Lampada(String tipo, String cor, int wats, boolean estado){
        this.tipo = tipo;
        this.cor = cor;
        this.wats = wats;
        this.tipo = tipo;
        this.estado = estado;
    }

    public void estaLigada(){
        if(estado){
            System.out.println("Está ligada");
        }
        else {
            System.out.println("Está desligada");
        }
    }

    public void economica(){
        if (wats < 40){
            System.out.println("É economica");
        }
        else {
            System.out.println("Não é economica");
        }
    }


}
