package bucles;

public class WhileTabla {

	// tabla del 8

	public static void main(String[] args) {

		int numero = 1, tabla = 8, resultado = numero * tabla;

		while (numero <= 10) {
			System.out.println(numero + " X " + tabla + " = " + resultado);
			numero++;
			resultado = numero * tabla;
		}
	}

}
