#include <iostream>
using namespace std;

int main()
{
    string nome = "Felipe";
    int idade = 27;       // Número inteiro
    float altura = 1.66f; // Número com ponto flutuante (precisão menor)
    double peso = 55.5;   // Número com ponto flutuante (maior precisão)
    char letra = 'F';     // Um único caractere
    bool ativo = true;    // Valor booleano (verdadeiro ou falso)

    cout << "Nome:" << nome << endl;
    cout << "Idade: " << idade << endl;
    cout << "Altura: " << altura << endl;
    cout << "Peso: " << peso << endl;
    cout << "Letra: " << letra << endl;
    cout << "Ativo: " << ativo << endl;

    return 0;
}
