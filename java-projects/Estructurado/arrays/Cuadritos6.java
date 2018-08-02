package arrays;

public class Cuadritos6 {

	public static void main(String[] args) {

		int numFilas = 3, numColumnas = 3;

		int[][] vMatriz = new int[numFilas][numColumnas];

		/*
		 * 
		 * 1  0  1
		 * 0  1  0
		 * 1  0  1
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
				if((f + c) == 2 || f == c){
				System.out.print(vMatriz[f][c]=1);}else{
					System.out.print(vMatriz[f][c]);
				}
			}
			System.out.println();
		}
	}
}