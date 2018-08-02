package arrays;

public class PoblarPares {

	public static void main(String[] args) {
		// poblar un array con valores de numeros pares de los 100 primeros
		int[] vector = new int[100];

		for (int i = 0; i < vector.length; i++) {
			vector[i] += i;
			if (vector[i] % 2 == 0) {
				System.out.println(vector[i]);
			}
		}
	}
}