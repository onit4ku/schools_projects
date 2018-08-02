package ejerciciosFernando;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palabra = "hola";

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

			if (vidas == 0) {
				System.out.println("Perdiste");
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
			System.out.println("*****************************");
		}
	}

}
