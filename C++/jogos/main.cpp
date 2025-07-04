#include <iostream>
#include <conio.h>
#include <cstdlib>
#include <ctime>
#include <vector>
using namespace std;

int main()
{
    const int largura = 20;
    const int altura = 10;

    int x = largura / 2;
    int y = altura / 2;
    char tecla;

    srand(time(0));
    int comidaX = rand() % (largura - 2) + 1; // evitar bordas
    int comidaY = rand() % (altura - 2) + 1;

    vector<pair<int, int>> corpo;
    bool gameOver = false;

    while (!gameOver)
    {
        system("cls");

        for (int i = 0; i < altura; i++)
        {
            for (int j = 0; j < largura; j++)
            {
                // paredes nas bordas
                if (i == 0 || i == altura - 1 || j == 0 || j == largura - 1)
                {
                    cout << "#";
                }
                else if (i == y && j == x)
                {
                    cout << "O"; // cabeça da cobra
                }
                else
                {
                    bool parteDoCorpo = false;
                    for (auto parte : corpo)
                    {
                        if (parte.first == j && parte.second == i)
                        {
                            cout << "o";
                            parteDoCorpo = true;
                            break;
                        }
                    }

                    if (!parteDoCorpo)
                    {
                        if (i == comidaY && j == comidaX)
                            cout << "@"; // comida
                        else
                            cout << "."; // chão vazio
                    }
                }
            }
            cout << "\n";
        }

        if (_kbhit())
        {
            tecla = _getch();

            corpo.insert(corpo.begin(), {x, y});

            if (tecla == 'a') x--;
            else if (tecla == 'd') x++;
            else if (tecla == 'w') y--;
            else if (tecla == 's') y++;
            else if (tecla == 'q') break;

            // colisão com o próprio corpo
            for (auto parte : corpo)
            {
                if (parte.first == x && parte.second == y)
                {
                    gameOver = true;
                    break;
                }
            }

            // se não comeu comida, remove o fim do corpo
            if (!(x == comidaX && y == comidaY))
                corpo.pop_back();
        }

        // se comeu
        if (x == comidaX && y == comidaY)
        {
            comidaX = rand() % (largura - 2) + 1;
            comidaY = rand() % (altura - 2) + 1;
        }
    }

    cout << "Game Over! 😵" << endl;
    return 0;
}
