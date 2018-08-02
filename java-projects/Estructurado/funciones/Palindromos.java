package funciones;

import java.util.Scanner;

public class Palindromos {

	public static void main(String[] args) {
		/*
		 * Escribe la función “EsPalindromo” a la que le pasamos una cadena y
		 * nos dice si la cadena es un palíndromo (true) o no (false). Un
		 * palíndromo es una palabra o frase que se lee igual al revés que al
		 * derecho.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra para ver si es palindromo:");
		String palabra = sc.nextLine();

		System.out.println("Palabra utilizada: " + palabra);
		if (EsPalindromo(palabra))
			System.out.println("Es palindromo.");
		else
			System.out.println("No es palindromo.");
	}

	static boolean EsPalindromo(String palabra) {
		// Quitar espacios y convertirlo a minusculas para hacer las
		// comparaciones
		String modificado = palabra.replaceAll(" ", "").toLowerCase();
		int i = 0;
		while (i < modificado.length() / 2) {
			if (modificado.charAt(i) != modificado.charAt(modificado.length() - 1 - i))
				return false;
			i++;
		}
		return true;
	}
}
