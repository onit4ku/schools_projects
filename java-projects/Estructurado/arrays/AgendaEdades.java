package arrays;

import java.util.Scanner;

public class AgendaEdades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numPersonas = 3, numColumnas = 2;

		double suma = 0, media = suma / numPersonas;
		String vPersonas[][] = new String[numPersonas][numColumnas];

		System.out.println("******** Agenda **********");

		// Creación del array.

		for (int f = 0; f < numPersonas; f++) {
			System.out.println("***************************");
			System.out.println("Dame el nombre de la persona: ");
			vPersonas[f][0] = sc.nextLine();
			System.out.println("Dame la edad: ");
			vPersonas[f][1] = sc.nextLine();
		}

		// Calculo de la media, mayor edad.

		int mayor = Integer.parseInt(vPersonas[0][1]);

		for (int i = 0; i < numPersonas; i++) {
			suma += Integer.parseInt(vPersonas[i][1]);
			media = suma / numPersonas;

			if (mayor < Integer.parseInt(vPersonas[i][1])) {
				mayor = Integer.parseInt(vPersonas[i][1]);
			}
		}
		// Listar el array

		for (int i = 0; i < numPersonas; i++) {
			System.out.println();
			for (int c = 0; c < numColumnas; c++) {
				System.out.print(vPersonas[i][c] + " ");
			}
		}

		System.out.println("\nLa media es: " + media);
		System.out.println("El mayor es: " + mayor);

	}
}
