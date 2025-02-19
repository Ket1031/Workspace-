
public class Main {
    public static void main(String[] args) {

        forma r = new forma();
        forma r2 = new forma();

        r.largura = 25;
        r.comprimento = 10;

        r2.largura = 30;
        r2.comprimento = 25;

        System.out.println(" comprimento: " + r.comprimento + " largura: " + r.largura );
        System.out.println(" comprimento: " + r2.comprimento + " largura: " + r2.largura );


    }
}