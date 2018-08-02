package bucles;

public class SwitchPares {
	// Muestra los 100 primeros numeros dicendo si es par o impar

	public static void main(String[] args) {
		int num = 1, par;

		while (num <= 100) {

			par = num % 2;
			System.out.println(num);
			switch (par) {
			case 0:
				System.out.println("Es par");
				break;
			default:
				System.out.println("Es impar");
			}
			num++;
		}
	}
}