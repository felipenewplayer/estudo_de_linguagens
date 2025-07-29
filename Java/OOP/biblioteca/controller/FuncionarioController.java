package OOP.biblioteca.controller;

import OOP.biblioteca.model.Usuario;

import java.util.Scanner;

public class FuncionarioController {
    UsuarioController controller = new UsuarioController();
    public void permissao(Scanner sc){
        int opcao = 0
                ;
        while (opcao !=9){
            System.out.println("Escolha uma função");
             opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1 -> controller.criarCliente(sc);
                case 2 -> controller.listaDeClientes(sc);
                case 3 -> controller.editarCliente(sc);
                case 4 -> controller.ExcluirCliente(sc);
                case 5 -> controller.adicionarLivros(sc);
                case 6 -> controller.listaDeLivros(sc);
                case 7 -> controller.excluirLivro(sc);
                case 8 -> controller.editarLivro(sc);
                case 9 -> System.out.println("Saindo");
                default -> System.out.println("Opçãp inválida");
            }
        }
    }

}
