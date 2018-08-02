package condicionales;

import java.util.Scanner;

public class ParImpar {
	// Comprobar si un numero es par o impar
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int num = teclado.nextInt();

		if (num % 2 == 0) {

			System.out.println("Es par");
		} else
			System.out.println("Es impar");

	}

}
