package funciones;

import java.util.Scanner;

public class MinimoComunMultiplo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Pedimos los dos números al usuario
		System.out.println("Ingrese el primer numero");
		int num1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero");
		int num2 = scan.nextInt();
		// Seleccionamos el menor entre num1 y num2
		int min = Math.min(num1, num2);
		// Inicializamos la variable mcm que será la que
		// almacenará el resultado final
		int mcm = 0;
		// Inicializamos el ciclo for a través del cual
		// se realizarán las iteraciones
		for (int i = 1; i <= min; i++) {
			// Realizamos la condición para saber si el módulo de num1 y
			// num2 entre cada uno de los números enteros positivos menores
			// o igual al menor de los dos, es equivalente a 0, y de serlo
			// procedemos a realizar el proceso
			if (num1 % i == 0 && num2 % i == 0) {
				// Se asigna como mcd a cada uno de los números que cumpla
				// con la condición indicada. Sin embargo, el Máximo
				// Común Divisor será solamente el último número que las
				// cumpla antes de finalizar ciclo
				int mcd = i;
				// Se calcula el mínimo común múltiplo
				mcm = (num1 * num2) / mcd;
			}
		}
		// Se muestra el resultado en pantalla
		System.out.println("El M.C.M. entre " + num1 + " y " + num2 + " es: " + mcm);
	}

}