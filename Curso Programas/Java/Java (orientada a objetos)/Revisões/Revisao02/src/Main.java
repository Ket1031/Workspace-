import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // ArrayList para armazenar 5 objetos FuncAdm
        ArrayList<FuncAdm> funcAdmObjetos = new ArrayList<>(5);

        // Criando e adicionando objetos ao ArrayList
        funcAdmObjetos.add(new FuncAdm("01", "Limpeza", 1400.4, "Gabi", 19, "Rua 1"));
        funcAdmObjetos.add(new FuncAdm("02", "Manutenção", 1800.0, "João", 25, "Rua 2"));
        funcAdmObjetos.add(new FuncAdm("03", "Administração", 2000.5, "Ana", 30, "Rua 3"));
        funcAdmObjetos.add(new FuncAdm("04", "TI", 2500.0, "Lucas", 28, "Rua 4"));
        funcAdmObjetos.add(new FuncAdm("05", "RH", 1900.8, "Maria", 26, "Rua 5"));

        for (FuncAdm funcionario : funcAdmObjetos) {
            funcionario.exibirInformacoes();
        }
    }
}