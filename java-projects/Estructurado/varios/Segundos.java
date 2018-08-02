package varios;

import java.util.Scanner;

public class Segundos {
	public static void main(String[] args) {
		int segundos;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce segundos: ");
		segundos = sc.nextInt();

		int horas = segundos / 3600;
		segundos = segundos % 3600;
		int minutos = segundos / 60;
		segundos = segundos % 60;

		System.out.println("horas: " + horas);
		System.out.println("minutos: " + minutos);
		System.out.println("segundos: " + segundos);
	}
}