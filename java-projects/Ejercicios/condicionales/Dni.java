package condicionales;

import java.util.Scanner;

public class Dni {

	public static void main(String[] args) {

		// calcular la letra del dni

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el dni sin la letra");
		int dni = teclado.nextInt();

		int resto = dni % 23;

		switch (resto) {
		case 0:
			System.out.println("letra T");
			break;
		case 1:
			System.out.println("letra R");
			break;
		case 2:
			System.out.println("letra W");
			break;
		case 3:
			System.out.println("letra A");
			break;
		case 4:
			System.out.println("letra G");
			break;
		case 5:
			System.out.println("letra M");
			break;
		case 6:
			System.out.println("letra Y");
			break;
		case 7:
			System.out.println("letra F");
			break;
		case 8:
			System.out.println("letra P");
			break;
		case 9:
			System.out.println("letra D");
			break;
		case 10:
			System.out.println("letra X");
			break;
		case 11:
			System.out.println("letra B");
			break;
		case 12:
			System.out.println("letra N");
			break;
		case 13:
			System.out.println("letra J");
			break;
		case 14:
			System.out.println("letra Z");
			break;
		case 15:
			System.out.println("letra S");
			break;
		case 16:
			System.out.println("letra Q");
			break;
		case 17:
			System.out.println("letra V");
			break;
		case 18:
			System.out.println("letra H");
			break;
		case 19:
			System.out.println("letra L");
			break;
		case 20:
			System.out.println("letra C");
			break;
		case 21:
			System.out.println("letra K");
			break;
		case 22:
			System.out.println("letra E");
			break;

		default:
			System.out.println("Inválido");
			break;
		}
	}

}
