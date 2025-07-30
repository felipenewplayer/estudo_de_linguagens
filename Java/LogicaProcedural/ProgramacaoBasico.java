package LogicaProcedural;

import java.util.Scanner;
public  class ProgramacaoBasico{

    static void nomeDaPessoa(String nome){
        if(nome.matches("[a-zA-Z ]+")){
            System.out.printf("Seu nome é %s\n", nome);
        }else {
            System.out.println("Erro: o nome deve conter apenas letras!");
            return;
        }
    }
    static void soma(int n1, int n2){
        System.out.println(n1 + n2);
    }
    static void ehPrimo(int n ){
        if(n <= 1){
            System.out.println("Não é primo");
            return;
        }
        for(int i = 2 ; i < Math.sqrt(n) ; i ++){
                if(n % i == 0){
                    System.out.println("Não é primo");
                    return;
                }
            }
            System.out.println("É primo");
    }
    static void fatorial(int a){
        int resultado = 1;
        if(a <= 0){
            return;
        }else {
            for (int i = 1; i <= a; i++) {
                resultado *= i;
            }System.out.println(resultado);
        }
    }
    static void ehImparOuPar(int number){


        if(number % 2 == 0 ){
            System.out.println("É par");
        }
        else {
            System.out.println("É impar");
        }
    }
    static void seuImc(float p, float a){

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();
    nomeDaPessoa(nome);
    int numero1;
    int numero2;
    while (true){
        try{
            System.out.println("Digite um número: ");
            numero1 = Integer.parseInt(sc.nextLine());
            System.out.println("Digite outro número: ");
            numero2 = sc.nextInt();
            break;
        }catch (NumberFormatException e){
            System.out.println("Erro: Digite um número inteiro válido.");
        }
    }
     soma(numero1, numero2);
    System.out.println("Digite um número");
    int number = sc.nextInt();
    ehImparOuPar(number);

    System.out.print("Digite seu peso(kg): ");
    float peso = sc.nextFloat();

    System.out.print("Digite sua altura(m): ");
    float altura = sc.nextFloat();

    float imc = peso/(altura * altura);
    System.out.printf("Seu imc é:  %.2f\n", imc);
    seuImc(peso, altura);
    System.out.println("Digite um número: ");


    System.out.println("Digite outro número: ");
    int a = sc.nextInt();
    fatorial(a);
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

    System.out.print("Digite um número: ");
    int numero = sc.nextInt();
    ehPrimo(numero);


    sc.close();
}

}
