package ejerciciosFernando;

public class NumeroVocales {

	public static void main(String[] args) {
		
		String cadena="esto es una cadena";
		
		int numVocales=0;
		
		for(int i=0; i < cadena.length(); i++){
			if (cadena.charAt(i)=='a' 	|| 
				cadena.charAt(i)=='e'	|| 
				cadena.charAt(i)=='i' 	|| 
				cadena.charAt(i)=='o'	|| 
				cadena.charAt(i)=='u' 
				){
				numVocales++;
			}			
		}
		System.out.println(numVocales);
	}

}
