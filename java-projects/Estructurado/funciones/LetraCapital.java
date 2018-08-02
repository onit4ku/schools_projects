package funciones;

import java.util.Scanner;

public class LetraCapital {
	/*
	 * Escribe la función “MayusculasPrimera” a la que le pasas una cadena y te
	 * devuelve la cadena con la primera letra de cada palabra puesta en
	 * mayúsculas.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String teclado = sc.nextLine();

		MayusculasPrimera(teclado);
	}

	public static void MayusculasPrimera(String s) {
	
		char[] arrayChar = s.toCharArray();
		
		for (int i = 0; i < arrayChar.length; i++) {

		}	
	}

}
