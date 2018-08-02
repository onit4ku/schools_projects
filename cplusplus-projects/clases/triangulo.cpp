#include <iostream>
using namespace std;

/** Desarrollar un programa que cargue los lados de un triángulo e implemente los siguientes métodos:
        inicializar los atributos,
        imprimir el valor del lado mayor y
        otro método que muestre si es equilátero o no.
**/


class Triangulo
{
private:
    int lado1,lado2,lado3;
public:
    void inicializar();
    void ladoMayor();
    void esEquilatero();
};

void Triangulo::inicializar()
{
    cout <<"Ingrese primer lado:";
    cin >>lado1;
    cout <<"Ingrese segundo lado:";
    cin >>lado2;
    cout <<"Ingrese tercer lado:";
    cin >>lado3;
}

void Triangulo::ladoMayor()
{

    cout <<"Lado mayor:";
    if (lado1 > lado2 && lado1 > lado3)
    {
        cout <<lado1;
    }
    else
    {
        if (lado2 > lado3)
        {
            cout <<lado2;
        }
        else
        {
            cout <<lado3;
        }
    }
    cout <<"\n";

}

void Triangulo::esEquilatero()
{
    if (lado1==lado2 && lado1==lado3)
    {
        cout <<"Es un triangulo equilatero";
    }
    else
    {
        cout <<"No es un triangulo equilatero";
    }
    cin.get();
    cin.get();
}


int main()
{
    cout << "Ingresa los lados de un triangulo para saber si es equilatero o no.\n";
    Triangulo triangulo1;
    triangulo1.inicializar();
    triangulo1.ladoMayor();
    triangulo1.esEquilatero();

    return 0;
}
