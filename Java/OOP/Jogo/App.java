package OOP.Jogo;

import OOP.Jogo.controller.PersonagemController;
import OOP.Jogo.view.MenuView;



public class App { ;

    public static void main(String[] args) {
        MenuView menu = new MenuView();
        PersonagemController controller =  new PersonagemController();

        int opcao = 0;

        while (opcao !=4)
        {
            try{
                opcao = menu.menuPrincipal();
                menu.getSc().nextLine();
                switch (opcao){
                    case 1 -> controller.criarGuerreiro(menu.getSc());
                    case 2 -> controller.criarMago(menu.getSc());
                    case 3 -> controller.listaDePersonagens();
                    case 4 -> menu.exibirMensagem("Saindo...");
                    default ->  menu.exibirMensagem("Opção inválida");
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
