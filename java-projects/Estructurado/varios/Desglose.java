package varios;


import java.util.Scanner;

public class Desglose {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero: ");

		int numero = sc.nextInt(), unidades = 0, decenas = 0, centenas = 0, millar = 0;

		millar = numero / 1000;

		if (numero % 1000 != 0) {
			centenas = numero % 1000 / 100;
		}
		if (numero % 100 != 0) {
			decenas = numero % 1000 / 10;
		}
		if (numero % 10 != 0) {
			unidades = numero % 1000 / 1;

		}
		System.out.println("El numero: " + numero + " tiene:");
		System.out.println("Unidades de millar: " + millar);
		System.out.println("Centenas: " + centenas);
		System.out.println("Decenas: " + decenas);
		System.out.println("Unidades: " + unidades);

	}

}
