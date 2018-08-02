package bucles;

public class ArbolNavidad {

	public static void main(String[] args) {

		int filas = 1, valor = 0;

		while (filas <= 10) {
			int numFila = filas;

			while (numFila > 0) {

				System.out.print(valor);
				filas--;
				numFila++;

			}
			filas++;

			System.out.println();
		}
	}

}
