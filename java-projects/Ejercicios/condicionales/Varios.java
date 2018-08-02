package condicionales;
import java.util.Scanner;

public class Varios {

	//// Realiza un programa que al introducir un numero por consola muestre los
	//// siguientes resultados:
	// a. S1 si el numero es <10 e impar
	// b. S2 si el numero está entre 10 y 20 y además es par
	// c. S3 si el número es múltiplo de 3 y NO cumple la condición A.
	// d. S4 si el numero es mayor que 20 y múltiplo de 7, o bien si es mayor
	//// que 50.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = sc.nextInt();

		if (numero < 10 && numero % 2 != 0) {
			System.out.println("S1");
		} else if (numero >= 10 && numero <= 20 && numero % 2 == 0) {
			System.out.println("S2");

		} else if (numero % 3 == 0) {
			if (numero < 10 && numero % 2 != 0) {

			} else {
				System.out.println("S3");
			}

		} else if (numero > 20 && numero % 7 == 0 || numero > 50) {
			System.out.println("S4");

		}

	}

}
