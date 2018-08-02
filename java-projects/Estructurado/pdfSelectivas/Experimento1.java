package pdfSelectivas;

import java.io.*;

class Experimento1 {
	public static void main(String args[]) throws Exception {
		int i, j, k = 5;
		BufferedReader leer;
		leer = new BufferedReader(new InputStreamReader(System.in));
		i = Integer.parseInt(leer.readLine());
		j = Integer.parseInt(leer.readLine());
		if (i < k){
			if (j > k)
			System.out.println("k está entre los números leídos");
		}
	}
}