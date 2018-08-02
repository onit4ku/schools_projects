#include <iostream>

using namespace std;

float media(int, int);
float media(long, long);
float media(float, float);

float num1,num2;

int main()
{
cout << "Ejercicio Media utilizando sobrecarga de funciones \n";

cout << "Introduce el primer valor: \n";
cin >> num1;
cout << "Introduce el segundo valor: \n";
cin >> num2;
cout << "La media es: \n";
cout << media(num1, num2);


}

float media(float num1, float num2)
{
float result = (num1 + num2) / 2;
    return result;
}
