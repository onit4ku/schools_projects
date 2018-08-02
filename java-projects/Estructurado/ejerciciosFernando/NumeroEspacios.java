package ejerciciosFernando;

public class NumeroEspacios {

	public static void main(String[] args) {
		
		String cadena="esto es una  cadena ";
		
		int numEspacios=0;
		for (int i=0; i < cadena.length();i++){
			if (cadena.charAt(i)==' '){
				numEspacios++;
			}			
		}
		
		System.out.println(numEspacios);
		
		

	}

}
