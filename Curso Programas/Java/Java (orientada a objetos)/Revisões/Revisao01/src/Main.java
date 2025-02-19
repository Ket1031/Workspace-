public class Main {
    public static void main(String[] args) {

        Lampada L1 = new Lampada("florecente", "amarela", 45, true );
        Lampada L2 = new Lampada("encandecente", "branca", 25, false );


        L1.estaLigada();
        L2.estaLigada();
        L1.economica();
        L2.economica();
    }
}