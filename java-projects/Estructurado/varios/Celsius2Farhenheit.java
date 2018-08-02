package varios;
import java.util.Scanner;

// Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
// La fórmula correspondiente es: F = 32 + ( 9 * C / 5)

public class Celsius2Farhenheit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double celsius, fahrenheit;
		System.out.println("Introduce los grados en celsius");
		celsius = sc.nextDouble();
		fahrenheit = 32 + (9* celsius / 5);
		
		System.out.println(fahrenheit+"º Farhenheit");
	}

}
