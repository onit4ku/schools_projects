package ejerciciosFernando;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int num1=0;
		int num2=0;
		int resultado=0;		
		
		System.out.print("Dime operando1: ");
		num1=sc.nextInt();
		
		System.out.print("Dime operando2: ");
		num2=sc.nextInt();
		
		sc.nextLine();		
		System.out.print("Dime operacion(+-*/): ");
		String sOperacion=sc.nextLine();			
		char cOperacion=sOperacion.charAt(0);			
		
		switch(cOperacion)
		{
			case '+':
				resultado=num1+num2;
				break;
			case '-':
				resultado=num1-num2;
				break;
			case '*':
				resultado=num1*num2;
				break;
			case '/':
				resultado=num1/num2;
				break;			
		}
		System.out.print("El Resultado es: ");
		System.out.println(resultado);		
	}

}
