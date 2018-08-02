package ejerciciosFernando;
import java.util.Scanner;

public class AgendaEdades {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		
		int numPersonas=3;
		int numColumnas=2;
		
		String vPersonas[][]= new String[numPersonas][numColumnas];
		
		//introduccion datos
		for(int f=0; f < numPersonas; f++){	
			System.out.println("----------------");
			System.out.print("Dime el nombre: ");
			vPersonas[f][0]=sc.nextLine();
			System.out.print("Dime la edad: ");
			vPersonas[f][1]=sc.nextLine();
			System.out.println("----------------");
		}
		
		//media
		int suma=0;
		for(int f=0; f < numPersonas; f++){	
			suma=suma+Integer.parseInt(	vPersonas[f][1] );
		}		
		
		//mayor
		int mayor=0;
		for(int f=0; f < numPersonas; f++){	
			if (Integer.parseInt(vPersonas[f][1]) > mayor){
				mayor=Integer.parseInt(vPersonas[f][1]);
			}
		}	
		
		//menor
		int menor = Integer.parseInt(vPersonas[0][1]);
		for (int f = 0; f < numPersonas; f++) {
			if (Integer.parseInt(vPersonas[f][1]) < menor) {
				menor = Integer.parseInt(vPersonas[f][1]);
			}
		}
		
		//imprimir
		for(int i=0; i < numPersonas; i++){
			for (int c=0; c < numColumnas; c++){
				System.out.print(vPersonas[i][c]+" ");
			}	
			System.out.println();
		}		
		System.out.println("Suma: "+suma);
		System.out.println("Mayor: "+mayor);
		System.out.println("Menor: "+menor);
	}

}
