#include <iostream>
#include <vector>
#include <set>
#include <algorithm>
using namespace std;

// void parOuImpar()
// {
//     int numero;
//     cout << "Digite um numero: ";
//     cin >> numero;

//     if (numero % 2 == 0)
//     {
//         cout << "Eh Par\n";
//     }
//     else
//     {
//         cout << "Eh Impar\n";
//     }
// }
// void mediaDasNotas()
// {
//     int nota1 = 10;
//     int nota2 = 10;
//     int nota3 = 10;
//     float soma = nota1 + nota2 + nota3;
//     float media = soma / 3;

//     if (media >= 7)
//     {
//         cout << "Aprovado!\n";
//     }
//     else if (media < 7)
//     {
//         cout << "Recuperacao!\n";
//     }
//     else
//     {
//         cout << "Reprovado!\n";
//     }
// };

// void tabuada()

// {
//     int number = 4;
//     for (int i = 0; i <= 10; i++)
//     {
//         int multiplicacao = i * number;
//         cout << i << " x " << number << " = " << multiplicacao << endl;
//     }
// }
// void somarNumeroArray()
// {
//     vector<int> numeros = {10, 50, 30, 40, 50};
//     int soma = 0;
//     for (size_t i = 0; i < numeros.size(); i++)
//     {
//         soma += numeros[i];
//     }
//     cout << "Soma: " << soma << endl;
// }

// void menorEMaiorDoArray()
// {
//     vector<int> numeros = {10, 50, 30, 40, 50};
//     int menor = numeros[0];
//     int maior = numeros[0];

//     for (int i = 0; i < numeros.size(); i++)
//     {
//         if (numeros[i] > maior)
//         {
//             maior = numeros[i];
//         }
//         if (numeros[i] < menor)
//         {
//             menor = numeros[i];
//         }
//     }
//     cout << "Menor valor: " << menor << endl;
//     cout << "Maior valor: " << maior << endl;
// }

// void apenasImpar()
// {
//     vector<int> numeros = {10, 50, 30, 40, 50, 7};
//     vector<int> impar;
//     vector<int> par;

//     for (int i = 1; i < numeros.size(); i++)
//     {
//         if (numeros[i] % 2 == 1)
//         {
//             impar.push_back(numeros[i]);
//         }
//         else
//         {
//             par.push_back(numeros[i]);
//         }
//     }

//     for (int i = 0; i < impar.size(); i++)
//     {
//         cout << impar[i] << endl;
//     }
//     cout << "Par" << endl;
//     for (int i = 0; i < par.size(); i++)
//     {
//         cout << par[i] << endl;
//     }
// }

void fatorial()
{
    int numero;
    int resultado = 1;
    cout << "Digite numero: ";
    cin >> numero;
    for (int i = 1; i <= numero; i++)
    {
        resultado *= i;
    }
    cout << resultado << endl;
}
void encontrarValor()
{
    vector<int> numeros = {10, 50, 60, 70, 3, 32, 20};
    int buscar = 10;
    int encontrado = false;
    for (int i = 0; i < numeros.size(); i++)
    {
        if (buscar == numeros[i])
        {
            encontrado = true;
            break;
        }
        else
        {
            cout << buscar << " Não Encontrado" << endl;
        }
    }
    if (encontrado)
    {

        cout << buscar << " Encontrado" << endl;
    }
}

void inverterArray()
{
    vector<int> numeros = {10, 50, 60, 70, 3, 32, 20};
    reverse(numeros.begin(), numeros.end());
    for (int n : numeros)
    {
        cout << n << " " << endl;
    }
}

void mediaMaiorMenor()
{
    vector<int> numeros = {10, 50, 60, 70, 3, 32,20,20};
    int soma = 0;
    int maior = numeros[0];
    int menor = numeros[0];
    for (size_t i = 0; i < numeros.size(); i++)
    {
        soma += numeros[i];
        if (numeros[i] > maior)
        {
            maior = numeros[i];
        }
        if (numeros[i] < menor)
        {
            menor = numeros[i];
        }
    }
    int media = soma / numeros.size();
    cout << "Medias dos numeros: " << media << endl;
    cout << "Maior numero:" << maior << endl ;
    cout << "Menor numero:" << menor << endl;
}

void semDuplicados(){
      vector<int> numeros = {10, 50, 60, 70, 3, 32,20,20};
      set<int>unicos(numeros.begin(), numeros.end());
      for(int num : unicos){
        cout << num  << " ";
      }
}
int main()
{
    // parOuImpar();
    // mediaDasNotas();
    // tabuada();
    // somarNumeroArray();
    // menorEMaiorDoArray();
    // apenasImpar();
    fatorial();
    encontrarValor();
    inverterArray();
    mediaMaiorMenor();
    semDuplicados();
    return 0;
}