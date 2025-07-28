    package OOP.Jogo.controller;





    import OOP.Jogo.model.Armamento;
    import OOP.Jogo.model.Guerreiro;
    import OOP.Jogo.model.Mago;
    import OOP.Jogo.model.Personagem;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class PersonagemController {
        private final List<Personagem> personagens = new ArrayList<>();

        public void criarGuerreiro(Scanner sc){
            System.out.println("De um nome ao guerreiro: ");
            String nome = sc.nextLine();
            Guerreiro g = new Guerreiro(nome,10);

            System.out.println("""
                    *** Adicione um armamento ***
                    1 - Espada
                    2 - Machado
                    3 - Adaga
                    """);
            int opcao = sc.nextInt();
            sc.nextLine();

           switch (opcao){
               case 1:
                   Armamento espada = Armamento.ESPADA;
                   g.setArmamento(espada);
                   break;
               case 2:
                   Armamento machado = Armamento.MACHADO;
                   g.setArmamento(machado);
                   break;
               case 3:
                   Armamento adaga = Armamento.ADAGA;
                   g.setArmamento(adaga);
                   break;
           }
            System.out.println("Personagem adicionado!");
            personagens.add(g);
        }

         public void criarMago(Scanner sc){
             System.out.println("De um nome ao mago: ");
             String nome = sc.nextLine();
             Mago m = new Mago(nome,10, 20);
             System.out.println("Personagem adicionado!");
             personagens.add(m);
        }

        public void listaDePersonagens(){
           if(personagens.isEmpty()){
               System.out.println("Nenhum personagem ainda adicionado!");
           }else{
               for(Personagem p : personagens){
                   System.out.println(p);
               }
           }
        }
    }

