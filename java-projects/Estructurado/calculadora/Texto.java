package calculadora;

public class Texto {
	public static void menu() {

		System.out.println("---------------------");

		System.out.println("1 : Sumar");
		System.out.println("2 : Restar");
		System.out.println("3 : Multiplicar");
		System.out.println("4 : Dividir");
		System.out.println("5 : Salir");

		System.out.println("---------------------");

		System.out.println("Introduce la operacion: ");
	}

	public static void num1() {
		System.out.println("Introduce el primer numero: ");

	}

	public static void num2() {
		System.out.println("Introduce el segundo numero: ");

	}

	public static void title() {
		System.out.println("Calculadora JAVA: ");

	}

	public static void exit() {
		System.out.println("Saliendo de la calculadora");
	}

	public static void invalida() {
		System.out.println("Opcion invalida");
	}

	public static void resultado(double numero1, double numero2) {
		System.out.print("El resultado de la suma de " + numero1 + " y " + numero2 + " es igual a:  ");
	}

}
