package condicionales;

import java.util.Scanner;

public class Antiguo {

	// Programa que muestra la gratificacion en un trabajo segun los años
	// trabajados y la distancia recorrida
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la antiguedad en anyos:");
		int antiguedad = sc.nextInt();

		System.out.println("Introduce la distancia en km:");
		int distancia = sc.nextInt();
		int gratificacion = 0;

		if (antiguedad < 5) {
			gratificacion = gratificacion + 60;
			if (distancia >= 20) {
				gratificacion += distancia;
			}
			System.out.println(gratificacion);
		} else if (antiguedad >= 5 && antiguedad <= 10) {
			gratificacion += gratificacion + 60;
			if (antiguedad > 5) {
				antiguedad = (antiguedad - 5) * 10;
				if (distancia >= 20) {
					gratificacion += distancia;
				}
				System.out.println(gratificacion);
			}
		} else if (antiguedad > 10) {
			gratificacion += 120;
			if (distancia >= 20) {
				gratificacion += distancia;
			}
			System.out.println(gratificacion);
		}

	}

}
