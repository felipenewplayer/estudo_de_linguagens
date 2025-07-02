#include <iostream>
using namespace std;
#include <vector>
int main()
{

    struct Pessoa
    {
        string nome;
        float altura;
    };

    Pessoa p1;
    cout << "Digite um nome \n";
    cin >> p1.nome;
    cout << "Digite a altura \n";
    cin >> p1.altura;

    cout << p1.nome << endl;
    cout << p1.altura;

    vector<Pessoa> pessoas;
    Pessoa p2 = {"Raimundo", 1.40f};
    Pessoa p3 = {"Leao", 1.60f};
    pessoas.push_back(p2);
    pessoas.push_back(p3);

    for (Pessoa p : pessoas)
    {
        cout << "Nome " << p.nome << " Altura: " << p.altura << endl;
    }

    int x = 16 * 16;
    cout << x << endl;
    return 0;
}