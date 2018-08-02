package funciones;

import java.util.Scanner;

public class SustituyeCaracter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		String cadenaFuente = sc.nextLine();
		System.out.println("Letra a reemplazar: ");
		char letra = sc.nextLine().charAt(0);
		System.out.println("Introduce un caracter para reemplazar: ");
		char nuevaLetra = sc.nextLine().charAt(0);

		//String para guardar la cadena final
		String cadenaDestino = "";
		
		for (int i = 0; i < cadenaFuente.length(); i++) {
			char letraTMP = cadenaFuente.charAt(i);
			if (letraTMP == letra) {
				letraTMP = nuevaLetra;
			}
			cadenaDestino = cadenaDestino + letraTMP;
		}
		System.out.println(cadenaFuente);
		System.out.println(cadenaDestino);
	}
}
