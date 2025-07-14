#include <stdio.h>

int main()
{
    int a = 10;
    int b = 20;
    int *ptra = &a;
    int *ptrab = &b;

    printf("Valor da variável a: %d\n", a);
    printf("Valor da variável b: %d\n", b);
    
    printf("Endereço da variável a: %p\n", (void *)&a);
    printf("Endereço da variável b: %p\n", (void *)&b);

    printf("Endereço armazenado em ptra: %p\n", (void *)ptra);
    printf("Endereço armazenado em ptrab: %p\n", (void *)ptrab);

    printf("Valor apontado por ptra: %d\n", *ptra);
    printf("Valor apontado por ptrab: %d\n", *ptrab);

    return 0;
}
