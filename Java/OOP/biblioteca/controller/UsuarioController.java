package OOP.biblioteca.controller;

import OOP.biblioteca.model.Cliente;
import OOP.biblioteca.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioController {
    List<Usuario> usuarioList = new ArrayList<>();

    public void criarCliente(Scanner sc){
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite o número de acesso: ");
        int numeroDeAcesso = sc.nextInt();
        Cliente c = new Cliente(nome, idade, numeroDeAcesso);
        usuarioList.add(c);
    }

}
