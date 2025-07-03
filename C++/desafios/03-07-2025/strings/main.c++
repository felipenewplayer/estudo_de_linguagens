#include <iostream>
using namespace std;
#include <algorithm>
#include <cctype>
void inversorDeString()
{
    // String com uma palavra
    string nome;
    cout << "Digite um nome: " << endl;
    cin >> nome;
    reverse(nome.begin(), nome.end());
    cout << nome;
    // String com varias palavras
    string frase = "Arroz com feijao";
    int i;
    for (i = frase.length() - 1; i >= 0; i--)
    {
        cout << frase[i];
    }
}

void ePalindromo()
{
    cout << "Digite uma palavra\n";
    string palavra;
    getline(cin, palavra);
    string semEspaco = "";
    for (char c : palavra)
    {
        if (c != ' ')
        {
            semEspaco += c;
        }
    }
    for (int i = 0; i < semEspaco.length(); i++)
    {
        semEspaco[i] = tolower(semEspaco[i]);
    }
    string palavraReversa = semEspaco;

    reverse(palavraReversa.begin(), palavraReversa.end());

    palavraReversa == semEspaco ? cout << "Sim e palindromo" : cout << "Nao e palindromo";
}

void contarVogaisEConsoantes()
{
    string frase;
    cout << "Digite uma frase: \n";
    getline(cin >> ws, frase);

    string semEspaco = "";

    // Remover espaços
    for (char c : frase)
    {
        if (c != ' ')
        {
            semEspaco += c;
        }
    }

    semEspaco.erase(
        remove_if(semEspaco.begin(), semEspaco.end(), [](char c)
                  { return isdigit((unsigned char)c); }),
        semEspaco.end());

    int vogais = 0;
    int consoantes = 0;

    for (char c : semEspaco)
    {
        c = tolower(c);

        if (isalpha(c))
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                vogais++;
            }
            else
            {
                consoantes++;
            }
        }
    }

    cout << "Vogais: " << vogais << endl;
    cout << "Consoantes: " << consoantes << endl;
}

void semVogais()
{
    string frase;
    cout << "Digite uma frase: ";
    getline(cin >> ws, frase);

    string fraseSemEspaco = "";
    for (char c : frase)
    {
        if (c != ' ')
        {
            c = tolower(c);
            fraseSemEspaco += c;
        }
    }

    fraseSemEspaco.erase(
        remove_if(fraseSemEspaco.begin(), fraseSemEspaco.end(), [](char c)
                  { return isdigit((unsigned char)c); }),
        fraseSemEspaco.end());
    string frasePronta = "";
    for (char c : fraseSemEspaco)
    {
        if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'))
        {
            frasePronta += c;
        }
    }

    cout << frasePronta;
}

void retoraMaiorPalavra()
{
    string frase;
    cout << "Digite uma frase: ";
    getline(cin >> ws, frase);

    string maiorPalavra;
    string palvraAtual;

    for (size_t i = 0; i < frase.size(); i++)
    {
        char c = frase[i];

        if (c != ' ')
        {
            palvraAtual += c;
        }

        if (c == ' ' || i == frase.size() - 1)
        {
            if (palvraAtual.length() > maiorPalavra.length())
            {
                maiorPalavra = palvraAtual;
            }
            palvraAtual = "";
        }
    }

    cout << maiorPalavra;
}

void contarPalavraComMaisDe5Letras()
{
    cout << "Digite um frase;";
    string frase;
    getline(cin >> ws, frase);

    string palavraAtual = "";
    int contador = 0;

    for (size_t i = 0; i < frase.size(); i++)
    {
        char c = frase[i];

        if (c != ' ')
        {
            palavraAtual += c;
        }

        if (c == ' ' || i == frase.size() - 1)
        {
            if (palavraAtual.length() > 5)
            {
                contador++;
            }
            palavraAtual = "";
        }
    }

    cout << "Palavras com mais de 5 letras : " << contador;
}

void trocarVogal()
{
    cout << "Digite uma frase: ";
    string frase;
    getline(cin >> ws, frase);

    string fraseModificada = "";
    for (size_t i = 0; i < frase.size(); i++)
    {
        char c = frase[i];
        c = tolower(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {

            fraseModificada += '%';
        }
        else
        {
            fraseModificada += frase[i];
        }
    }

    cout << fraseModificada;
}

int main()
{
    inversorDeString();
    ePalindromo();
    contarVogaisEConsoantes();
    semVogais();
    retoraMaiorPalavra();
    contarPalavraComMaisDe5Letras();
    trocarVogal();
    return 0;
}