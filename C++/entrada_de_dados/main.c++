#include <iostream>  // Biblioteca para entrada e saída
using namespace std; // Para evitar escrever std:: toda hora

int main()
{
    cout << "Olá, mundo!" << endl; // Exibe a mensagem na tela

    string nome;
    int idade;
    cout << "Qual seu nome:";
    cin >> nome;

    cout << "Qual sua idade:";
    cin >> idade;

    cout << "Ola, " << nome << " voce tem " << idade << " de vida;";
    return 0; // Indica que o programa terminou corretamente
}
