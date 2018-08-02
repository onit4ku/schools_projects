package bucles;

public class MultiTablas {
	// programa que muestra las tablas de multiplicar del 1 al 10 usando dos for
	// anidados

	public static void main(String[] args) {

		for (int operando = 1; operando <= 10; operando++) {
			for (int tabla = 1; tabla <= 10; tabla++) {
				System.out.println(operando + " X " + tabla + " = " + operando * tabla);
			}
			System.out.println("------------");
		}
	}
}
