#include <iostream>
#include <conio.h>
#include <cstdlib> // rand()
#include <ctime>   // time()
using namespace std;

int main()
{
    const int largura = 20;
    const int altura = 10;

    int x = largura / 2;
    int y = altura / 2;
    char tecla;

    // Gerar posição aleatória da comida
    srand(time(0)); // semente aleatória
    int comidaX = rand() % largura;
    int comidaY = rand() % altura;
    cout << comidaX;

    while (true)
    {
        system("cls");

        for (int i = 0; i < altura; i++)
        {
            for (int j = 0; j < largura; j++)
            {
                if (i == y && j == x)
                    cout << "O";
                else if (i == comidaY && j == comidaX)
                {
                    cout << "@";
                }

                else
                    cout << ".";
            }
            cout << "\n";
        }

        if (_kbhit())
        {
            tecla = _getch();

            if (tecla == 'a' && x > 0)
                x--;
            else if (tecla == 'd' && x < largura - 1)
                x++;
            else if (tecla == 'w' && y > 0)
                y--;
            else if (tecla == 's' && y < altura - 1)
                y++;
            else if (tecla == 'q')
                break;
        }

        if (x == comidaX && y == comidaY)
        {
            // Nova comida aleatória
            comidaX = rand() % largura;
            comidaY = rand() % altura;
        }
    }

    cout << "Jogo encerrado!" << endl;
    return 0;
}
