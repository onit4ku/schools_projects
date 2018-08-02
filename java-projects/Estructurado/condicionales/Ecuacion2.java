package condicionales;

import java.util.Scanner;

public class Ecuacion2 {

	// Formula de la ecuacion cuadratica

	public static void main(String[] args) {
		double x1, x2, a, b, c, discriminante;

		Scanner tc = new Scanner(System.in);
		System.out.println("Introduce el valor de a");
		a = tc.nextInt();
		System.out.println("Introduce el valor de b");
		b = tc.nextInt();
		System.out.println("Introduce el valor de c");
		c = tc.nextInt();
		discriminante = ((b * b) - (4 * (a * c)));

		if (discriminante < 0) {
			System.out.println("No Tiene Soluciones Reales");
		}

		if (discriminante == 0) {
			System.out.println("Solo una raiz real");
			x1 = (-b) / (2 * a);
			System.out.println("La Solucion es, X1=X2 : " + x1);
		}

		if (discriminante > 0) {
			System.out.println("Tiene dos raices reales");
			x1 = (-b) + Math.sqrt(discriminante) / (2 * a);
			x2 = (-b) - Math.sqrt(discriminante) / (2 * a);
			System.out.println("La Solucion de X1 es = " + x1 + " y de X2 es = " + x2);
		}
	}
}
