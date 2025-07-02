#include <iostream>
using namespace std;

int main() {
    // DESAFIO 1: Par ou Ímpar
    int numero1;
    cout << "Digite um numero: ";
    cin >> numero1;

    if (numero1 % 2 == 0) {
        cout << "Par\n";
    } else {
        cout << "Ímpar\n";
    }

    // DESAFIO 2: Média de notas
    double nota1 = 10, nota2 = 8, nota3 = 7;
    double soma = nota1 + nota2 + nota3;
    double media = soma / 3;

    if (media >= 7) {
        cout << "Aprovado\n";
    } else {
        cout << "Reprovado\n";
    }

    // DESAFIO 3: Verificar se pode votar
    int idade;
    cout << "Digite sua idade: ";
    cin >> idade;

    if (idade >= 16) {
        cout << "Pode votar\n";
    } else {
        cout << "Não pode votar\n";
    }

    // DESAFIO 4: Tabuada
    int numero2;
    cout << "Digite um número para ver a tabuada: ";
    cin >> numero2;

    for (int i = 1; i <= 10; i++) {
        cout << numero2 << " x " << i << " = " << numero2 * i << "\n";
    }

    return 0;
}
