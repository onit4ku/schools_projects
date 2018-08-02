package pdfSelectivas;

import java.io.*;

class Experimento3 {
	public static void main(String args[]) throws Exception {
		int i;
		BufferedReader f;
		f = new BufferedReader(new InputStreamReader(System.in));
		i = Integer.parseInt(f.readLine());
		switch (i) {
		case (1):
			System.out.print("i es igual a 1\n");
		break;
		case (-1):
			System.out.print("i es igual a -1\n");
		break;
		case (0):
			System.out.print("i es igual a cero\n");
		break;
		default:
			System.out.print("i toma otro valor\n");
		}
	}
}