package funciones;

import java.util.Scanner;

public class NumVocales {

	/*
	 * Escribe la función “NumeroVocales” a la que le pasamos una cadena y nos
	 * devuelve el número de vocales que hay en la cadena.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String teclado = sc.nextLine();
		NumeroVocales(teclado);
	}

	public static void NumeroVocales(String s) {
		int contador = 0;
		char[] arrayChar = s.toCharArray();
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] == 'a' || arrayChar[i] == 'e' || arrayChar[i] == 'i' || arrayChar[i] == 'o'
					|| arrayChar[i] == 'u' || arrayChar[i] == 'A' || arrayChar[i] == 'E' || arrayChar[i] == 'I'
					|| arrayChar[i] == 'O' || arrayChar[i] == 'U') {
				contador += 1;
			}
		}
		System.out.println(contador + " vocales en la cadena.");
	}
}