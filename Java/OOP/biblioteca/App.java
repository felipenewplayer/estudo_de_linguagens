package OOP.biblioteca;

import OOP.biblioteca.controller.FuncionarioController;
import OOP.biblioteca.model.Funcionario;
import OOP.biblioteca.view.Menu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int opcaoPrincipal = 0;
        int opcaoSecundaria = 0;
        FuncionarioController funcionario = new FuncionarioController();
        while (opcaoSecundaria != 5){
            try{
                switch (opcaoPrincipal){
                    case 1 -> funcionario.permissao(menu.getSc());
                    case 2 -> clientePermissao(menu.getSc());
                    case 5 -> System.out.println("Saindo...");
                    default -> System.out.println("Invalido");
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
