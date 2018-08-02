package ejerciciosFernando;

public class Letras {

	public static void main(String[] args) {
		
		
		
		String cadena;
		cadena="paco";
		
		char letra;
		
		
		

		int indiceLetra=0;
		int logitud=cadena.length()-1;
		
		while (indiceLetra <= logitud){
		
			letra=cadena.charAt(indiceLetra);
		
			switch(letra){
				case 'a':
					letra='*';
					break;
				case 'e':
					letra='*';
					break;
				case 'i':
					letra='*';
					break;
				case 'o':
					letra='*';
					break;
				case 'u':
					letra='*';
					break;						
			}				
			System.out.print(letra);					
			indiceLetra++;			
		}	
		
	}

}
