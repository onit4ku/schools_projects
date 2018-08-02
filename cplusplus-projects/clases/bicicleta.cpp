#include <iostream>
using namespace std;

class Bicicleta
{
    int modelo = 10;

public:
    int getVelocidad();
    void setVelocidad(int velocidad);
    void pedal();
    void freno();
private:
    int velocidad;
};

void Bicicleta::setVelocidad(int nuevaVelocidad)
{
    if (nuevaVelocidad >= 0)
    {
        velocidad = nuevaVelocidad;
    }
}

void Bicicleta::pedal()
{
    setVelocidad(velocidad + 1);
    cout << "\n Pedaleando, velocidad: " << velocidad << " kmh \n";
}

void Bicicleta::freno()
{
    setVelocidad(velocidad - 1);
    cout << "\n Frenando, velocidad de bicicleta " << velocidad << " kmh \n";
}

int main()
{
    Bicicleta campo2000;
    campo2000.setVelocidad(0);
    campo2000.pedal();
    campo2000.pedal();
    campo2000.pedal();
    campo2000.freno();
    campo2000.freno();
    campo2000.freno();

    return 0;
}
