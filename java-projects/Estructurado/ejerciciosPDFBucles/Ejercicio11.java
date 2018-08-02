package ejerciciosPDFBucles;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que le pide al usuario la nota de un alumno (un
		 * número real). El programa escribirá “Suspenso” si la nota está entre
		 * 0 y 5; “Suficiente” si la nota está entre 5 y 6; “Bien” si la nota
		 * está entre 6 y 7; “Notable” si la nota está entre 7 y 9 y
		 * “Sobresaliente” si está entre 9 y 10. Si la nota no es válida, el
		 * programa nos vuelve a pedir un valor hasta que introduzcamos una
		 * correcta.
		 */

		Scanner sc = new Scanner(System.in);
		boolean ok = false;

		do {
			System.out.println("Introduce nota: ");
			double nota = sc.nextDouble();

			
				System.out.println("nota no valida");
				System.out.println("Introduce nota: ");
				nota = sc.nextDouble();
				
				if (nota < 0.0 && nota > 10.0) {
					ok = true;
			} else {

				if (nota > 0.0 && nota <= 5.0) {
					System.out.println("Suspenso");
				} else

				if (nota > 5.0 && nota <= 6.0) {
					System.out.println("Suficiente");
				} else

				if (nota > 6.0 && nota <= 7.0) {
					System.out.println("Bien");
				} else

				if (nota > 7.0 && nota <= 9.0) {
					System.out.println("Notable");
				} else

				if (nota > 9.0 && nota <= 10.0) {
					System.out.println("Bien");
				}

			}

		} while (ok == true);
	}
}