package LogicaProcedural;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Funcoes {
    public  static void adicionarTarefa(List<String> tarefa, Scanner sc){
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        tarefa.add(nome);
    }

    public  static void removerTarefa(List<String> tarefas, Scanner sc){
        System.out.println("Digite o nome da tarefa!");
        String nome = sc.nextLine();
        if(tarefas.isEmpty()){
            System.out.println("Está vázia a lista");
        } else if (!tarefas.contains(nome)) {
        System.out.println("Não existe essa tarefa");
        }else {
            tarefas.remove(nome);
            System.out.println("Tarefa removida com sucesso");
        }
    }

    public  static void listarTarefas(List<String>tarefas){
        tarefas.forEach(t -> System.out.println(t));
    }

    public static void verificarTarefaExistente(List<String> tarefas, Scanner sc) {
        System.out.println("Digite o nome da tarefa para verificar:");
        String nome = sc.nextLine();
        if (tarefas.contains(nome)) {
            System.out.println(" A tarefa existe na lista!");
        } else {
            System.out.println(" A tarefa não foi encontrada.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();
        String menu = String.format("""
                ***** Sua lista de Tarefas *****
                1 ---- adicionarTarefa                
                2 ---- removerTarefa                
                3 ---- listarTarefas               
                4 ---- verificarTarefaExistente   
                5 ---- sair;
                """);

        int opcao = 0;
        while (opcao != 5)
                try {
                    System.out.println(menu);
                    System.out.print("Digite uma opção: ");
                    opcao = sc.nextInt();
                    sc.nextLine(); // limpar buffer

                    switch (opcao) {
                        case 1 -> adicionarTarefa(tarefas, sc);
                        case 2 -> removerTarefa(tarefas, sc);
                        case 3 -> listarTarefas(tarefas);
                        case 4 -> verificarTarefaExistente(tarefas, sc);
                        case 5 -> System.out.println("Saindo...");
                        default -> System.out.println("Opção inválida!");
                    }
                }catch (InputMismatchException e)
                {
                    System.out.println("Digite apenas números válidos!");
                    sc.nextInt();
                    opcao=0;
                }
        sc.close();
    }
}
