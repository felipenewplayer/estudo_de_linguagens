#include <iostream>
using namespace std;

int main()
{
    int number;
    cout << "Digite um numero: ";
    cin >> number;

    for (size_t i = 0; i <= 10; i++)
    {   
             cout << "\nTabuada do " << number << ":\n";
        for (size_t j = 1; j <= 10; j++)
        {
            cout << number << " x " << i << " = " << number * i << endl;
        }
    }

    return 0;
}