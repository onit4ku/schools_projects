package ejerciciosPDFBucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Escribe un programa que te pregunte si quieres números pares o
		// impares. Si te dice
		// pares, escribe los números pares del 1 al 10 y si te dice impares,
		// escribe los números
		// impares del 1 al 10.

		System.out.println("¿Quieres 1: pares o 2: impares?");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Pares");
			for (int i = 1; i < 10; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
			break;
		case 2:
			System.out.println("Impares");
			for (int i = 1; i < 10; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
			break;
		default:
			System.out.println("Opcion no soportada");
		}
	}
}