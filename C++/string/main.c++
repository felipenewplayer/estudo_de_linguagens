#include <iostream>
#include <cctype>
using namespace std;

int main()
{

    string nome;
    cin >> nome;
    cout << nome << endl;
    cout << "Tamanho da string: " << nome.length() << endl;
    cout << "Acessar caracteres da string: " << nome[1] << endl;

    char letra = 'a';
    cout << "Para maiuscula: " << toupper(letra) << endl;
    cout << "Para menor: " << tolower('B') << endl;

    string palavra = "paLavRa";
    for (int i = 0; i < palavra.length(); i++)
    {
        palavra[i] = tolower(palavra[i]);
    }
    cout << palavra << endl;

    // Percorrer uma string
    for (int i = 0; i < nome.length(); i++)
    {
        cout << nome[i] << " ";
    }

    // comparar strings
    string b = "casa", a = "casa";

    if (b == a)
    {
        cout << "Sao iguais";
    }

    // string frase;
    // cin >> frase;
    // getline(cin, frase);

    return 0;
}