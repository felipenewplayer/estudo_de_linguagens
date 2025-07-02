#include <iostream>
#include <vector>
using namespace std;

// Struct se declara fora do main
struct Pessoa
{
    string nome;
    int idade;
};

void adicionarPessoa(vector<Pessoa> &pessoas)
{
    cout << "Adicionar uma Pessoa \n";
    Pessoa novaPessoas;
    cout << "Digite um nome: \n";
    cin >> novaPessoas.nome;
    cout << "Digite uma idade: \n";
    cin >> novaPessoas.idade;
    pessoas.push_back(novaPessoas);
}
void mostrarPessoa(const vector<Pessoa> &pessoas)
{
    cout << "Lista das pessoas \n";
    for (int i = 0; i < pessoas.size(); i++)
    {
        cout << "Nome" << pessoas[i].nome << " --- " << pessoas[i].idade << endl;
    }
}

void editarPessoa(vector<Pessoa> &pessoas)
{
    cout << "Editar as pessoas\n";
    if (pessoas.empty())
    {
        cout << "Não tem pessoas cadastradas\n";
        return;
    }
    cout << "Digite o nome da pessoa: ";
    string nome;
    cin >> nome;
    bool encontrado = false;

    for (int i = 0; i < pessoas.size(); i++)
    {
        if (pessoas[i].nome == nome)
        {
            cout << "Digite um novo nome: ";
            cin >> pessoas[i].nome;
            cout << "Digite uma nova idade: ";
            cin >> pessoas[i].idade;

            encontrado = true;
            break;
        }
    }
    if (!encontrado)
    {
        cout << "Nome não encontrado\n";
    }
}

void excluirPessoa(vector<Pessoa> &pessoas)
{
    cout << "Excluir as pessoas \n";
    if (pessoas.empty())
    {
        cout << "Nome não encontrado";
    }
    cout << "Digite o nome da pessoa: ";
    string nome;
    cin >> nome;
    bool encontrado = false;

    for (int i = 0; i < pessoas.size(); i++)
    {
        if (pessoas[i].nome == nome)
        {
            string nomeExcluido = pessoas[i].nome;
            pessoas.erase(pessoas.begin() + i);
            cout << nomeExcluido << " excluido \n";
            encontrado = true;
            break;
        }
    }
    if (!encontrado)
    {
        cout << "Nome não encontrado\n";
    }
}
int main()
{
    vector<Pessoa> pessoas;
    adicionarPessoa(pessoas);
    mostrarPessoa(pessoas);
    editarPessoa(pessoas);
    excluirPessoa(pessoas);
    mostrarPessoa(pessoas);
    return 0;
}