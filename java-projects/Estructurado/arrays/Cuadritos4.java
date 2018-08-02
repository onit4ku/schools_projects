package arrays;

public class Cuadritos4 {

	public static void main(String[] args) {

		int numFilas = 3, numColumnas = 3;

		int[][] vMatriz = new int[numFilas][numColumnas];

		/*
		 * 
		 * 0  1  0
		 * 0  1  0  v
		 * 0  1  0
		 * 
		 * */

		// Poblar la matriz

		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
				vMatriz[f][c] = 0;
			}
		}

		// Imprimir la matriz

		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
					vMatriz[f][1] = 1;
					System.out.print(vMatriz[f][c]);
			}
			System.out.println();
		}
	}
}