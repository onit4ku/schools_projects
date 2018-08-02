package bucles;

public class TablaInversaWhile {

	// tabla del 7 inversa

	public static void main(String[] args) {

		int numero = 10, tabla = 8, resultado = numero * tabla;

		while (numero >= 1) {
			System.out.println(numero + " X " + tabla + " = " + resultado);
			numero--;
			resultado = numero * tabla;
		}
	}
}
