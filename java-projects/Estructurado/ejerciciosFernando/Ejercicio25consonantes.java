package ejerciciosFernando;
import java.util.Scanner;

public class Ejercicio25consonantes {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		char vVocal[]={'a', 'e', 'i', 'o', 'u' };		
		char v1Consonates[]={'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k'};		
		char v2Consonates[]={'l', 'm', 'n', 'ñ', 'p', 'q', 'r'};		
		char v3Consonates[]={'s', 't', 'v', 'w', 'x', 'y', 'z'};
		
		char letra;
		System.out.print("Dime una letra: ");
		letra=sc.next().charAt(0);
		
				
		int i=0;
		while(i< vVocal.length){
			if (letra  == vVocal[i]){
				System.out.println("VOCAL");
			}		
			i++;
		}
		
		i=0;
		while(i< v1Consonates.length){
			if (letra  == v1Consonates[i]){
				System.out.println("PRIMERAS CONSONANTES");
			}		
			i++;
		}
		
		i=0;
		while(i< v2Consonates.length){
			if (letra  == v2Consonates[i]){
				System.out.println("SEGUNDAS CONSONTANTES");
			}		
			i++;
		}
		
		i=0;
		while(i< v3Consonates.length){
			if (letra  == v3Consonates[i]){
				System.out.println("ULTIMAS CONSONANTES");
			}		
			i++;
		}
			
		
	}
	
	
}
