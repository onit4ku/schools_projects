public class Factorial {
	public static int fact(int n) {
		if (n == 0)
			return 1; // caso base
		else
			return n * fact(n - 1); // caso general
	}

	public static void main(String[] args) {
		System.out.println(fact(5));
	}
}