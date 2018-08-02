#include <iostream>
using namespace std;

int main()
{
    char vect[4] = {'h','o','l','a'};
    //recorre el vector de caracteres y lo imprime todo junto formando hola.
    for(int i=0; i<5; i++)
    {
        cout << vect[i];
    }
    return 0;
}
