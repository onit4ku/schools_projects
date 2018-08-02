package ejerciciosPDFBucles;

public class Ejercicio12 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que nos escriba los 10 primeros números que no
		 * sean múltiplos ni de 2 ni de 3.
		 */
		int contador = 0;
			
			for (int i = contador; contador < 10; i++) {

				if (i % 2 != 0 && i % 3 != 0) {
					System.out.println(i);
					contador++;
				}
			}
		}
	}