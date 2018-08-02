package varios;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		System.out.println("Hola Mundo otra vez");

		int numero1;
		int numero2;
		int resultado;
		double pi;
		String cadena;

		numero1 = 20;
		numero2 = 30;

		pi = 3.14;

		cadena = "esto es una cadena";

		resultado = numero1 + numero2;

		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(resultado);

		System.out.println(numero1 + "+" + numero2 + "=" + resultado);

		System.out.println(pi);

		System.out.println(cadena);

		int i = Integer.parseInt("2");
		System.out.println(i);

		double t = 10;
		t = t - 0.01;
		System.out.println(t);
	}
}
