package pdfSelectivas;

import java.io.*;

// para 8, 4, 15 
//8 Es ocho, 4 es impar 15 no pone nada, está mal hecho, 
//deberian estar las llaves o sacar el else del segundo if y aplicarlo al primero

class Experimento2 {
	public static void main(String args[]) throws Exception {
		BufferedReader flujo;
		flujo = new BufferedReader(new InputStreamReader(System.in));
		int numero = Integer.parseInt(flujo.readLine());
		if (numero % 2 == 0)
			if (numero == 8)
				System.out.println("Es ocho");
			else
				System.out.println("Es impar");
	}
}