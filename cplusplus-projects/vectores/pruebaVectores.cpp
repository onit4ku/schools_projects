#include <iostream>
using namespace std;

int main()
{
    //vector de un tamaño de elementos determinado de una dimension:
    int matrizSimple[10];

    //vector que se ajusta a los elementos que le pongas:
    int matriz[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    //averiguar el tamaño de elementos de un vector
    int tamanio = sizeof(matriz) / sizeof(matriz[0]); // Obtiene el numero de elementos del vector, diviendo el tamaño del vector completo por el tamaño de un elemento individual del vector
    cout << tamanio << " elementos tiene el tamano del vector matriz.\n";

    //Matriz Multidimensional tablero de ajedrez con 64 escaques
    int ajedrez[8, 8]; //8 filas y 8 columnas

    //Array de 3 dimensiones
    int cubo[5, 13, 8];

    return 0;

}
