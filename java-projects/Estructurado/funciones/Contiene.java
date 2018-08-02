package funciones;

import java.util.Scanner;

public class Contiene {
	/*
	 * 
	 * Escribe la función “Contiene” a la que le pasamos una cadena y un
	 * carácter por parámetro y nos dice si el carácter aparece en la cadena o
	 * no. Es igual que la función Contains. Evidentemente, no podéis usar esta
	 * función para hacer la vuestra
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String teclado = sc.nextLine();
		System.out.println("Introduce un caracter: ");
		char caracter = sc.nextLine().charAt(0);
		
		Contienes(teclado,caracter);

	}

	public static void Contienes(String s,char c) {
		int contador = 0;
		char[] arrayChar = s.toCharArray();
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] == c) {
				contador += 1;
			}
		}
		System.out.println("El caracter '"+c+"' está en la cadena: "+contador + " veces.");
	}
}