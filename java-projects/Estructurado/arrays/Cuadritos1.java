package arrays;

public class Cuadritos1 {

	public static void main(String[] args) {

		int numFilas = 3, numColumnas = 3;

		int[][] vMatriz = new int[numFilas][numColumnas];

		int num = 0;
		/*
		 * 
		 * 0  1  0
		 * 3  0  5  v
		 * 0  7  0
		 * 
		 * */

		// Poblar la matriz

		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
				vMatriz[f][c] = num;
				num++;
			}
		}

		// Imprimir la matriz

		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
				if (vMatriz[f][c] % 2 != 0){
					System.out.print(vMatriz[f][c]);
				}else{
					System.out.print(vMatriz[f][c] = 0);
				}
			}
			System.out.println();
		}
	}

}
