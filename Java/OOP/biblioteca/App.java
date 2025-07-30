package OOP.biblioteca;

import OOP.biblioteca.controller.ClienteController;
import OOP.biblioteca.controller.FuncionarioController;
import OOP.biblioteca.controller.SistemaDeLivros;
import OOP.biblioteca.controller.SistemaDeUsuarios;
import OOP.biblioteca.view.Menu;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int opcaoPrincipal = 0;
        SistemaDeUsuarios sistema = new SistemaDeUsuarios();
        SistemaDeLivros livros = new SistemaDeLivros();
        FuncionarioController fc = new FuncionarioController(sistema, livros);
        ClienteController cl = new ClienteController(sistema, livros);
        while (opcaoPrincipal != 5){
            try{
                opcaoPrincipal = menu.menuPrincipal();
                menu.getSc().nextLine();
                switch (opcaoPrincipal){
                    case 1 -> fc.permissao(menu.getSc());
                    case 2 -> cl.permissao(menu.getSc());
                    case 5 -> System.out.println("Saindo...");
                    default -> System.out.println("Invalido");
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
