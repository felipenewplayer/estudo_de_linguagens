#include <stdio.h>
#include <string.h>

void mostrarDados() {
    char nome[30];  
    int idade;
    float peso;
    char string[100];

    printf("Digite seu nome: ");
    fgets(nome, sizeof(nome), stdin);
    nome[strcspn(nome, "\n")] = '\0'; 

    printf("Digite sua idade: ");
    scanf("%d", &idade);

    printf("Digite seu peso: ");
    scanf("%f", &peso);

    sprintf(string, "Seu nome é %s\nVocê tem %d anos de vida\nSeu peso é %.2f", nome, idade, peso);
    printf("%s\n", string);
}

int main() {
    int numero = 11;
    float altura = 10.1;
    double salario = 4500.00;
    char string[100];

    printf("%d\n", numero);
    printf("%.2f\n", altura);
    printf("%.2lf\n", salario);

    sprintf(string, "Idade: %d\nAltura: %.2f\nSalario: %.2lf\n", numero, altura, salario);
    printf("%s\n", string);

    mostrarDados();

    return 0;
}
