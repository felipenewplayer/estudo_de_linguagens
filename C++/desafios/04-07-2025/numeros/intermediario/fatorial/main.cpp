#include <iostream>
using namespace std;

int main() {
    int numero;
    unsigned long long fatorial = 1;

    cout << "Digite um numero para calcular o fatorial: ";
    cin >> numero;

    if (numero < 0) {
        cout << "Nao existe fatorial de numero negativo!";
    } else {
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        cout << numero << "! = " << fatorial << endl;
    }

    return 0;
}
