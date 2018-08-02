#include <iostream>
using namespace std;
//dibujar cajas mediante el uso de for anidados
int main()
{
    int filas, columnas;
    char caracter;

    cout << "Cuantas filas?\n ";
    cin >> filas;
    cout << "Cuantas columnas?\n ";
    cin >> columnas;
    cout << "Que caracter deseas usar?\n ";
    cin >> caracter;

    cout << "\n";
    for (int i = 0; i < filas; i++)
    {
        for (int j = 0; j < columnas; j++)
        {
            cout << caracter;
        }
        cout << "\n";
    }
    return 0;
}
