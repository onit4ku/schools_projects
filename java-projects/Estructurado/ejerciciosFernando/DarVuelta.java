package ejerciciosFernando;

public class DarVuelta {

	public static void main(String[] args) {

		int size = 5;
		int[] vRandom = new int[size];
		int[] vReves = new int[size];

		// generacion
		for (int i = 0; i < vRandom.length; i++) {
			vRandom[i] = (int) (Math.random() * 100);
		}
		// dar vuelta
		int indice = 0;
		for (int i = vRandom.length - 1; i >= 0; i--) {
			vReves[i] = vRandom[indice];
			indice++;
		}

		// impresion vRandom
		for (int i = 0; i < vRandom.length; i++) {
			System.out.print(vRandom[i] + " ");
		}
		System.out.println();
		// impresion vReves
		for (int i = 0; i < vReves.length; i++) {
			System.out.print(vReves[i] + " ");
		}

	}

}
