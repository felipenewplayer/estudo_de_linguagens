package OOP.veiculos.controller;

import OOP.veiculos.model.Carro;
import OOP.veiculos.model.Moto;
import OOP.veiculos.model.Veiculos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class VeiculoController {
       List<Veiculos> veiculos  = new ArrayList<>();

       public void criarCarro(Scanner sc){
              System.out.println("Digite o nome do carro: ");
              String nome = sc.nextLine();
              System.out.println("Digite a marca do carro: ");
              String marca = sc.nextLine();
              System.out.println("Digite o nome do carro (dd/MM/yyyy)");
              String dataString = sc.nextLine();
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
              LocalDate data = LocalDate.parse(dataString,formatter);
              Veiculos c = new Carro(nome, marca, data);
              veiculos.add(c);
       }


       public void criarMoto(Scanner sc){
              System.out.println("Digite o nome do carro: ");
              String nome = sc.nextLine();
              System.out.println("Digite a marca do carro: ");
              String marca = sc.nextLine();
              System.out.println("Digite o nome do carro (dd/MM/yyyy)");
              String dataString = sc.nextLine();
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
              LocalDate data = LocalDate.parse(dataString,formatter);
              Veiculos m = new Moto(nome,marca, data);
              veiculos.add(m);
       }

       public void listaDeVeiculos(Scanner sc){
              for (Veiculos v : veiculos){
                     System.out.println(v);
              }

              System.out.println("Mostra por ano? (s/n)");
              String c = sc.next();
              if(c.equals("s")){
                     Map<LocalDate, List<Veiculos>> agrupado = veiculos.stream()
                             .sorted(Comparator.comparing(Veiculos::getAno))
                             .collect(Collectors.groupingBy(Veiculos::getAno));
                     agrupado.forEach((ano, list) ->
                             System.out.println("Ano: " + ano.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + list));
              } else if (c.equals("n")){
                     System.out.println("Voltando...");
              }else {
                     System.out.println("Iválido!");
              }

       }
}
