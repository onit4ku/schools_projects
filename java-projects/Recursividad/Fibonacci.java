//Resolución del algoritmo de la sucesión de Fibonacci por recursividad.

// 0 1 1 2 3 5 8 13 21 ...

// Si n <=1, el valor del termino n-esimo es n.
// En otro caso, es la suma de los terinos (n -1) -esimo y (n-2)-esimo.

public class Fibonacci {

	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		System.out.println("El fibonacci de 30 es: " + fibonacci(30)); //hace 2.692.537 llamadas yuju
	}
}