#include <iostream>
using namespace std;

/*** Bucle While b�sico ***/

int contador = 0;

int main()
{
    while (contador <= 100){
        cout << contador++;
        cout << "\n";
    }
    return 0;
}
