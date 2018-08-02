package arrays;

public class RandomEjer {

	public static void main(String[] args) {
		// poblar un array con valores aleatorios 0 - 100 y que muestre solo los
		// menores a 10
		int[] vector = new int[10];

		for (int i = 0; i < vector.length; i++) {
			int aleatorio = (int) (Math.random() * 100) + 1;
			vector[i] += aleatorio;

			if (vector[i] <= 10) {
				System.out.println(vector[i]);
			}
		}
	}
}