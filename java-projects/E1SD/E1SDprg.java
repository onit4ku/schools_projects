/**
 * Ejercicio 1 Seguimiento Docente - Grupo 1F.
 * 
 * @author (Rubén García Serrano)
 * @version (04/02/2015)
 */
public class E1SDprg {
	// variables

	/**
	 * Constructor para objetos de la clase E1SD
	 */
	public E1SDprg() {

	}

	// Ejercicio1
	/**
	 * Escribir un método recursivo tal que, dado un número entero n ≥ 0, en
	 * sistema decimal, y un número entero b en el rango [2, 9], muestre en la
	 * salida estándar la codificación de n en base b.
	 */
	public static void cambioBase(int n, int b) {
		if (n < b) {
			System.out.print(n);
		} else {
			cambioBase(n / b, b);
			System.out.print(n % b);
		}
	}

	// Ejercicio 2
	/**
	 * Escribir un método recursivo tal que dado un carácter c que sea letra:
	 * devuelva, si c es minúscula, una cadena de caracteres formada por todos
	 * los caracteres desde c hasta ‘a’ y por todos los caracteres desde ‘a’
	 * hasta c. devuelva, si c es mayúscula, una cadena de caracteres formada
	 * por todos los caracteres desde c hasta ‘A’ y por todos los caracteres
	 * desde ‘A’ hasta c.
	 */
	public static String lineaChar(char c) {
		String palabra = "";
		return palabra;
	}

	// Ejercicio 3
	/**
	 * Escribir un método tal que, dada una progresión aritmética, identificada
	 * por su término inicial, a1, y por su diferencia, d, y dado un cierto
	 * número natural, n, devuelva un array de enteros que contenga, en el orden
	 * adecuado, los n primeros elementos de dicha progresión aritmética. El
	 * método ha de tener el siguiente perfil:
	 */
//	public static int[] creaProgAritmetica (int a1, int d, int n){
//		int[] cipriano;
//		return cipriano[];
//	}
	
	/**Este método no será recursivo, y debe implementarse como lanzadera del siguiente mé-
	todo, que sí será recursivo. Este método se limitará a dimensionar adecuadamente el
	array resultado e invocar al siguiente método, el recursivo, que se encargará de rellenar
	el array con los valores que corresponda. */
	/**
		 * Escribir otro método, también llamado creaProgAritmetica, con las siguientes características:
			• Su acceso será privado (private) y no tendrá tipo de retorno (void).
			• Resolverá el problema descrito antes, usando un algoritmo recursivo.
			• Tendrá los mismos argumentos del anterior método (a1, d, n), y un argumento
			más: el array instanciado en el método lanzadera. 
	**/
	
	// metodo mierder

	/**
	 * Método main para la ejecución de los métodos.
	 */
	public static void main(String[] args) {
		// Uso del método del ejercicio1 cambioBase
		System.out.print("Ejercicio1 cambioBase \n");
		cambioBase(8, 2);
		System.out.println();
		cambioBase(31, 2);
		System.out.println();
		cambioBase(12, 5);
		System.out.println();
		cambioBase(77, 5);
		System.out.println();
		cambioBase(9, 8);
		System.out.println();
		cambioBase(93, 8);
		System.out.println();

		// Uso del método del ejercicio2 lineaChar
		System.out.println("\nEjercicio2 lineaChar \n");
		System.out.println(lineaChar('a'));
		System.out.println(lineaChar('F'));
		System.out.println(lineaChar('q'));

		// Uso del método del ejercicio3 creaProgAritmetica
//		int[] a = creaProgAritmetica(2, -1, 12);
//		for (int i = 0; i <= a.length - 1; i++)
//			System.out.print(a[i] + ", ");
//		System.out.println();
//		int[] b = creaProgAritmetica(1, 3, 9);
//		for (int i = 0; i <= b.length - 1; i++)
//			System.out.print(b[i] + ", ");
//		System.out.println();
//		int[] c = creaProgAritmetica(7, 0, 4);
//		for (int i = 0; i <= c.length - 1; i++)
//			System.out.print(c[i] + ", ");

	}
}