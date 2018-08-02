package ejerciciosPDFBucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Escribe un programa en el que tenemos que acertar un número entre 1 y
		// 10. Si no
		// acertamos, nos vuelve a preguntar otro número. Si acertamos, nos
		// felicita por nuestra
		// hazaña. El número que hay que acertar será constante (hasta que
		// aprendamos a usar
		// los números aleatorios).tub

		Scanner sc = new Scanner(System.in);

		int num;
		boolean dale = false;

		do {
			System.out.println("Introduce un num entre 1 y 10");
			num = sc.nextInt();

			if (num >= 1 && num <= 10) {

				System.out.println("Acertaste");

				dale = true;
			} else {
				dale = false;
			}

		} while (dale == false);

	}

}
