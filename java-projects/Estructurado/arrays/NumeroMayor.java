package arrays;

import java.io.*;

/*
 * Leer 10 enteros, almacenarlos en un vector y determinar en
 * qu� posici�n del vector est� el mayor n�mero le�do.
 */

public class NumeroMayor {

	public static void main(String[] args) throws IOException {
		int v[] = new int[10];
		BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese los elementos del vector...");

		for (int i = 0; i < 10; i++) {
			System.out.print("Elemento " + i + " del vector: ");
			v[i] = Integer.parseInt(dato.readLine());
		}

		int mayor = v[0];

		for (int i = 1; i < 10; i++) {
			if (mayor < v[i]) {
				mayor = v[i];
			}
		}
		System.out.print("El mayor numero ingresado es: " + mayor);
	}
}
