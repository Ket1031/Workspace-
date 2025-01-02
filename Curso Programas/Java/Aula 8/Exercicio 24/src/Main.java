import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class Main {
    public static void main(String[] args) {



        /*
         Crie uma ArrayList de números inteiros e faça as seguintes operações:
        Adicione os números 10, 20, 30, 40 e 50.Imprima o terceiro número da
        lista.Remova o número 20.Imprima todos os números restantes.;
         */

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        int indice = numeros.get(2);
        System.out.println("resposta: " + indice);

        numeros.remove(Integer.valueOf(20));

        System.out.println(numeros);
    }
}