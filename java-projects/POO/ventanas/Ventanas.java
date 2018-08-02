package ventanas;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;

public class Ventanas {

	public static void main(String[] args) throws InterruptedException {
		JFrame ventana;
		int aumento = 8;
		int num = 0;
		int fila = 0;
		int columna = 0;

		Random aleatorio = new Random();
		for (int n = 0; n < 4; n++) {
			for (int i = 0; i < aumento; i++) {
				ventana = new JFrame();
				ventana.setVisible(true);
				num++;
				if (num < aumento) {

					ventana.setBounds(135 * columna, 0, 100, 100);
					columna++;
				}
				if (num >= aumento && num < (aumento * 2)) {
					ventana.setBounds(135 * columna, 110 * fila, 100, 100);
					fila++;
				}
				if (num >= (aumento * 2) && num <= (aumento * 3)) {
					ventana.setBounds(135 * columna, 110 * fila, 100, 100);
					columna--;
				}
				if (num > (aumento * 3) && num <= (aumento * 4)) {
					ventana.setBounds(0, 110 * fila, 100, 100);
					fila--;
				}

				Color micolor = new Color(aleatorio.nextInt(255), aleatorio.nextInt(255), aleatorio.nextInt(255));

				ventana.getContentPane().setBackground(micolor);

				Thread.sleep(100);
			}
		}
	}
}