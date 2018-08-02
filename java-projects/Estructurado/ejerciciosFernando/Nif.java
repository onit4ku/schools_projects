package ejerciciosFernando;

public class Nif {

	public static void main(String[] args) {
		String CADENANIF = "TRWAGMYFPDXBNJZSQVHLCKE";

		int dni = 12345678;

		System.out.println(CADENANIF.charAt(dni % 23));

		System.out.println("TRWAGMYFPDXBNJZSQVHLCKE".charAt(12345678 % 23));
	}

}
