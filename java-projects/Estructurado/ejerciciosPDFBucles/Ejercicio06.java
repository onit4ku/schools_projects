package ejerciciosPDFBucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Escribe un programa que te escribe la tabla de multiplicar del número
		// que le introduzcas por teclado.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de la tabla de multiplicar: ");
		int num = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (i * num));
		}
	}
}