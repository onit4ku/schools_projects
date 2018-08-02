package arrays;

public class Cuadritos5 {

	public static void main(String[] args) {

		int numFilas = 3, numColumnas = 3;

		int[][] vMatriz = new int[numFilas][numColumnas];

		/*
		 * 
		 * 0  0  0
		 * 1  1  1  v
		 * 0  0  0
		 * 
		 * */

		// Poblar la matriz

		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
			}
		}

		// Imprimir la matriz

		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
				vMatriz[1][c] = 1;
				System.out.print(vMatriz[f][c]);
			}
			System.out.println();
		}
	}

}
