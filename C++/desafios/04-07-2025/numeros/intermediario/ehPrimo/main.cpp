#include <iostream>
using namespace std;

int main()
{
    int number;
    bool ehprimo = true;

    cout << "Digite um numero: ";
    cin >> number;

    if (number <=1)
    {
        ehprimo = false;
    }
    else
    {
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                ehprimo = false;
                break;
            }
        }
    }

    if (ehprimo)
    {
        cout << "e primo!";
    }
    else
    {
        cout << "nao eh primo!";
    }
    return 0;
}