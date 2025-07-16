package LogicaProcedural;

import java.util.Scanner;
public  class ProgramacaoBasico{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();
    System.out.printf("Seu nome é %s\n", nome);

    System.out.println("Digite um número: ");
    int numero1 = sc.nextInt();
    System.out.println("Digite outro número: ");
    int numero2 = sc.nextInt();
    int soma = numero1 + numero2;
    System.out.printf("A soma de %d e %d é %d\n", numero1,numero2,soma);

    System.out.print("Digite seu peso(kg): ");
    float peso = sc.nextFloat();

    System.out.print("Digite sua altura(m): ");
    float altura = sc.nextFloat();

    float imc = peso/(altura * altura);
    System.out.printf("Seu imc é:  %.2f\n", imc);

    System.out.println("Digite um número: ");
    int number = sc.nextInt();

    if(number % 2 == 0 ){
        System.out.println("É par");
    }
    else {
        System.out.println("É impar");
    }

    System.out.println("Digite outro número: ");
    int a = sc.nextInt();
    int resultado = 1;
    if(a <= 0){
        return;
    }else {
        for (int i = 1; i <= a; i++) {
            resultado *= i;
        }System.out.println(resultado);
    }
    System.out.println("Digite sua idade: ");
    int idade = sc.nextInt();
    if(idade <= 12){
        System.out.println("Criança");
    }
    else if(idade < 18){
        System.out.println("Adolescente");
    }else if(idade <=59) {
        System.out.println("Adulto");
    }else {
        System.out.println("Idoso");
    }


    sc.close();
}

}
