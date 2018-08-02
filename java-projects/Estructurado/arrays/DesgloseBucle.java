package arrays;

import java.util.Scanner;

public class DesgloseBucle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero: ");

		String vUnidades[] = { "Unidades", "Decenas", "Centenas", "Unidades de millar", "Decenas de millar",
				"Centenas de millar", "Millones" };

		int numero = sc.nextInt(), indice = 0, base = 10, resto = numero;

		while (numero > 0) {

			resto = numero % base;

			numero = numero / base;

			System.out.println(resto + " " + vUnidades[indice]);

			indice++;
		}
	}

}
