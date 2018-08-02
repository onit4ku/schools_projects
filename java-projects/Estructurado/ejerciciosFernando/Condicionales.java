package ejerciciosFernando;

public class Condicionales {

	public static void main(String[] args) {
		int temperatura;

		temperatura = 101;

		if (temperatura <= 0) {
			System.out.println("solido");
		}

		if (temperatura > 0 && temperatura < 100) {
			System.out.println("liquido");
		}

		if (temperatura >= 100) {
			System.out.println("gaseoso");
		}

		if (temperatura <= 0) {
			System.out.println("solido");
		} else {
			if (temperatura < 100) {
				System.out.println("liquido");
			} else {
				System.out.println("gaseoso");
			}
		}
		char c = 'a';
		int t = c;
		System.out.println(t);
	}
}
