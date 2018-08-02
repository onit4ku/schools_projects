#include <iostream>
using namespace std;

//, a menos q el año tambien sea divisible por 100 en cuyo caso no es bisiesto.
// a menos q sea divisible por 400 en ese caso es bisiesto pese a todo.

/***

-si el año es divisible por 4 es bisiesto:
--Año % 4 == 0
-----true
    Si tambien es divisible por 100 no es bisiesto
    año % 100 == 0 && año % 400
    ----- true


***/

bool esBisiesto(int anio);

int main()
{
    int teclado;
    cout << "Introduce anio: ";
    cin >> teclado;
    if (esBisiesto(teclado))
        {
            cout << "Es anio bisiesto\n";

        }
    else
        {
            cout << "No es anio bisiesto\n";
        }
    return 0;
}

bool esBisiesto(int anio)
{
    if (anio % 4 == 0)
        {
            if (anio % 100 == 0)
                {
                    if(anio % 400 == 0)
                        {
                            return true;
                        }
                        else
                            return false;
                }else
                    return true;
        }else
            return false;
}
