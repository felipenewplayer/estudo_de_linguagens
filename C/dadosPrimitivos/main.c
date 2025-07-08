#include <stdio.h>
#include <stdbool.h>
#include <math.h>

int soma(int a, int b) {
    return a + b;
}

int fatorial(int n) {
    int resultado = 1;
    for (int i = 1; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
}

bool ehPrimo(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}

int main() {
    int idade;
    printf("Digite uma idade: ");
    scanf("%d", &idade);
    printf("Você digitou: %d\n", idade);

    int numero;
    printf("Digite um número: ");
    scanf("%d", &numero);

    if (numero > 0) {
        printf("Positivo\n");
    } else if (numero < 0) {
        printf("Negativo\n");
    } else {
        printf("Zero\n");
    }

    for (int i = 0; i <= 10; i++) {
        printf("%d X %d = %d\n", i, numero, i * numero);
    }

    int j = 0;
    do {
        printf("j = %d\n", j);
        j++;
    } while (j < 5);

    int numbera, numberb;
    printf("Digite dois números: ");
    scanf("%d %d", &numbera, &numberb);

    int resultado = soma(numbera, numberb);
    printf("Soma: %d\n", resultado);

    int numberc;
    printf("Digite um número para calcular o fatorial: ");
    scanf("%d", &numberc);

    int resultadoFatorial = fatorial(numberc);
    printf("Fatorial de %d é %d\n", numberc, resultadoFatorial);

    int numberd;
    printf("Digite um número para verificar se é primo: ");
    scanf("%d", &numberd);

    if (ehPrimo(numberd)) {
        printf("%d é um número primo.\n", numberd);
    } else {
        printf("%d não é um número primo.\n", numberd);
    }

    return 0;
}
