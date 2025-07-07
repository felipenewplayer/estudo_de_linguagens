#include <stdio.h>

int main() {
    float altura;
    char letra;

 // lê inteiro

    printf("Digite sua altura: ");
    scanf("%f", &altura);  // lê float

    printf("Digite uma letra: ");
    scanf(" %c", &letra);  // lê caractere (atenção ao espaço antes do %c)

    printf("Sua altura: %.2f\n", altura);
    printf("Letra digitada: %c\n", letra);

    return 0;
}
