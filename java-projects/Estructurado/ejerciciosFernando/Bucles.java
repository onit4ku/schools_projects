package ejerciciosFernando;

public class Bucles {

	public static void main(String[] args) {
		
		for (int tabla=1; tabla < 10; tabla++){	
			System.out.println();
			System.out.println("Tabla "+tabla);
			for (int operando=0;operando <=9 ; operando++){
				System.out.println(operando +"x"+ tabla+" = "+ operando*tabla);			
			}
		}
	}

}
