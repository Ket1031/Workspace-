import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n======== MENU ========");
            System.out.println("1- Adicionar uma Tarefa");
            System.out.println("2- Listar as Tarefas");
            System.out.println("3- Remover uma Tarefa");
            System.out.println("4- Sair");
            System.out.println("======================");

            System.out.print("Escolha uma opção: ");
            int menuResposta = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (menuResposta) {
                case 1:
                    System.out.print("Digite a nova tarefa: ");
                    String novaTarefa = scanner.nextLine();
                    adicionarTarefa(novaTarefa, tarefas);
                    break;

                case 2:
                    listarTarefas(tarefas);
                    break;

                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas para remover!");
                    } else {
                        System.out.print("Digite o número da tarefa a remover (1-" + tarefas.size() + "): ");
                        int indexRemover = scanner.nextInt();
                        removerTarefa(indexRemover, tarefas);
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void adicionarTarefa(String tarefa, ArrayList<String> tarefas) {
        tarefas.add(tarefa);
        Collections.sort(tarefas);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public static void listarTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas na lista!");
            return;
        }

        System.out.println("\n==== TAREFAS ====");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + " - " + tarefas.get(i));
        }
    }

    public static void removerTarefa(int index, ArrayList<String> tarefas) {
        try {
            tarefas.remove(index - 1);
            System.out.println("Tarefa removida com sucesso!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Número de tarefa inválido!");
        }
    }
}