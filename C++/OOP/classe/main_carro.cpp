#include <iostream>
#include "carro.h"
using namespace std;

int main()
{
    Carro fiat(1995, 10000, 150000);
    cout << "Ano: " << fiat.getAno() << endl;
    cout << "Valor: " << fiat.getValor() << endl;
    cout << "KM: " << fiat.getKm() << endl;
    
    system("pause");
    return 0;
}
