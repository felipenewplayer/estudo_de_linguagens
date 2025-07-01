#include <stdio.h>
int main(int argc, char const *argv[])
{
    char nome[10];

    printf("Digite seu nome: ");
    scanf("%s", &nome);
    printf("Parabens %s", nome);

    fflush(stdin);
    return 0;
}
