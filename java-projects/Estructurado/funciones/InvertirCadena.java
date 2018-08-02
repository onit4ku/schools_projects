package funciones;

import java.util.Scanner;

/*Escribe una funci�n �InviertePalabras� a la que la pasamos una cadena y nos devuelve
otra en la que est�n invertidas todas las palabras (no la cadena entera, sino cada
palabra independientemente).*/

public class InvertirCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String teclado = sc.nextLine();

		InviertePalabras(teclado);
	}

	public static void InviertePalabras(String s) {
		String vuelta = "";
		int longitud = s.length() - 1;

		while (longitud >= 0) {
			vuelta = vuelta + s.charAt(longitud);
			longitud--;
		}
		System.out.println(vuelta);
	}
}