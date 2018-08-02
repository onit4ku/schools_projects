#include <iostream>
using namespace std;


/**
    Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo.
    Confeccionar los métodos para la carga,
    otro para imprimir sus datos y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000)
*/

class Empleado
{
private:
    char nombre[40];
    int sueldo;
public:
    void inicializar();
    void imprimir();
    void impuestos();
};

void Empleado::inicializar()
{
    cout << "Introduce el nombre del empleado.\n";
    cin >> nombre;
    cout << "Introduce el sueldo del empleado.\n";
    cin >> sueldo;
}

void Empleado::imprimir()
{
    cout << "El empleado con nombre " << nombre << " y sueldo " << sueldo << " euros";
}

void Empleado::impuestos()
{
    if (sueldo > 3000 )
    {
        cout << " debe pagar impuestos.";
    }
    else
        cout << " no debe pagar impuestos.";
}


int main ()
{
    Empleado emp1;
    emp1.inicializar();
    emp1.imprimir();
    emp1.impuestos();
    return 0;
}
