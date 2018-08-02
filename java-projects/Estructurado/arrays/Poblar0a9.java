package arrays;

public class Poblar0a9 {

	public static void main(String[] args) {
		// poblar un array con valores del 0 al 9
		int[] vector = new int[10];

		for (int i = 0; i < vector.length; i++) {
			vector[i] += i;
			System.out.println(vector[i]);
		}
	}
}