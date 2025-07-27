    package OOP.Jogo;

    import java.util.Scanner;

    public class Funcoes {
        private Guerreiro guerreiro;
        private Mago mago;
        Scanner sc = new Scanner(System.in);

        public void ehGuerreiro(){
            System.out.println("De um nome ao guerreiro: ");
            String nome = sc.nextLine();
            Guerreiro guerreiro1 = new Guerreiro(nome,10);

            System.out.println("""
                    *** Adicione um armamento ***
                    1 - Espada
                    2 - Machado
                    """);
            int opcao = sc.nextInt();
            if(opcao == 1){
                Armamento espada = Armamento.ESPADA;
                guerreiro1.setArmamento(espada);
            } else if (opcao == 2) {
                Armamento machado = Armamento.MACHADO;
                guerreiro1.setArmamento(machado);
            }
            System.out.println("Personagem adicionado!");
            guerreiro = guerreiro1;
        }

         void ehMago(){
             System.out.println("De um nome ao mago: ");
             String nome = sc.nextLine();
             Mago mago1 = new Mago(nome,10, 20);
             System.out.println("Personagem adicionado!");
             mago = mago1;
        }
         void statusPersonagem(){
             System.out.println(""" 
                     *** Exibir ***
                     1 - Guerreiro
                     2 - Mago
                     """);

             int opcao = sc.nextInt();
             if(opcao == 1 && guerreiro != null){
                 System.out.println(guerreiro);
             } else if (opcao == 2 && mago !=null) {
                 System.out.println(mago);
             }
             else {
                 System.out.println("Nenhum personagem adicionado!");
             }
        }
    }

