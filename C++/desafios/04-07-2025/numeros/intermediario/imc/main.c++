#include <iostream>
using namespace std;

int main() {
    float peso, altura, imc;

    cout << "Digite seu peso (kg): ";
    cin >> peso;

    cout << "Digite sua altura (em metros): ";
    cin >> altura;

    imc = peso / (altura * altura);

    cout << "\nSeu IMC é: " << imc << endl;

    if (imc < 18.5)
        cout << "Categoria: Abaixo do peso\n";
    else if (imc < 25)
        cout << "Categoria: Peso normal\n";
    else if (imc < 30)
        cout << "Categoria: Sobrepeso\n";
    else if (imc < 35)
        cout << "Categoria: Obesidade grau 1\n";
    else if (imc < 40)
        cout << "Categoria: Obesidade grau 2\n";
    else
        cout << "Categoria: Obesidade grau 3\n";

    return 0;
}
