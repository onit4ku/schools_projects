package arrays;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Diccionario de palabras
		String[] palabras = new String[] { "pikachu", "charmander", "gyarados", "venusaur", "zapdos", "articuno" };

		// Obtener la palabra
		String palabra = "";
		int n = 0;
		n = (int) (Math.random() * 6);
		palabra = palabras[n];

		// Matriz aciertos
		boolean aciertos[] = new boolean[palabra.length()];

		int vidas = 3;

		while (vidas > 0) {
			System.out.print("Dime una letra: ");
			char letra = sc.nextLine().charAt(0);

			boolean acierto = false;
			for (int i = 0; i < palabra.length(); i++) {
				if (letra == palabra.charAt(i)) {
					aciertos[i] = true;
					acierto = true;
				}
			}

			if (acierto != true) {
				vidas--;
			}

			System.out.println("Vidas: " + vidas);
			// imprimir
			for (int i = 0; i < palabra.length(); i++) {
				if (aciertos[i] == true) {
					System.out.print(" " + palabra.charAt(i) + " ");
				} else {
					System.out.print(" _ ");
				}
			}
			System.out.println();
			System.out.println();
		}
	}

}
