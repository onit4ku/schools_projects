package ejerciciosFernando;

public class Vectores {

	// vector 100 primeros numeros pares
	public static void main(String[] args) {
		int v[];
		v = new int[100];
		int num = 2;
		for (int i = 0; i < v.length; i++) {
			v[i] = num;
			num = num + 2;
		}
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
}