package ejerciciosFernando;

public class SustituyeCaracter {

	public static void main(String[] args) {

		String cadenaFuente = "hola como estas";

		char letra = 'a';
		char nuevaLetra = 'b';

		String cadenaDestino = "";

		for (int i = 0; i < cadenaFuente.length(); i++) {
			char letraTMP = cadenaFuente.charAt(i);
			if (letraTMP == letra) {
				letraTMP = nuevaLetra;
			}
			cadenaDestino = cadenaDestino + letraTMP;
		}

		System.out.println(cadenaFuente);
		System.out.println(cadenaDestino);

	}

}
