package pdfSelectivas;

import java.util.Scanner;

public class Ejercicio1 {

	// Escriba un programa que lea un dato de la entrada est�ndar y calcule e
	// imprima su inverso. Considere el caso
	// especial del valor 0, en cuyo caso EL PROGRAMA deber� mostrar el mensaje
	// "ERROR - divisi�n por cero".

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextDouble();
		double inverso = 1 / numero;

		if (numero == 0) {
			System.out.println("ERROR - divisi�n por cero");
		} else {
			System.out.println(inverso);

		}

	}

}
