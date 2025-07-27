package OOP.Jogo;

import java.util.Scanner;

public class App { ;


    public static void main(String[] args) {
        Funcoes fc = new Funcoes();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        while (opcao !=4){
            try{
                System.out.println("**** Escolha uma opção ****");
                System.out.println("""
                        1 - Adicionar guerreiro
                        2 - Adicionar mago
                        3 - Status do personagem
                        4 - Sair
                        """);
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao){
                    case 1:
                        fc.ehGuerreiro();
                        break;
                    case 2:
                        fc.ehMago();
                        break;
                    case 3:
                        fc.statusPersonagem();
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
        sc.close();
    }
}
