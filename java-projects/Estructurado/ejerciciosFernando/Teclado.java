package ejerciciosFernando;
import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numVeces = 105;
		int num;
		int resultado = 0;		
		
		for (int i = 0; i < numVeces; i++) {
			System.out.print("Dime el numero: ");
			num = sc.nextInt();
			resultado = resultado + num;
		}
		
		System.out.print("La suma es : ");
		System.out.println(resultado);
	}
}
