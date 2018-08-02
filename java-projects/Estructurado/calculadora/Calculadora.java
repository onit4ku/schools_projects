package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Texto.title();

		int menu = 1;
		double numero1, numero2;

		do {

			Texto.menu();
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				Texto.num1();
				numero1 = sc.nextDouble();
				Texto.num2();
				numero2 = sc.nextDouble();

				Texto.resultado(numero1, numero2);
				System.out.print(Operaciones.suma(numero1, numero2));
				System.out.println();
				break;

			case 2:
				Texto.num1();
				numero1 = sc.nextDouble();
				Texto.num2();
				numero2 = sc.nextDouble();

				Texto.resultado(numero1, numero2);
				System.out.print(Operaciones.resta(numero1, numero2));
				System.out.println();
				break;

			case 3:
				Texto.num1();
				numero1 = sc.nextDouble();
				Texto.num2();
				numero2 = sc.nextDouble();

				Texto.resultado(numero1, numero2);
				System.out.print(Operaciones.multiplicacion(numero1, numero2));
				System.out.println();
				break;
			case 4:
				Texto.num1();
				numero1 = sc.nextDouble();
				Texto.num2();
				numero2 = sc.nextDouble();

				Texto.resultado(numero1, numero2);
				System.out.print(Operaciones.division(numero1, numero2));
				System.out.println();
				break;

			case 5:
				Texto.exit();
				break;
			default:
				Texto.invalida();
				break;
			}
		} while (menu != 5);
	}
}
