#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{

    vector<int> numeros;
    int valores;
    cout << "Digite 5 numeros\n";

    for (int i = 0; i < 5; i++)
    {
        cin >> valores;
        numeros.push_back(valores);
    }
    cout << "Numeros na tela\n";
    for (int i = 0; i < numeros.size(); i++)
    {
        cout << numeros[i] << "\n";
    }

    int array[6] = {1, 2, 3, 4, 5, 6};
    cout << "Numeros pares\n";
    for (int i = 0; i < 6; i++)
    {
        if (array[i] % 2 == 0)
        {
            cout << array[i] << "\n";
        }
    }

    int busca = 30;
    bool achou = false;
    for (int i = 0; i < 5; i++)
    {
        if (numeros[i] == busca)
        {
            achou = true;
            break;
        }
        else
        {
            cout << "Nao encontrado\n";
        }
    }

    // Contar pares e ímpares

        vector<int>
            v = {12, 50, 34, 67, 200, 35, 9, 20, 1, 3};
    vector<int> pares;
    vector<int> impares;
    for (int i = 0; i < v.size(); i++)
    {
        if (v[i] % 2 == 0)
        {
            pares.push_back(v[i]);
        }
        else
            impares.push_back(v[i]);
        {
        }
    }
    int tamanhoPares = pares.size();
    cout << "Tem " << tamanhoPares << " pares\n";
    int tamanhoImpares = impares.size();
    cout << "Tem " << tamanhoImpares << " impares\n";

    // Media dos valores

            cout
        << "Digite quantos valores voce quiser, aperte 0 para parar\n";
    vector<int> numeros;
    int valor;

    while (true)
    {
        cin >> valor;
        if (valor == 0)
            break;
        numeros.push_back(valor);
    }

    if (numeros.empty())
    {
        return 0;
    }

    int soma = 0;
    for (int n : numeros)
    {
        soma += n;
    }

    float media = soma / (float)numeros.size();

    cout << "Soma " << soma << "\n";
    cout << "Media " << media << "\n";

    return 0;
}