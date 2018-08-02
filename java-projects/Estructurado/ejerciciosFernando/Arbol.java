package ejerciciosFernando;

public class Arbol {

	public static void main(String[] args) {

		int fila=1;
		
		int valor;
		
		while (fila <= 4){
			
			valor=1;			
			int numFila=fila;				
			
			int espacios=(5-fila);
			while ((5-fila) < 0){			
				System.out.print("x");
				espacios--;
			}
			
			while (numFila > 0){			
				System.out.print(valor);
				numFila--;				
				valor++;
			}
			fila++;
			System.out.println();
		}
		
		
	}

}
