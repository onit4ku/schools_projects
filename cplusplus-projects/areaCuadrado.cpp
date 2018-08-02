#include <iostream>
using namespace std;
float cuadrado(float ancho, float largo);
float ancho,largo;
float area;

int main()
{
    cout << "------Medidor de cuadrados------\n\n";
    cout << "Introduce largo:\n";
    cin >> largo;
    cout << "Introduce ancho:\n";
    cin >> ancho;

    area = cuadrado(largo, ancho);

    cout << "El area del cuadrado es: ";
    cout << area;

return 0;
}

//definicion de la funcion
float cuadrado(float l, float a)
{
    return l * a;
}
