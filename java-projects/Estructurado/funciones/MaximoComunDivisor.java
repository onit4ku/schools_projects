package funciones;

import java.util.Scanner;

public class MaximoComunDivisor {

	// Escribe un programa que calcule el máximo común divisor de 2 números.
	public static void main(String[] args) {
		System.out.println("Introduce dos numeros para calcular su mcd ");
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("¿Cuál es el mcd de " + num1 + " y " + num2 + "? Es :" + obtener_mcd(num1, num2));
	}

	static int obtener_mcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return obtener_mcd(b, a % b);
	}
}