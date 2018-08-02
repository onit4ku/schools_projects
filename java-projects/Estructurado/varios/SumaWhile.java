package varios;
import java.util.Scanner;

public class SumaWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cont = 0, suma = 0, num;

		while (cont <= 5) {
			System.out.println("Introduce numero a sumar");
			num = sc.nextInt();
			suma = num + suma;
			cont++;
		}
		System.out.println(suma);
	}
}
