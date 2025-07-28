package OOP.tarefa;
import OOP.tarefa.model.Tarefa;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static OOP.tarefa.controller.Funcoes.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tarefa> tarefas = new ArrayList<>();
        String menu = String.format("""
            **** Suas Tarefas ****
            
            1 - Adicionar tarefa
            2 - Remover tarefa
            3 - Listar tarefas
            4- Marcar tarefa como concluída
            5 - Sair""");

        int opcao = 0;
        while (opcao !=5){
            try {
                System.out.println(menu);
                System.out.println("Escolha uma opção");

                opcao = sc.nextInt();

                switch (opcao){
                    case 1 -> adicionarTarefa(tarefas, sc);
                    case 2 -> removerTarefa(tarefas, sc);
                    case 3 -> listarTarefas(tarefas);
                    case 4 -> marcarTarefaConcluida(tarefas, sc);
                    case 5 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida!");
                }
            }catch (InputMismatchException e){
                System.out.println("Digite uma opção válida");
                sc.nextInt();
                opcao= 0;
            }
        }sc.close();
    }
}
