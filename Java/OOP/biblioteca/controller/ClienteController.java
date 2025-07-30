package OOP.biblioteca.controller;

import OOP.biblioteca.model.Livros;
import OOP.biblioteca.model.Usuario;
import OOP.biblioteca.view.Menu;

import java.util.Scanner;

public class ClienteController {
    Menu menu = new Menu();
    private  SistemaDeUsuarios sistema;
    private  SistemaDeLivros sistemaDeLivros;
    public ClienteController(SistemaDeUsuarios sistema, SistemaDeLivros sistemaDeLivros){
        this.sistema = sistema;
        this.sistemaDeLivros = sistemaDeLivros;
    }


    public void permissao(Scanner sc){
        System.out.println("*** Faça seu login ***");
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();
        sc.nextLine();

        boolean encontrou = false;
        for (Usuario usuario : sistema.getUsuarios()){
            if(usuario.getNome().equalsIgnoreCase(nome) && usuario.getSenha() == senha){
                encontrou =true;
                processo(sc);
                break;
            }
        }
        if(!encontrou){
            System.out.println("Não encontrado!!");
            System.out.println(sistema.getUsuarios());
        }
    }
    public void processo (Scanner sc){
        System.out.println("*** Escolha uma função ***");
        System.out.println("""
                1 - Pegar um livro
                2 - Devolver um livro
                3 - Sair
                """);


        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao){
            case  1 -> pegarUmLivro (menu.getSc());
            case  2 -> devolverUmLivro(menu.getSc());
            case  3 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida");
        }
    }

    public void pegarUmLivro(Scanner sc){
        for(Livros livros : sistemaDeLivros.getLivros()){
            System.out.println(livros);
        }
    }
    public void  devolverUmLivro(Scanner sc){}
}
