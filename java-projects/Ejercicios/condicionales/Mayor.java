package condicionales;

import java.util.Scanner;

public class Mayor {

	// dados 3 numeros calcular el mayor
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		int num2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero");
		int num3 = teclado.nextInt();

		if (num > num2) {
			if (num > num3) {
				System.out.println(num + " es el mayor.");
			}
		} else if (num < num2 && num2 > num3) {
			System.out.println(num2 + " es el mayor");
		} else if (num3 > num2 && num < num3) {
			System.out.println(num3 + " es el mayor");
		}
	}

}
