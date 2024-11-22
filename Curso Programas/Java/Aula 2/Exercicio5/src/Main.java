//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float notaUm = 9;
        float notaDois = 10;
        float notaTres = 10;

        float media = (notaUm + notaDois + notaTres)/3;

        if (media <= 6){
            System.out.println("Reprovado!");
        }
        else if (media >= 6 && media < 9.5){
            System.out.println(("Recuperacao"));
        }
        else {
            System.out.println("Aprovado!");
        }
    }
}