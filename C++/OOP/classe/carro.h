#include <iostream>
using namespace std;

class Carro
{
private:
    int ano;
    float valor, km;

public:
    Carro(int, float v, float km);
    int getAno();
    void setAno(int a);
    float getValor();
    void setValor(float v);
    float getKm();
    void setKm(float km);
};
