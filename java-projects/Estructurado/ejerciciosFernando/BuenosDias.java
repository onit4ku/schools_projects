package ejerciciosFernando;
import java.util.Scanner;

public class BuenosDias {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime hora: ");	
		int hora=sc.nextInt();	
		System.out.println("Dime minutos: ");	
		int minutos=sc.nextInt();	
		
		int sumaMin=hora*60+minutos;
		
		if (sumaMin >=6*60 && sumaMin <=11*60+59){
			System.out.println("Buenos dias");	
		}
		if (sumaMin >=12*60 && sumaMin <=19*60){
			System.out.println("Buenos tardes");	
		}
		if (sumaMin >=19*60+1 || sumaMin <=5*60+59){
			System.out.println("Buenos noches");	
		}

	}

}
