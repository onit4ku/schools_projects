package tresEnRaya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cliente {
	public static void main(String[] args) throws IOException {
		ClienteTCP cliente = new ClienteTCP("192.168.2.222", 5008);

		// cliente.Dato((byte)65);
		// System.out.print((char)cliente.Dato());

		TresEnRaya juego = new TresEnRaya();
		int movi = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (juego.es_final()) {

			juego.imprimir();
			System.out.println("Esperando la jugada....");
			while (!cliente.Hay_Dato()) {
				// System.out.print(".");
			}
			System.out.println("...Recibido.....");

			juego.movimiento((int) cliente.Dato());

			// la partida puede haber terminado
			if (juego.es_final()) {
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
				cliente.Dato((byte) movi);
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