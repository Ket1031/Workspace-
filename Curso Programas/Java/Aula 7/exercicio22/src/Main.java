public class Main {
     public static void main(String[] args) {

        String texto = "Hello World";
        String textoInvertido = inverterString(texto);
        System.out.println("A string invertida é: " + textoInvertido);
    }

    public static String inverterString(String str) {
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        return invertida;
    }


}
