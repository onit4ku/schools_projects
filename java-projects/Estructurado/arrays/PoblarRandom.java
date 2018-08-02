package arrays;

public class PoblarRandom {

	public static void main(String[] args) {
		//poblar un array con valores aleatorios
		int[] vector = new int[10];

		for (int i = 0; i < vector.length; i++) {
			int aleatorio = (int) (Math.random() * 20) + 1;
			vector[i] += aleatorio;
			System.out.println(vector[i]);
		}
	}
}