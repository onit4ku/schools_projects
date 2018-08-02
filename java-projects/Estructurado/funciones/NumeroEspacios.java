package funciones;

import java.util.Scanner;

public class NumeroEspacios {

	/*
	 * Escribe la función “NúmeroEspacios” a la que le pasamos una cadena y nos
	 * devuelve el número de espacios que contiene esa cadena (tanto al
	 * principio y al final como intercalados)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String teclado = sc.nextLine();
		NumeroEspacios(teclado);
	}

	public static void NumeroEspacios(String s) {
		int contador = 0;
		char[] arrayChar = s.toCharArray();
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] == ' ') {
				contador += 1;
			}
		}
		System.out.println(contador+" espacios en la cadena.");
	}
}