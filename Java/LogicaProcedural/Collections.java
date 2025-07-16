package LogicaProcedural;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        //Principais Métodos//
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.remove(0);
        int tamanho = numeros.size();
        System.out.println(numeros.contains(1));
        System.out.printf("Tamanho do Array é : %d \n", tamanho);
        System.out.println(numeros.get(0));
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String[] addNomes = new String[5];
        for (int i = 0; i < addNomes.length; i++) {
            System.out.println("Digite um nome: ");
            String novoNome = sc.nextLine();
            nomes.add(novoNome);
        }
        System.out.println(nomes);
        while (true){
            System.out.println("Digite nomes (digite 'fim' para parar)");
            String nome = sc.nextLine();
            if(nome.equalsIgnoreCase("fim")) break;
            nomes.add(nome);
        }
        System.out.println(nomes);
        sc.close();
    }
}
