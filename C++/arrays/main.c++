#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{

    // Array tradicionais
    int numbers[5] = {1, 2, 3, 4, 5};
    // Percorrer array
    for (int i = 0; i < 5; i++)
    {
        cout << numbers[i] << " " << "\n";
    }

    // ⚠️ Limitações:
    // Tamanho fixo (não cresce nem diminui)
    // Não tem .size() ou métodos úteis
    // Cuidado com índices fora do limite


    // Arryay modernos
    //  Sem valores iniciais
    vector<int> valores;

    //Adicionando
    valores.push_back(10);
    valores.push_back(20);
    valores.push_back(30);

    //Removendo o ultimo
    valores.pop_back();

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

    if (numeros.empty())
    {
        cout << "Esta vazio";
    }
    else
    {
        cout << "Nao esta vazio\n";
    }

    // Dados digitado
    vector<int> v;
    int valor;
    cout << "Digite 5 numeros\n";
    for (int i = 0; i < 5; i++)
    {
        cin >> valor;
        v.push_back(valor);
    }

    cout << "Voce digitou\n";
    for (int n : v)
    {
        cout << n << " ";
    }

    int soma = 0;
    for (int n : v)
    {
        soma += n;
    }

    cout << "Soma " << soma << endl;

    int maior = *max_element(v.begin(), v.end());
    int menor = *min_element(v.begin(), v.end());

    cout << "O maior numero do array eh " << maior << "\n";
    cout << "O menor numero do array eh " << menor << "\n";

    sort(v.begin(), v.end());
    for(int n: v){
        cout << n << "\n";
    }
    

    return 0;
}