package bucles;

public class MultiTablas {
//	programa que muestra las tablas de multiplicar del 1 al 10 usando dos for anidados

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
