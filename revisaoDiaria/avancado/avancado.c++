#include <iostream>
#include <map>
#include <vector>
#include <algorithm>
using namespace std;

void contarFrequencia()
{
    vector<int> numeros = {10, 5, 30, 30, 405, 5, 2};

    map<int, int> frequencia;

    for (int n : numeros)
    {
        frequencia[n]++;
    }

    for (auto par : frequencia)
    {
        cout << "Numero: " << par.first << " aparece " << par.second << "x\n";
    }
}
void dobrarValores()
{
    vector<int> numeros = {10, 5, 30, 30, 405, 5, 2};
    vector<int> dobrar(numeros.size());

    transform(numeros.begin(), numeros.end(), dobrar.begin(), [](int n)
              { return n * 2; });
    for (int n : dobrar)
    {
        cout << n << " ";
    }
}
int main()
{
    contarFrequencia();
    dobrarValores();
    return 0;
}