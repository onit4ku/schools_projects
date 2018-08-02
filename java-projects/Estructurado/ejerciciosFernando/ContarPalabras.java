package ejerciciosFernando;

public class ContarPalabras {

	public static void main(String[] args) {

		String cadena = "esto es una frase";

		char c = ' ';

		int i = 0;
		int numPalabras = 0;

		if (cadena.charAt(0) == ' ') {
			numPalabras--;
		}
		while (i <= cadena.length() - 1) {

			c = cadena.charAt(i);
			if (c == ' ') {
				numPalabras++;
			}

			System.out.print(c);
			i++;
		}

		if (c != ' ') {
			numPalabras++;
		}
		System.out.println();
		System.out.print("numPalabras: " + numPalabras);

	}

}
