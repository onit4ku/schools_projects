public class Potencias {
	public static double potencia(double a, int n) {

		if (n == 0) { // condicion del caso base
			return 1; // instruccion caso base
		} else {
			return potencia(a, n - 1) * a; // instrucciones caso general
		}
	}

	public static void main(String[] args) {

		System.out.println(potencia(2, 8));

	}
}