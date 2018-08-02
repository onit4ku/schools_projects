package ejerciciosFernando;

public class MatrizCadenas {

	public static void main(String[] args) {

		int numFilas=5;
		int numColumnas=2;
		
		String vCadenas[][]= new String[numFilas][numColumnas];
				 	
		for(int f=0; f < numFilas; f++){
			for (int c=0; c < numColumnas; c++){
				vCadenas[f][c]="hola";	
			}				
		} 	 
		 		 
		for(int f=0; f < numFilas; f++){
			for (int c=0; c < numColumnas; c++){				
				System.out.print(vCadenas[f][c]);	
			}
			System.out.println();	
		}
		
		
	}

}
