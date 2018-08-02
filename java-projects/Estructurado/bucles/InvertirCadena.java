package bucles;

import java.util.Scanner;

public class InvertirCadena {

//	Programa que al introducir una palabra la voltea.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce palabra a invertir:");
		String nombre = sc.next();

		String cifrado = "";

		int longitud = nombre.length() - 1;

		while (longitud >= 0) {
			cifrado = cifrado + nombre.charAt(longitud);
			longitud--;
		}
		System.out.println(cifrado);
	}

}