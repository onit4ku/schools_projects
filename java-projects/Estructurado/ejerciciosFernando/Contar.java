package ejerciciosFernando;

public class Contar {

	public static void main(String[] args) {
		String cadena;
		int numA;
		
		numA=0;
		
		cadena="laura";
		
		int longitud=cadena.length()-1;
		int indice=0;
		while(indice <= longitud){
			
			char letra=cadena.charAt(indice);		
			
			if (letra == 'a' || letra == 'A'){
				numA++;
			}			
			indice++;
		}
		System.out.println(cadena);
		System.out.println("la cadena tiene "+numA+ " a");
		
		
	}

}
