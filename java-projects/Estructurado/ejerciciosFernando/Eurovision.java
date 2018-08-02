package ejerciciosFernando;
import java.util.Scanner;

public class Eurovision {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int vPuntuaciones[]= new int[10];
		
		for (int pais=0; pais < vPuntuaciones.length; pais++){
			
			System.out.println("Dime la puntuacion: ");	
			int nuevaPuntuacion=sc.nextInt();	
						
			//ordenar
			int indice=0; 
			while (indice < pais 
					&& vPuntuaciones[indice] < nuevaPuntuacion
					){				
				indice++;			
			}	
			//el resto
			for (int resto=pais+1; resto > indice;resto-- ){
				vPuntuaciones[resto]=vPuntuaciones[resto-1];
			}
			vPuntuaciones[indice]	= nuevaPuntuacion;
			
			
			//imprimir
			for (int i=0; i < vPuntuaciones.length; i++){			
				System.out.print(vPuntuaciones[i]+" ");		
			}
			System.out.println();	
			
		}
		
		
		
	}

}
