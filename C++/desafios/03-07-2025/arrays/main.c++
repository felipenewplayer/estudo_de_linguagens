#include <iostream>
#include <vector>
#include <algorithm>
#include <cctype>
using namespace std;

vector<string> nomes = {"Rafael", "Joao", "Manoela"};
void quantosNomesComecamComA()
{

    int contador = 0;
    for (size_t i = 0; i < nomes.size(); i++)
    {
        string nome = nomes[i];
        cout << nome[0] << endl;
        if (nome[0] == 'A' || nome[0] == 'a')
        {
            contador++;
        }
    }

    cout << "Contar quantos nomes do vetor comecam com a letra 'A' " << contador << endl;
}
void menorNomeDoArray()
{

    string menorNome = nomes[0];
    for (size_t i = 0; i < nomes.size(); i++)
    {
        if (menorNome.length() > nomes[i].length())
        {
            menorNome = nomes[i];
        }
    }
    cout << "Nome: " << menorNome << endl;

    for (size_t i = 0; i < nomes.size(); i++)
    {
        cout << "Nome: " << nomes[i] << endl;
    }
}

void nomesComMaisDe6Letras()
{
    int contador = 0;
    for (size_t i = 0; i < nomes.size(); i++)
    {
        if (nomes[i].length() > 6)
        {

            contador++;
        }
    }

    cout << "Quantos nomes com mais de 6 letras " << contador << endl;
}
void trocarVogaisEmCadaNome()
{
    for (size_t i = 0; i < nomes.size(); i++)
    {
        string nome = nomes[i];
        for (size_t i = 0; i < nome.length(); i++)
        {
            char c = tolower(nome[i]);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                nome[i] = '%';
            }
        }
        nomes[i] = nome;
        cout << nomes[i] << endl;
    }
}

void ordenarCrescente()
{
    vector<string> names = {"Rafael", "Joao", "Manoela"};
    sort(names.begin(), names.end());
    for (size_t i = 0; i < names.size(); i++)
    {

        cout << names[i] << endl;
    }
}

void contemAletraE()
{   
    
    for (size_t i = 0; i < nomes.size(); i++)
    {
        string nome = nomes[i];
        bool contemE = false;
        for (size_t j = 0; j < nome.size(); j++)
        {
            char c = tolower(nome[j]);

            if (c == 'e')
            {
                contemE = true;
                break;
            }
        }
        if (contemE)
        {

            cout << nomes[i] << endl;
        }
    }
}
int main()
{

    menorNomeDoArray();
    quantosNomesComecamComA();
    nomesComMaisDe6Letras();
    // trocarVogaisEmCadaNome();
    ordenarCrescente();
    contemAletraE();
    return 0;
}