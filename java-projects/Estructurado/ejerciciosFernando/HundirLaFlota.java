package ejerciciosFernando;
import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numFilas = 10;
		int numColumnas = 10;

		int vMatriz[][] = new int[numFilas][numColumnas];

		int filaB = (int)(Math.random()*numFilas);
		int columnaB = (int)(Math.random()*numColumnas);
			
		Random r=new Random();		
			
		int orden= r.nextInt(2);
		
		for(int i=0; i < r.nextInt(4)+1;i++){			
			if (orden==1){
				vMatriz[filaB+i][columnaB] = 1;
			}else{
				vMatriz[filaB][columnaB+i] = 1;
			}
		}				
		
		while (true) {
			for (int f = 0; f < numFilas; f++) {
				for (int c = 0; c < numColumnas; c++) {
					char ficha = ' ';
					switch (vMatriz[f][c]) {
					// nada
					case 0:
						ficha = '_';
						break;
					// barco
					case 1:
						ficha = 'B';
						break;
					// disparo
					case 9:
						ficha = 'x';
						break;
					// tocado
					case 8:
						ficha = 'X';
						break;
					}
					System.out.print(" " + ficha + " ");					
				}
				System.out.println();
			}

			System.out.println("Dime el disparo: ");
			System.out.println("Dime tu jugada f:");
			int fila = sc.nextInt();
			System.out.println("Dime tu jugada c:");
			int columna = sc.nextInt();

			switch (vMatriz[fila][columna]) {
			// nada
			case 0:
				vMatriz[fila][columna] = 9;
				break;
			// barco
			case 1:
				vMatriz[fila][columna] = 8;
				break;
			}
		}

	}

}
