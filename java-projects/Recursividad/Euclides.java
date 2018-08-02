//Resolución del algoritmo de Euclides por recursividad
public class Euclides {
	// Si el resto de a/b es 0, el mcd es b.
	// En otro caso, el mcd es el mcd de b y el resto de a/b.

	/** a>0 y b>0 **/
	public static int euclides(int a, int b) {
		if (a % b == 0) // condición caso base.
			return b;
		else
			return euclides(b, a % b); // instrucción caso general.
	}

	public static void main(String[] args) {
		System.out.println(euclides(152, 247));

	}
}
