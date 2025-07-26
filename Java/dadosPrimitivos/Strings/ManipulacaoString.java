package dadosPrimitivos.Strings;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public  class ManipulacaoString{

    static void ehPalindromo(String nome){
        String nomeReverso = new StringBuilder(nome).reverse().toString();
        if(nome.equals(nomeReverso)){
            System.out.println("É palíndromo!");
        }else {
            System.out.println("Não é palíndromo!");
        }
    }

    static void inversorDeString(String nome){
        String nomeReverso =  new StringBuilder(nome).reverse().toString();
        System.out.println(nomeReverso);
    }

    static void contarLetras(String nome){
        int vogais = 0, consoantes = 0;
        String texto = nome.replaceAll("[^a-z]","");
        for(char c : texto.toCharArray()){
            if("aeiou".indexOf(c)!= -1)vogais++;
            else consoantes ++;
        }
        System.out.printf("Vogais: %d | Consoantes: %d\n", vogais,consoantes);
    }

    static void inververFrase(){
        String texto = "Programar em java é bom demais";
        String[] palavras = texto.split(" ");
        for (int i = palavras.length -1 ; i>=0 ; i --) {
            System.out.print(palavras[i] + " ");
            
        }
    }
    public static void main(String[] args) {
        String nome = "Felipe";
        int tamanhoNome = nome.length();
        String letraMinusculas = nome.toLowerCase();
        String letrasMaiusculas = nome.toUpperCase();
        char primeiraLetra = nome.charAt(0);
        String nomeAoContrario = new StringBuilder(nome).reverse().toString();
        char ultimaLetra = nome.charAt(nome.length()-1);
        String stringCortada = nome.substring(2,4);
        char letraA = 'A';
        boolean contemLetra = nome.contains("A");
        boolean ehIgual = nome.equals(nomeAoContrario);
        String stringteste = "Um,Dois,Três";
        String[] minhaString = stringteste.split(",");



        System.out.println("Tamanho do nome: " + tamanhoNome);
        System.out.println("Nome em maiúsculas: " + letrasMaiusculas);
        System.out.println("Nome em minúsculas: " + letraMinusculas);
        System.out.println("Primeira letra do nome: " + primeiraLetra);
        System.out.println("Nome ao contrário: " + nomeAoContrario);
        System.out.println("Última letra do nome: " + ultimaLetra);
        System.out.println("Nome cortado: " + stringCortada);
        System.out.printf("Contém a letra %c ? %b \n", letraA,contemLetra);
        System.out.printf("%s e %s são iguais? %b\n",nome, nomeAoContrario,  ehIgual);
        System.out.println(Arrays.toString(minhaString));
        ehPalindromo(nome);
        inversorDeString(nome);
        contarLetras(nome);

        List<String>nomes = List.of("Felipe","Rafa", "Zé");
        for(String n: nomes){
            System.out.println(n);
        }

        inververFrase();

    }
}