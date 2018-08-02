public class Resto {
	// Recursividad lineal final
	public static int resto(int a, int b) {
		/** a >= 0 y b>0 resto de a/b */
		// si a < b, resto de a/b es a
		if (a < b) {
			return a;
			// en otro caso, resto de a/b es el resto de (a-b)/b
		} else {
			return resto(a - b, b);
		}
	}

	public static void main(String[] args) {
		System.out
				.println("(recursivo) El resto de la division entera de 75/18 es: "
						+ resto(75, 18));

		System.out
				.println("(utilizando el %)  El resto de la division entera de 75/18 es: " + 75 % 18);

	}
}