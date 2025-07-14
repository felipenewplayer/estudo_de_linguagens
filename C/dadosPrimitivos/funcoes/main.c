#include <stdio.h>


void dobra(int *numero){
    *numero  = *numero * 2;
}
int main() {
        int valor = 20;
        dobra(&valor);
        printf("Valor dobrado %d\n", valor);
    return 0;
}

