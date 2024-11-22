
public class Main {
    public static void main(String[] args) {
        float peso = 87;

        if (peso >= 72.3 && peso < 83.95) {
            System.out.println("Peso Leve");
        }
        else if (peso >= 83.95 && peso < 120.02) {
            System.out.println("Peso Médio");
        }
        else if (peso >= 120.02) {
            System.out.println("Peso Pesado");
        }
         else {
        System.out.println("Peso abaixo do limite.");
         }


    }
}