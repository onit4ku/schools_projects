package ejerciciosFernando;
import java.util.Scanner;


public class Examen {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un operando: ");
		int operando=sc.nextInt();
		int maxNum=9;		 
		System.out.println();		
		
		for(int i=1; i <= maxNum;i++){
			int resultado=i*operando;
			System.out.println(i + "x"+operando+"="+resultado);	
		}		
		
		int vValores[]=new int[maxNum];		
		for (int i=0; i < vValores.length; i++){
			int resultado=(i+1)*operando;
			vValores[i]=resultado;
		}
		
		System.out.println();
		for (int i=0; i < vValores.length; i++){
			System.out.print(vValores[i] +" ");
		}
		
		boolean si=false;
		System.out.println();
		System.out.println();
		int suma=0;
		for (int i=0; i < vValores.length; i++){
			if ((vValores[i] % 2)==0){
				if (si){
					System.out.print("+");					
				}
				System.out.print(vValores[i]);
				suma=suma+vValores[i];
				si=true;				
			}
		}
		System.out.println("="+suma);	
	
	}

}
