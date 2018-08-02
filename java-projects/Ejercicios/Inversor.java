
public class Inversor {

	public static void main(String[] args) {
		String nombre = "RUBEN";
		int valor = nombre.length();

		String resultado = nombre.charAt(valor - 1) + "" + nombre.charAt(valor - 2) + "" + nombre.charAt(valor - 3) + ""
				+ nombre.charAt(valor - 4) + "" + nombre.charAt(valor - 5);

		System.out.println(resultado);
	}
}
