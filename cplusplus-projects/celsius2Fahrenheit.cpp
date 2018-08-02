#include <iostream>

using namespace std;
float conversor(float grados);

int main()
{

    cout << "------ Conversor Celsius a Fahrenheit -----\n";
    cout << "Introduce los grados en celsius\n";
    float grados;
    cin >> grados;
    cout << "La temperatura en Fahrenheit es: ";
    cout << conversor(grados);

    return 0;
}

float conversor(float grados)
{
    float resultado = ((grados * 9) / 5) + 32;

    return resultado;
}
