package OOP.veiculos;

import OOP.veiculos.controller.VeiculoController;
import OOP.veiculos.view.Menu;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        VeiculoController controller = new VeiculoController();

        int opcao = 0;
        while (opcao!=4){
            try
            {
                opcao = menu.menuPrincipal();
                menu.getSc().nextLine();

                switch (opcao){
                    case 1 -> controller.criarCarro(menu.getSc());
                    case 2 -> controller.criarMoto(menu.getSc());
                    case 3 -> controller.listaDeVeiculos(menu.getSc());
                    case 4 -> menu.exibirMensagem("Saindo...");
                    case 5 -> menu.exibirMensagem("Opção inválida");
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
