#include<iostream>

using namespace std;

class Cuadrado {
private:
    int lado;
public:
    void inicializar();
    void imprimirPerimetro();
    void imprimirSuperficie();
};

void Cuadrado::inicializar()
{
    cout <<"Ingrese el valor del lado:";
    cin >>lado;
}

void Cuadrado::imprimirPerimetro()
{
    int perimetro;
    perimetro=lado*4;
    cout <<"El perimetro es ";
    cout <<perimetro;
    cout <<"\n";
}

void Cuadrado::imprimirSuperficie()
{
    int superficie;
    superficie=lado*lado;
    cout <<"La superficie es ";
    cout <<superficie;
}

int main()
{
    Cuadrado cuadrado1;
    cuadrado1.inicializar();
    cuadrado1.imprimirPerimetro();
    cuadrado1.imprimirSuperficie();
    cin.get();
    cin.get();
    return 0;
}

