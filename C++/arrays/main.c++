#include <iostream>
#include <vector>
using namespace std;

int main()
{
    // Sem valores iniciais
    vector<int> valores;

    valores.push_back(10);
    valores.push_back(20);
    valores.push_back(30);

    // Acessando primeiro número
    cout << "Primeiro numero " << valores[0] << endl;

    // Tamanho do vector
    cout << "Tamanho " << valores.size() << endl;

    // Percorrer o vector
    cout << "Todos os numeros: \n";
    for (int i = 0; i < valores.size(); i++)
    {
        cout << valores[i] << "\n";
    }
    cout << endl;

    valores.pop_back();

    // Excluir o último
    for (int n : valores)
    {

        cout << n << "\n";
    }

    // Apaga tudo no array
    valores.clear();

    // Array com valores iniciais
    vector<int> numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // Adicionar um numero
    numeros.push_back(11);
    // Percorrer com For
    for (int i = 0; i < numeros.size(); i++)
    {
        cout << numeros[i] << "\n";
    }
    // Percorrer com forEach
    cout << "Percorrer com foEach\n";
    for (int n : numeros)
    {
        cout << n << "\n";
    }
    return 0;
}