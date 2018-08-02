package bucles;

public class MultiTabla {
	
//	

	public static void main(String[] args) {

		int numero = 1, tabla = 1, resultado = numero * tabla;

		while (tabla <= 10) {
			while (numero <= 10) {
				System.out.println(numero + " X " + tabla + " = " + resultado);
				numero++;
				resultado = numero * tabla;
			}
			tabla = tabla + 1;
			numero = 1;
			
			System.out.println("---------------------");
		}
	}
}
