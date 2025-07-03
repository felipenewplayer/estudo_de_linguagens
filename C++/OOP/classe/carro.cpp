#include <iostream>
using namespace std;
#include "carro.h"

 Carro::Carro(int a , float v, float km){
    ano = a;
    valor = v;
    this->km = km;
 }
    int Carro::getAno(){
        return ano;
    }
    void Carro::setAno(int a){
        ano = a;
    }
    float Carro::getValor(){
        return valor;
    }
        void Carro::setValor(float v){
            valor = v;
    }   
    float Carro::getKm(){
        return km;
    }
    void Carro::setKm(float km){
        this->km = km;
    }