package ejerciciosFernando;

public class Cifrado {

	public static void main(String[] args) {
		
		String nombre;
		String nombreCifrado;
		int longitud;
		
		nombre="FERNANDO";
		nombreCifrado="";
		longitud=nombre.length()-1;
		
		nombreCifrado=nombreCifrado+nombre.charAt(longitud);
		
		longitud=longitud-1;
		nombreCifrado=nombreCifrado+nombre.charAt(longitud);
		
		longitud=longitud-1;
		nombreCifrado=nombreCifrado+nombre.charAt(longitud);
		
		longitud=longitud-1;
		nombreCifrado=nombreCifrado+nombre.charAt(longitud);
		
		longitud=longitud-1;
		nombreCifrado=nombreCifrado+nombre.charAt(longitud);
		
		longitud=longitud-1;
		nombreCifrado=nombreCifrado+nombre.charAt(longitud);
		
		
		
		System.out.println(nombreCifrado);
	}

}
