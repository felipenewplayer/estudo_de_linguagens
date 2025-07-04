#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    // Números

    int idade = 10;               // Inteiro
    float altura = 10.0f;         // Número com vírgula ou ponto
    double pi = 3.14159265359;    // Número com mais precisão
    long id = 1224343;            // Número inteiro maior que int
    unsigned numberPositive = 10; // Somente numeros positivos

    cout << "Idade: " << idade << endl;
    cout << "altura: " << altura << endl;
    cout << "pi: " << pi << endl;
    cout << "id: " << id << endl;
    cout << "unsigned: " << numberPositive << endl;

    // Operções com números

    int a = 10;
    int b = 20;

    cout << a + b << endl;
    cout << a - b << endl;
    cout << a * b << endl;
    cout << a / b << endl;

    // Calculadora simples

    int number1, number2;
    char opc;
    cout << "Digite um número: ";
    cin >> number1;
    cout << "Digite um número: ";
    cin >> number2;
    cout << "Digite uma opcao (+  - * / ): ";
    cin >> opc;

    switch (opc)
    {
    case '+':
        cout << number1 + number2 << endl;
        break;
    case '-':
        cout << number1 - number2 << endl;
        break;
    case '*':
        cout << number1 * number2 << endl;
        break;
    case '/':
        if (number2 == 0)
            cout << "Não pode dividir por zero!";
        else
            cout << number1 / number2;
        break;

    default:
        cout << "Erro";
        break;
    }

    // Raiz quadrada e potência
    //  incluir a biblioteca cmath

    double numero, expoente, base;

    // Raiz quadrada
    cout << "Digite um numero: ";
    cin >> numero;

    double raiz = sqrt(numero);
    cout << "A raiz quadrada de " << numero << " e " << raiz << endl;

    // Potecia

    cout << "Digite a base da potencia: ";
    cin >> base;
    cout << "Digite a base da expoente: ";
    cin >> expoente;
    double resultado = pow(base, expoente);
    cout << base << "^" << expoente << " eh " << resultado << endl;
    return 0;
}