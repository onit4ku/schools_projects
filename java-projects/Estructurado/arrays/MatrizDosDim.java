package arrays;

public class MatrizDosDim {

	public static void main(String[] args) {

		int nFilas = 2, nColumnas = 2;
		int[][] vMatriz = new int[nFilas][nColumnas];

		// Rellenar matriz

		int num = 4;

		for (int f = 0; f < nFilas; f++) {
			for (int c = 0; c < nColumnas; c++) {
				vMatriz[f][c] = num;
				num--;
			}
		}

		// Imprimir matriz
		for (int f = 0; f < nFilas; f++) {
			for (int c = 0; c < nColumnas; c++) {
				System.out.print(vMatriz[f][c]);
			}
			System.out.println();
		}
	}
}
