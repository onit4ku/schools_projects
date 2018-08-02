package varios;
import java.util.Scanner;

public class OperacionesBasicas {
	// Operaciones basicas mediante métodos
	public static double suma(double a, double b) {
		return a + b;
	}

	public static double resta(double a, double b) {
		return a - b;
	}

	public static double multiplicacion(double a, double b) {
		return a * b;
	}

	public static double division(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {

		String hola = "Operaciones basicas:";

		System.out.println(hola);

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int a = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		int b = teclado.nextInt();

		System.out.println("El resultado de la suma de " + a + " y " + b + " es igual a:  " + suma(a, b));
		System.out.println("El resultado de la resta de " + a + " y " + b + " es igual a:  " + resta(a, b));
		System.out.println(
				"El resultado de la multiplicacion de " + a + " y " + b + " es igual a:  " + multiplicacion(a, b));
		System.out.println("El resultado de la division de " + a + " y " + b + " es igual a:  " + division(a, b));

	}
}
