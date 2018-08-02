// istream::get ejemplo
#include <iostream>     // std::cin, std::cout
#include <fstream>      // std::ifstream

using namespace std; // para no tener que poner std::

int main () {
  char str[256];

  cout << "Introduce el nombre de un fichero: ";
  cin.get (str,256);    // coger string de caracteres

  ifstream is(str);     // abrir archivo

  char c;
  while (is.get(c))          // loop cogiendo de caracter en caracter
    cout << c;

  is.close();                // cerrar el fichero

  return 0;
}
