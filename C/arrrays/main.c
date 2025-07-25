#include <stdio.h>

int main()
{

    int numeros[5] = {1, 2, 4, 5, 3};
    int soma = 0, maior = numeros[0], menor = numeros[0];
    for (int i = 0; i < 5; i++)
    {
        if (numeros[i] > maior)
        {
            maior = numeros[i];
        }
        else if (numeros[i] < menor)
        {
            menor = numeros[i];
        }
        if (numeros[i] % 2 == 0)
        {
            printf("%d \n", numeros[i]);
        }
        soma += numeros[i];
    }
    printf("Soma dos numeros eh: %d\n", soma);
    printf("Maior entre os numeros eh: %d\n", maior);
    printf("Menor entre os numeros eh: %d\n", menor);

    char nomes[3][20];
    for (int i = 0; i < 3; i++)
    {
        printf("Digite um nome: ");
        scanf("%s", nomes[i]);
    }
    for (int i = 0; i < 3; i++)
    {
        printf("%s\n", nomes[i]);
    }
    return 0;
}
