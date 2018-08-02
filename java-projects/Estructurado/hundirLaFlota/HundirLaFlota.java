package hundirLaFlota;

import java.io.IOException;
import java.util.Scanner;

public class HundirLaFlota {

	public static void main(String[] args) throws IOException {
		// variables
		boolean ganaJugador = false, ganaMaquina = false;
		int[][] vectorMapa = new int[4][4];

		int filaJugador, columnaJugador, filaMaquina, columnaMaquina, tiraJugadorColumna, tiraJugadorFila,
				tiraMaquinaColumna, tiraMaquinaFila;

		// entrada de datos
		Scanner sc = new Scanner(System.in);

		System.out.println("HUNDIR LA FLOTA - 4x4 un cuadrado");
		System.out.println();
		System.out.print("Introduce tus coordenadas para colocar tu barco: ");
		filaJugador = sc.nextInt();
		columnaJugador = sc.nextInt();

		// entrada Maquina

		filaMaquina = (int) (Math.random() * 4);
		columnaMaquina = (int) (Math.random() * 4);

		// Mapa del jugador
		System.out.println("");
		System.out.println("Mapa del Jugador");
		for (int i = 0; i < vectorMapa.length; i++) {
			System.out.println("");
			for (int j = 0; j < vectorMapa.length; j++) {
				if (i == columnaJugador) {
					if (j == filaJugador) {
						vectorMapa[i][j] = 1;
					}
				} else {
					vectorMapa[i][j] = 0;
				}
				System.out.print(vectorMapa[i][j]);
			}
		}

		System.out.println();

		// Comprobar el ganador

		while (ganaJugador == false && ganaMaquina == false) {
			System.out.println("");
			System.out.println("Introduce tus coordenadas para el disparo: ");
			tiraJugadorFila = sc.nextInt();
			tiraJugadorColumna = sc.nextInt();

			// Mapa de la ia
			System.out.println("");
			System.out.println("Tiro del Jugador a la IA");
			System.out.println("2 indica el disparo");

			for (int i = 0; i < vectorMapa.length; i++) {
				System.out.println("");
				for (int j = 0; j < vectorMapa.length; j++) {
					if (i == tiraJugadorColumna) {
						if (j == tiraJugadorFila) {
							vectorMapa[i][j] = 2;
						}
					} else {
						vectorMapa[i][j] = 0;
					}
					System.out.print(vectorMapa[i][j]);
				}
			}
			System.out.println("");

			// fin imprimir mapa ia

			if (tiraJugadorColumna == columnaMaquina && tiraJugadorFila == filaMaquina) {
				ganaJugador = true;
			} else {
				System.out.println("AGUA!");
				System.out.println();
				System.out.println("Coordenadas para el disparo de la Máquina: ");
				System.out.println();

				// Tiros de la maquina
				tiraMaquinaFila = (int) (Math.random() * 4);
				tiraMaquinaColumna = (int) (Math.random() * 4);

				System.out.println("Tiro fila de la Máquina: " + tiraMaquinaFila);
				System.out.println("Tiro columna de la Máquina: " + tiraMaquinaColumna);

				if (tiraMaquinaColumna == columnaJugador && tiraMaquinaFila == filaJugador) {
					ganaMaquina = true;
				} else {
					System.out.println("");
					System.out.println("AGUA!!");
				}

				// Mapa del jugador con el tiro de la ia
				System.out.println("");
				System.out.println("Tiro de la IA al jugador");
				System.out.println("2 indica el disparo");

				for (int i = 0; i < vectorMapa.length; i++) {
					System.out.println("");
					for (int j = 0; j < vectorMapa.length; j++) {
						if (i == tiraMaquinaColumna) {
							if (j == tiraMaquinaFila) {
								vectorMapa[i][j] = 2;
							}
						} else {
							vectorMapa[i][j] = 0;
						}
						System.out.print(vectorMapa[i][j]);
					}
				}
				System.out.println("");

				// fin imprimir mapa jugador tiro IA
			}
		}

		// Fin del juego
		if (ganaJugador == true) {
			System.out.println("¡Tu ganas!");
		}
		if (ganaMaquina == true) {
			System.out.println("¡Gana la Máquina!");
		}
	}
}