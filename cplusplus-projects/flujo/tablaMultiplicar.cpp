#include <iostream>
using namespace std;
//tabla de multiplicar mediante el uso del bucle for
int main()
{
    int num;
    cout << "Introduce un numero: ";
    cin >> num;
    cout << "La tabla de multiplicar del " << num << "\n";
    for (int cont = 1; cont < 11; cont++)
    {
        cout << num * cont << " ";
    }
    cout << "\n";


    return 0;
}
