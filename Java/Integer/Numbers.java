package Integer;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Potência
        int number = 2;
        double powNumber = Math.pow(number, 2);
        System.out.println("2 elevado ao quadrado: " + powNumber);

        // Raiz quadrada
        System.out.print("Digite um número, iremos devolver a raiz quadrada: ");
        int numero = sc.nextInt();
        double resultado = Math.sqrt(numero);
        System.out.printf("A raiz quadrada de %d é %.2f%n", numero, resultado);

        // Sigmoid
        System.out.print("Digite um número: ");
        int x = sc.nextInt();
        double sigmoid = 1.0 / (1.0 + Math.exp(-x));
        System.out.println("Sigmoid: " + sigmoid);

        // Número de PI
        double numeroPi = Math.PI;
        System.out.print("Número de PI: \n"+ numeroPi);

        // Número de Euler
        double numeroDeEuler = Math.E;
        System.out.print("Número de Euler: " +  numeroDeEuler);

        sc.close();


    }
}
