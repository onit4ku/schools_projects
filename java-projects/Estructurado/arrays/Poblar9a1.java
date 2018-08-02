package arrays;

public class Poblar9a1 {

	public static void main(String[] args) {
		// poblar un array con valores del 9 al 1
		int[] vector = new int[10];

		for (int i = 1; i < vector.length; i++) {
			vector[i] = 10-i;
			System.out.println(vector[i]);
		}
	}
}