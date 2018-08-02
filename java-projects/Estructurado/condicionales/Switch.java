package condicionales;
import java.util.Scanner;

public class Switch {

	/*
	 * Realiza un programa que pida una cadena y que muestre por pantalla los
	 * siguientes resultados: a. ROJO, en el caso de que la cadena introducida
	 * sea “rojo” b. AZUL, en el caso de que la cadena introducida sea “azul”.
	 * c. VERDE-AMARILLO en el caso de que la cadena sea o bien “verde” o bien
	 * “amarillo”. d. “OTRO COLOR”, en cualquier otro caso.
	 *
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el color:");
		String color = sc.next();

		switch (color) {

		case "rojo":
			System.out.println("ROJO");

			break;
		case "azul":
			System.out.println("AZUL");

			break;
		case "verde":
			System.out.println("VERDE-AMARILLO");
			break;
		case "amarillo":
			System.out.println("VERDE-AMARILLO");

			break;
		default:
			System.out.println("OTRO COLOR");

		}

	}

}
