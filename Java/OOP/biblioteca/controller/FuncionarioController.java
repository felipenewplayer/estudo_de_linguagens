package OOP.biblioteca.controller;


import OOP.biblioteca.dao.ClienteDao;
import OOP.biblioteca.model.Cliente;
import OOP.biblioteca.model.Livros;
import OOP.biblioteca.model.Usuario;

import java.util.Scanner;

public class FuncionarioController {

    private  SistemaDeUsuarios sistema;
    private  SistemaDeLivros sistemaDeLivros;
    private ClienteDao clienteDao = new ClienteDao();
    public FuncionarioController(SistemaDeUsuarios sistema, SistemaDeLivros sistemaDeLivros) {
        this.sistema = sistema;
        this.sistemaDeLivros = sistemaDeLivros;
    }
    public void permissao(Scanner sc){
        int opcao = 0;
        while (opcao !=9){
            System.out.println("*** Escolha uma função ***");
            System.out.println("""
                    1 - Adicionar Cliente.
                    2 - Lista de Clientes.
                    3 - Eitar Cliente.
                    4 - Excluir Cliente.
                    5 - Adicionar Livro.
                    6 - Listar de Livros.
                    7 - Editar Livro.
                    8 - Excluir Livro.
                    9 - Sair
                    """);
             opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1 -> criarCliente(sc);
                case 2 -> listaDeClientes();
                case 3 -> editarCliente(sc);
//              case 4 -> ExcluirCliente(sc);
                case 5 ->  adicionarLivros(sc);
                case 6 -> listaDeLivros();
//              case 7 -> .excluirLivro(sc);
//              case 8 -> .editarLivro(sc);
                case 9 -> System.out.println("Saindo");
                default -> System.out.println("Opção inválida");
            }
        }
    }

    public void criarCliente(Scanner sc){
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a senha");
        int senha = sc.nextInt();

        System.out.print("Digite o número de acesso: ");
        int numeroDeAcesso = sc.nextInt();
        Cliente c = new Cliente(nome, idade,senha, numeroDeAcesso);
        sistema.adicionarUsuario(c);
        clienteDao.salvar(c);
        System.out.println("Cliente adicionado com sucesso!");
    }

    public void listaDeClientes(){
        System.out.println("*** Lista de Clientes ***");
        System.out.println("*************************");
        if(clienteDao.listarTodos().isEmpty()){
            System.out.println("Nenhum cliente adicionado!");
        }else {
            for(Usuario usuario : clienteDao.listarTodos()){
                System.out.println(usuario);
            }
        }
    }

    public void editarCliente(Scanner sc){
        if(sistema.getUsuarios().isEmpty()){
            System.out.println("Nenhum cliente adicionado!");
        }else {
            System.out.println("*** Qual cliente deseja editar");
            System.out.println("*************************");
            for(Usuario usuario : sistema.getUsuarios()){
                System.out.println(usuario);
            }
            System.out.println("Digite o nome do cliente que quer editar!");
            String nomeBusca = sc.nextLine();
            for (Usuario usuario : sistema.getUsuarios()) {
                if (usuario.getNome().equalsIgnoreCase(nomeBusca)) {

                    System.out.println("O que você que editar");
                    System.out.println("""
                            1 - Nome
                            2 - Idade
                            3 - Cancelar
                            """);
                    int opcao = sc.nextInt();
                    sc.nextLine();
                    switch (opcao) {
                        case 1:
                            System.out.print("Digite o nome: ");
                            String novoNome = sc.nextLine();
                            usuario.setNome(novoNome);
                            System.out.println("Nome atualizado com sucesso!");
                            break;
                        case 2:
                            System.out.print("Digite a idade: ");
                            int novaIdade = sc.nextInt();
                            sc.nextLine();
                            usuario.setIdade(novaIdade);
                            System.out.println("Idade atualizado com sucesso!");
                            break;
                        case 3:
                            System.out.println("Saindo");
                            break;
                        default:
                            System.out.println("Digite uma opção válida");
                    }
                    break;
                }
            }
        }
    }

    public  void adicionarLivros(Scanner sc){
        System.out.println("De um nome ao livro: ");
        String nomeLivro = sc.nextLine();
        System.out.println("Digite o ano: ");
        int anoLivro = sc.nextInt();
        Livros l = new Livros(nomeLivro, anoLivro);
        sistemaDeLivros.addLivros(l);
    }

    public void listaDeLivros(){
        System.out.println("*** Lista de Livros! ***");
        System.out.println("************************");

        if(sistemaDeLivros.getLivros().isEmpty()){
            System.out.println("Lista está vázia!");
        }else {
            for (Livros l : sistemaDeLivros.getLivros()){
                System.out.println(l);
            }
        }

    }
}
