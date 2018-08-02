package ejerciciosPDFBucles;

import java.util.Scanner;

public class Ejercicio08 {

	/*
	 * Escribe un programa que te pide dos números. Si el primero es menor que
	 * el segundo, escribe todos los números comprendidos entre ambos en orden
	 * ascendente. Si el primero es mayor que el segundo, escribe todos los
	 * números comprendidos entre ambos en orden descendente
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame dos numeros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 < num2) {
			for (int i = num1 + 1; i < num2; i++) {
				System.out.println(i);
			}
		} else {
			for (int a = num1; a >= num2; a--) {
				System.out.println(a);
			}
		}
	}
}
