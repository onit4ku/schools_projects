package funciones;

import java.util.Scanner;

/*Escribe la función “QuitaEspaciosPro” a la que le pasamos una cadena y nos devuelve
la misma cadena pero con todos los espacios quitados (tanto los del principio como los
del final como los intermedios)*/

public class QuitaEspacios {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String teclado = sc.nextLine();
		QuitaEspaciosPro(teclado);
	}

	public static void QuitaEspaciosPro(String s) {
		char[] arrayChar = s.toCharArray();
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] == ' ') {
			} else {
				System.out.print(arrayChar[i]);
			}
		}
	}
}