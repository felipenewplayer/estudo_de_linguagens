package OOP.veiculos.view;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public int menuPrincipal(){
        System.out.println("*** Escolha uma opção *** ");
        System.out.println("""
               1 - Criar um carro
               2 - Criar uma moto
               3 - Lista de veículuos
               4 - Sair
               """);
        return sc.nextInt();
    }
    public  void exibirMensagem(String msg){
        System.out.println(msg);
    }

    public  Scanner getSc (){
        return sc;
    }
}
