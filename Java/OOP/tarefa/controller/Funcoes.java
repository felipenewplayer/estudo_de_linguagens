package OOP.tarefa.controller;

import OOP.tarefa.model.Status;
import OOP.tarefa.model.Tarefa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Funcoes {
    public  static void adicionarTarefa(List<Tarefa> tarefa, Scanner sc){
        sc.nextLine();
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite a data (dd/MM/yyyy)");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataStr = sc.nextLine();
        LocalDate data = LocalDate.parse(dataStr, formatter);
        tarefa.add(new Tarefa(nome,data, Status.PENDENTE));
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public  static void removerTarefa(List<Tarefa> tarefas, Scanner sc){
        listarTarefas(tarefas);
        System.out.println("Digite o número da tarefa a remover!");
        int indice = sc.nextInt();
        sc.nextLine();
        if(indice > 0 && indice <= tarefas.size()){
           tarefas.remove(indice-1);
            System.out.println("Tarefa removida com sucesso!");
        }else {
            System.out.println("Indice inválido");
        }
    }

    public  static void listarTarefas(List<Tarefa>tarefas){
        if(tarefas.isEmpty()){
            System.out.println("LogicaProcedural.Lista está vazia");
        }else {
            tarefas.forEach(tarefa -> System.out.println(tarefa));
        }


    }


    public static void marcarTarefaConcluida(List<Tarefa> tarefas, Scanner sc){
        listarTarefas(tarefas);
        System.out.println("Digite o número da tarefa!");
        int indice = sc.nextInt();
        sc.nextLine();
        if(indice > 0 && indice <= tarefas.size()){
            tarefas.get(indice-1).marcarComoConcluido();
            System.out.println("Tarefa concluída!");
        }else {
            System.out.println("Indice inválido");
        }
    }

}
