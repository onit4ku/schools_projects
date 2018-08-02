package bucles;

public class SumaImpPares100 {
	// Suma los numeros pares por un lado e impares por otro del 1 al 100
	public static void main(String[] args) {
		int num = 1, par = 0, imp = 0;
		while (num <= 100) {
			if (num % 2 == 0) {
	
				par = num + par;
				num++;
			}else{
				imp = num + imp;
				num++;
			}
		}
		System.out.println(par + "," + imp);
	}
}