#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int somar(int a, int b)
{
    return a + b;
}
int somarArray(vector<int> v)
{
    int total = 0;
    for (int n : v)
    {
        total += n;
    }
    return total;
}
int resultadoSomaDosValoresDigitado(vector<int> v)
{
    int total = 0;
    for (int n : v)
    {
        total += n;
    }
    return total;
}
double resultadoMediaDoValoresDigitado(const vector<int>& v){
    int total = somarArray(v);
    return total / (double)v.size();
    
}
vector<int>soPares(vector<int> v ){
    vector<int> pares;
    for(int n : v){
        if(n % 2 == 0){
            pares.push_back(n);
        }
    }
    return pares;
}
int main()
{
    // Soma de numeros
    int a = 10;
    int b = 30;

    int resultado = somar(a, b);
    cout << "Soma " << resultado << endl;

    // Soma de valores de um array
    vector<int> v = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int resultadoArray = somarArray(v);
    cout << "Soma do valores do array " << resultadoArray << endl;

    // mais exemplos

    vector<int> numbers;
    int valor;
    cout << "Digite 5 numeros " << endl;
    for (int i = 0; i < 5; i++)
    {
        cin >> valor;
        numbers.push_back(valor);
    }

    int resultadoSoma = resultadoSomaDosValoresDigitado(numbers);
    int resultadoMediaa = resultadoMediaDoValoresDigitado(numbers);
    vector<int>resultadoPares = soPares(numbers);
    cout << "Soma do valores digitados " << resultadoSoma << endl;
    cout << "Media do valores digitados " << resultadoMediaa << endl;
    
    cout << "Pares encontrados" << endl;
    for(int n : resultadoPares){
        cout << n << " ";
    }

    return 0;
}
