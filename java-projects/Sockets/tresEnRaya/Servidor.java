package tresEnRaya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Servidor {

	public static void main(String[] args) throws IOException {
		ServidorTCP servidor = new ServidorTCP(5008);

		// servidor.Dato((byte)66);
		// System.out.print((char)servidor.Dato());

		TresEnRaya juego = new TresEnRaya();
		int movi = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (juego.es_final()) {

			juego.imprimir();

			boolean correcto = false;
			do {
				juego.imprimir_turno();
				try {
					movi = new Integer(in.readLine()).intValue();
					correcto = true;
				} catch (NumberFormatException e) {
					System.out.println("Error en la lectura, escribe numeros");
					correcto = false;
				}

				// realizo el movimiento, y veo si es correcto
				correcto = juego.movimiento(movi);
			} while (!correcto);

			// mando el dato que, es correcto
			servidor.Dato((byte) movi);

			// la partida puede haber terminado
			if (juego.es_final()) {
				juego.imprimir();

				System.out.println("Esperando la jugada...");
				byte t = 0;
				// while(!servidor.Hay_Dato()){
				while (t == 0) {
					// System.out.print(".");
					t = servidor.Dato();
				}
				System.out.println("...Recibido.....");
				// juego.movimiento((int)servidor.Dato());
				juego.movimiento((int) t);
			}
		}

		juego.imprimir();
		if (juego.GanaX())
			System.out.println("Gana el jugador 1, las X");
		if (juego.GanaO())
			System.out.println("Gana el jugador 2, las O");
		if (!juego.GanaX() && !juego.GanaO())
			System.out.println("Empate");
	}
}