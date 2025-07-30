package OOP.biblioteca.view;

import java.util.Scanner;

public class Menu {
            Scanner sc = new Scanner(System.in);
            public int menuPrincipal(){
                System.out.println("""
                **** Seja Bem-vindo ****
                Você é Cliente ou Funcionário
                """);

                System.out.println("""
                        1 - Funcionário
                        2 - Cliente
                        """);
                return  sc.nextInt();
            }

            public void exibirMensagem(String msg){
                System.out.println(msg);;
            }
            public Scanner getSc() {return sc;}

}
