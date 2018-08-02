package bucles;

public class MultiTabla {
	
//	

	public static void main(String[] args) {

		int numero = 0, tabla = 1, resultado = numero * tabla;

		while (tabla <= 10) {
			while (numero <= 9) {
				numero++;
				resultado = numero * tabla;
				System.out.println(numero + " X " + tabla + " = " + resultado);
			}
			tabla = tabla + 1;
			numero = 0;
			
			System.out.println("---------------------");
		}
	}
}
