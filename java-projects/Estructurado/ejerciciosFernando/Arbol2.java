package ejerciciosFernando;

public class Arbol2 {

	public static void main(String[] args) {

		int num;
		int fila;		
		
		fila=1;		
		
		//filas
		while(fila <= 5){
			num=1;
			int numerosFila=fila;
			
			//fila
			while(numerosFila > 0){
				System.out.print(num);
				numerosFila--;
				num++;
			}			
			
			System.out.println();
			fila++;				
		}	

	}

}
