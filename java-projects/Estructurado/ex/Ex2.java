package ex;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/// Ejercicio 1
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime una cadena: ");
		String cadena = sc.nextLine();

		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		System.out.println();
		
		/// Ejercicio 2
		String reves = "";
		int longitud = cadena.length() - 1;

		while (longitud >= 0) {
			reves += cadena.charAt(longitud);
			longitud--;
		}
		System.out.println(reves);
	}
}