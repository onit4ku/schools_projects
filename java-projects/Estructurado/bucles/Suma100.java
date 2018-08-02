package bucles;

public class Suma100 {
	// Suma de los 100 primeros numeros

	public static void main(String[] args) {

		int res = 0, num = 1;
		while (num <= 100) {
			res = num + res;
			num++;

		}
		System.out.println(res);
	}
}