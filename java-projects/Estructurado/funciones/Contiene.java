package funciones;

import java.util.Scanner;

public class Contiene {
	/*
	 * 
	 * Escribe la funci�n �Contiene� a la que le pasamos una cadena y un
	 * car�cter por par�metro y nos dice si el car�cter aparece en la cadena o
	 * no. Es igual que la funci�n Contains. Evidentemente, no pod�is usar esta
	 * funci�n para hacer la vuestra
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String teclado = sc.nextLine();
		System.out.println("Introduce un caracter: ");
		char caracter = sc.nextLine().charAt(0);
		
		Contienes(teclado,caracter);

	}

	public static void Contienes(String s,char c) {
		int contador = 0;
		char[] arrayChar = s.toCharArray();
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] == c) {
				contador += 1;
			}
		}
		System.out.println("El caracter '"+c+"' est� en la cadena: "+contador + " veces.");
	}
}