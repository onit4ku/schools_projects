package tresEnRaya;

import java.io.*;

public class TresEnRaya {
	private char tablero[] = new char[10];
	private int jugadas = 0;
	private int jugador = 1;

	TresEnRaya() {
		for (int i = 1; i < 10; i++) {
			tablero[i] = ' ';
		}
	}

	void imprimir_turno() {
		System.out.println("Turno Jugador " + jugador + ": ");
		System.out.print(">");
	}

	void imprimir() {
		System.out.println();
		System.out.println("  7  |  8  |  9       " + tablero[7] + "  |  " + tablero[8] + "  |  " + tablero[9]);
		System.out.println(" ---------------     ---------------");
		System.out.println("  4  |  5  |  6       " + tablero[4] + "  |  " + tablero[5] + "  |  " + tablero[6]);
		System.out.println(" ---------------     ---------------");
		System.out.println("  1  |  2  |  3       " + tablero[1] + "  |  " + tablero[2] + "  |  " + tablero[3]);
		System.out.println();
	}

	boolean GanaX() {
		boolean fin = false;
		// horizontal
		if (tablero[1] == 'X' && tablero[2] == 'X' && tablero[3] == 'X')
			fin = true;
		if (tablero[4] == 'X' && tablero[5] == 'X' && tablero[6] == 'X')
			fin = true;
		if (tablero[7] == 'X' && tablero[8] == 'X' && tablero[9] == 'X')
			fin = true;
		// vertical
		if (tablero[7] == 'X' && tablero[4] == 'X' && tablero[1] == 'X')
			fin = true;
		if (tablero[8] == 'X' && tablero[5] == 'X' && tablero[2] == 'X')
			fin = true;
		if (tablero[9] == 'X' && tablero[6] == 'X' && tablero[3] == 'X')
			fin = true;

		// diagonal
		if (tablero[7] == 'X' && tablero[5] == 'X' && tablero[3] == 'X')
			fin = true;
		if (tablero[9] == 'X' && tablero[5] == 'X' && tablero[1] == 'X')
			fin = true;
		return fin;
	}

	boolean GanaO() {
		boolean fin = false;
		// horizontal
		if (tablero[1] == 'O' && tablero[2] == 'O' && tablero[3] == 'O')
			fin = true;
		if (tablero[4] == 'O' && tablero[5] == 'O' && tablero[6] == 'O')
			fin = true;
		if (tablero[7] == 'O' && tablero[8] == 'O' && tablero[9] == 'O')
			fin = true;
		// vertical
		if (tablero[7] == 'O' && tablero[4] == 'O' && tablero[1] == 'O')
			fin = true;
		if (tablero[8] == 'O' && tablero[5] == 'O' && tablero[2] == 'O')
			fin = true;
		if (tablero[9] == 'O' && tablero[6] == 'O' && tablero[3] == 'O')
			fin = true;

		// diagonal
		if (tablero[7] == 'O' && tablero[5] == 'O' && tablero[3] == 'O')
			fin = true;
		if (tablero[9] == 'O' && tablero[5] == 'O' && tablero[1] == 'O')
			fin = true;

		return fin;
	}

	boolean movimiento(int movi) {
		boolean correcto = true;
		if (movi >= 1 && movi <= 9) {
			if (tablero[movi] == ' ') {
				switch (jugador) {
				case 1:
					tablero[movi] = 'X';
					jugador = 2;
					break;
				case 2:
					tablero[movi] = 'O';
					jugador = 1;
					break;
				}
				jugadas++;
			} else
				correcto = false;
		} else
			correcto = false;

		return correcto;
	}

	boolean es_final() {
		boolean fin = false;
		if (jugadas < 9 && !GanaX() && !GanaO())
			fin = true;
		return fin;
	}
}