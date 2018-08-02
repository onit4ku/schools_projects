package condicionales;

import java.util.Scanner;

public class EjercicioAgua {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la temperatura");
		double temperatura = sc.nextInt();

		if (temperatura <= 0) {
			System.out.println("Estado solido");
		} else if (temperatura > 0 && temperatura < 100) {
			System.out.println("Estado liquido");
		} else if (temperatura >= 100 && temperatura < 9000) {
			System.out.println("Estado Gaseoso");
		} else if (temperatura >= 9000) {
			System.out.println("It's Over 9000!!!");
		}
	}
}