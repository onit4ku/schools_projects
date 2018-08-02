package bucles;

public class For {

	// tabla 9 for

	public static void main(String[] args) {

		int numero = 1, tabla = 9, resultado = numero * tabla;

		for (int i = 1; i <= 10; i++) {

			System.out.println(numero + " X " + tabla + " = " + resultado);
			numero++;
			resultado = numero * tabla;

		}
	}

}
