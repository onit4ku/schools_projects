package varios;

import java.util.Scanner;

public class Dni2 {

	// Programa que saca la letra del DNI

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el dni sin la letra");
		int dni = teclado.nextInt();

		String CADENA = "TRWAGMYFPDXBNJZSQVHLCKE";
		System.out.println(CADENA.charAt(dni % 23));
	}

}
