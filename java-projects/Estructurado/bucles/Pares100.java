package bucles;

public class Pares100 {
	// Muestra los numeros pares del 1 al 100
	public static void main(String[] args) {
		int num = 1, res = 0;

		while (num <= 100) {
			if (num % 2 == 0) {
				System.out.println(num);
				res = num + res;
				num++;
			}
			num++;
		}
	}
}