package varios;
import java.util.Scanner;

public class Potencia {

	// Calcular la potencia de un numero dada la base y el exponente

	public static void main(String[] args) {

		System.out.println("--- Calculadora de potencias ---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base");
		int base = sc.nextInt();
		System.out.println("Introduce el exponente");
		int exponente = sc.nextInt();

		double potencia = Math.pow(base, exponente);

		System.out.println(base + " a la " + exponente + " es: " + potencia);

	}

}
