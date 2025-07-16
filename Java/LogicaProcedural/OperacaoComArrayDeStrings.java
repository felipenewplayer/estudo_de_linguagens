package LogicaProcedural;

import java.util.Scanner;

public class OperacaoComArrayDeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " + (i + 1) + ":");
            nomes[i] = sc.nextLine();
        }
        for (String nome : nomes) {
            System.out.println(nome);
        }


        for (int i = 0; i < nomes.length ; i++) {
            int contador = 0;
            String nome = nomes[i];
            for (int j = 0; j < nome.length(); j++) {
                char c = nome.charAt(j);
                if(c == 'a'||
                        c == 'e'||
                        c == 'i'||
                        c == 'o'||
                        c == 'u'){
                    contador ++;
                }

            }  System.out.println("O nome: " + nomes[i] + " tem " + contador + " vogais ");
        }

        System.out.println("Digite um nome a ser procurado");
        String nomeProcurado = sc.nextLine();
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equals(nomeProcurado)) {
                encontrado = true;
            }}
            if (encontrado) {
                System.out.println("Nome encontrado!");
            }else
            {
                System.out.println("Nome não encontrado!");
            }

            int[] numeros = new int[5];
            int soma = 0;
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Digite o número " + (i + 1) + ":");
                numeros[i] = sc.nextInt();
                soma += numeros[i];
            }
            System.out.println(soma);
            sc.close();

            int maior = numeros[0];
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }

            }
        System.out.println(maior);
        }
    }
