package arrays;

public class SumaValores {
	// suma de los valores de un array
	public static void main(String[] args) {
		int[] matriz2 = { 1, 5, 7, 8, 30 };

		int suma = 0;
		for (int i = 0; i < matriz2.length; i++) {
			suma += matriz2[i];
		}
		System.out.println(suma);
	}
}