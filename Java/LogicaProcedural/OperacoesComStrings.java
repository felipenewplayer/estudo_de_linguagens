package LogicaProcedural;

import java.util.Scanner;

public class OperacoesComStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um palavra:");
        String palavra = sc.nextLine();

        System.out.println(palavra.toUpperCase());
        System.out.println(palavra.toLowerCase());
        System.out.println(palavra.length());

        char letra = 'a';
        if(letra == palavra.toLowerCase().charAt(0)){
            System.out.println("O nome começa com a letra A.");
        }else {
            System.out.println("O nome não começa com a letra A ");
        }
        if(palavra.toUpperCase().startsWith("A")){
            System.out.println("O nome começa com a letra A.");
        }else {
            System.out.println("O nome não começa com a letra A ");
        }

        String palavraReversa = new String();
        for (int i = palavra.length() -1 ; i >=0; i--) {
            palavraReversa += (palavra.charAt(i));
        }
        System.out.println(palavraReversa);

        if(palavra.equals(palavraReversa)){
            System.out.println("É palíndromo!");
        }else {
            System.out.println("Não é palíndromo!");
        }


        int contador = 0;
        String nome = "Felipe";
        String minusculo = nome.toLowerCase();
        for (int i = 0; i < minusculo.length(); i++) {
            char c = minusculo.charAt(i);
            if( c == 'a' ||
                    c == 'e' ||
                    c == 'i' ||
                    c == 'o' ||
                    c == 'u'){
                contador++;
            }

        }
        System.out.printf("%s tem %d de vogais", minusculo, contador);




    }


}
