package LogicaProcedural;

import java.util.Scanner;

public class Teste {
    public static void main(){

        Scanner sc =  new Scanner(System.in);
        System.out.print("Olá, informe seu nome: ");
        String nome  =  sc.nextLine();
        System.out.printf("Seu nome é %s\n", nome);

        int  numero = 0;
        long numeroGrande = 1000;
        float numeroDecimal = 10;
        System.out.printf("Número %d\n" , numero);
        System.out.println(numeroGrande);
        System.out.println(numeroDecimal);

    }
}
