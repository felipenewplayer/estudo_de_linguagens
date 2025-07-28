package OOP.Jogo.view;

import java.util.Scanner;

public class MenuView {
    Scanner sc = new Scanner(System.in);

    public int menuPrincipal(){
        System.out.println("**** Escolha uma opção ****");
        System.out.println("""
                        1 - Adicionar guerreiro
                        2 - Adicionar mago
                        3 - Status do personagem
                        4 - Sair
                        """);
        return sc.nextInt();
    }

    public void exibirMensagem(String msg){
        System.out.println(msg);
    }

    public  Scanner getSc(){
        return sc;
    }
}
