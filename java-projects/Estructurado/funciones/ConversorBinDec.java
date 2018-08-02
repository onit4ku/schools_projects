package funciones;

import java.util.Scanner;

public class ConversorBinDec {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero en binario: ");
		String teclado = sc.nextLine();
		System.out.println("Resultado en base 10: ");
		bin2Decimal(teclado);
	}

	public static void bin2Decimal(String s) {
		int decimal = Integer.parseInt(s, 2);
		System.out.println(decimal);
	}
}