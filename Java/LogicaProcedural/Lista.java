package LogicaProcedural;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String>tarefas = new ArrayList<>();
        while (true){
            System.out.println("Adicione um nova tarefa (digite 'sair' para parar!)");
            String novaTarefa = sc.nextLine();
            if(novaTarefa.equalsIgnoreCase("sair"))break;
            tarefas.add(novaTarefa);
        }

        System.out.println(tarefas);
        System.out.println("Remover Tarefa!");
        String tarefaRemovida = sc.nextLine();
        for(int i = 0 ; i < tarefas.size(); i ++){
            if(tarefas.isEmpty()  ){
                System.out.println("LogicaProcedural.Lista está vázia");
                break;
            } else if (!tarefas.contains(tarefaRemovida)) {
                System.out.println("Não tem essa tarefa na lista!");
                break;
            }
            else {
                tarefas.remove(tarefaRemovida);
                System.out.println("Tarefa Removida com sucesso!");
            }
        }

        System.out.println("Verificar se tem a tarefa na lista: Digite o nome:");
        String tarefaExisente = sc.nextLine();
        if(!tarefas.contains(tarefaExisente)) {
            System.out.println("A lista não contém essa tarefa!");
        }else {
            System.out.println("Existe essa tarefa na lista");
        }

        int tamanho = tarefas.size();
        System.out.printf("Existe %d tarefas lista", tamanho);
    }
}
