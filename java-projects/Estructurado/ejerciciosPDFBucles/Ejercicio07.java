package ejerciciosPDFBucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que te pida dos números con la condición de que
		 * el segundo sea mayor que el primero, en caso contrario te pregunta de
		 * nuevo el número hasta que sea correcto. Si los números son correctos,
		 * escribe todos los números comprendidos entre el primer y el segundo
		 * número (ambos inclusive)
		 */

		Scanner sc = new Scanner(System.in);

		boolean ok = true;

		do{

			System.out.println("Dame dos numeros: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num2 > num1) {
				ok = false;

				while (num1 <= num2) {
					System.out.println(num1++);
				}
			} else {
				System.out.println("Introduce el 2 num de nuevo");
				num2 = sc.nextInt();
			}

		}while (ok);
	}
}
