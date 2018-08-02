package arrays;

import java.util.Scanner;

public class Billetes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el saldo: ");

		int[] unidades = { 200, 100, 50, 20, 10, 5, 2, 1 };

		int saldo = sc.nextInt(), parcial = 0, resto = saldo;

		int indice = 0;

		while (indice < unidades.length) {

			parcial = saldo / unidades[indice];

			resto = resto % unidades[indice];

			System.out.println("Unidades de " + unidades[indice] + ": " + parcial);

			System.out.println("resto: " + resto + " euros");
			indice++;
		}
	}

}