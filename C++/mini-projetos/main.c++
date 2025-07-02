#include <iostream>
#include <vector>
#include <fstream>  // pra arquivo

using namespace std;

struct Cliente
{
    string nome;
    int idade;
};

void salvarClientesArquivo(const vector<Cliente> &clientes) {
    ofstream arquivo("clientes.txt");
    if (!arquivo.is_open()) {
        cout << "Erro ao abrir o arquivo para salvar.\n";
        return;
    }
    for (const Cliente &c : clientes) {
        arquivo << c.nome << " " << c.idade << "\n";
    }
    arquivo.close();
}

void carregarClientesArquivo(vector<Cliente> &clientes) {
    ifstream arquivo("clientes.txt");
    if (!arquivo.is_open()) {
        cout << "Arquivo de clientes nao encontrado, iniciando com lista vazia.\n";
        return;
    }

    clientes.clear();

    Cliente c;
    while (arquivo >> c.nome >> c.idade) {
        clientes.push_back(c);
    }
    arquivo.close();
}

void cadastrarCliente(vector<Cliente> &clientes)
{
    Cliente c;
    cout << "Digite um nome: \n";
    cin >> c.nome;
    cout << "Digite uma idade: \n";
    cin >> c.idade;

    clientes.push_back(c);
}

void listarClientes(const vector<Cliente> &clientes)
{
    if (clientes.empty()) {
        cout << "Nenhum cliente cadastrado.\n";
        return;
    }
    for (int i = 0; i < clientes.size(); i++)
    {
        cout << "Nome: " << clientes[i].nome << " - " << "Idade: " << clientes[i].idade << endl;
    }
}

void editarClientes(vector<Cliente> &clientes)
{
    if (clientes.empty())
    {
        cout << "Não há clientes para editar\n";
        return;
    }

    cout << "Digite o nome do cliente: ";
    string nome;
    cin >> nome;

    bool encontrado = false;
    for (int i = 0; i < clientes.size(); i++)
    {
        if (clientes[i].nome == nome)
        {
            cout << "Digite um novo nome: ";
            cin >> clientes[i].nome;
            cout << "Digite uma nova idade: ";
            cin >> clientes[i].idade;

            encontrado = true;
            cout << "Cliente atualizado com sucesso!\n";
            break;
        }
    }
    if (!encontrado)
    {
        cout << "Cliente não encontrado.\n";
    }
}

void excluirClientes(vector<Cliente> &clientes)
{
    if (clientes.empty())
    {
        cout << "Não há clientes para excluir\n";
        return;
    }

    cout << "Digite o nome do cliente: ";
    string nome;
    cin >> nome;

    bool encontrado = false;

    for (int i = 0; i < clientes.size(); i++)
    {
        if (clientes[i].nome == nome)
        {
            clientes.erase(clientes.begin() + i);
            cout << "Cliente " << nome << " excluído com sucesso.\n";
            encontrado = true;
            break;
        }
    }
    if (!encontrado)
    {
        cout << "Cliente não encontrado.\n";
    }
}

int main()
{
    vector<Cliente> clientes;

    // Carrega clientes do arquivo ao iniciar o programa
    carregarClientesArquivo(clientes);

    int opcao = 0;

    while (true)
    {
        cout << "\n=====Menu principal=====\n";
        cout << "1. Cadastrar Cliente\n";
        cout << "2. Listar Clientes\n";
        cout << "3. Editar Cliente\n";
        cout << "4. Excluir Cliente\n";
        cout << "5. Sair\n";
        cout << "Digite uma opção: ";

        cin >> opcao;
        cout << endl;

        if (opcao == 5)
        {
            cout << "Saindo do programa...\n";
            break;
        }

        switch (opcao)
        {
        case 1:
            cadastrarCliente(clientes);
            salvarClientesArquivo(clientes);
            break;
        case 2:
            listarClientes(clientes);
            break;
        case 3:
            editarClientes(clientes);
            salvarClientesArquivo(clientes);
            break;
        case 4:
            excluirClientes(clientes);
            salvarClientesArquivo(clientes);
            break;
        default:
            cout << "Opção inválida\n";
            break;
        }
    }
    return 0;
}
