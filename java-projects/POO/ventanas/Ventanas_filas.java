package ventanas;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;

public class Ventanas_filas {

	public static void main(String[] args) throws InterruptedException {

		JFrame ventana;
		Random aleatorio = new Random();
		int num=7;
		for (int filla = 0; filla < num; filla++) {
			for (int columna = 0; columna < num; columna++) {
				ventana = new JFrame();			
//				if (filla == columna || filla+columna ==num-1 ) {
//					ventana.setVisible(true);
//				} 
				if ((filla+columna)%2 !=0) {
					ventana.setVisible(true);
				} 
				
				
				ventana.setBounds(135 * columna, 140 * filla, 100, 100);
				Color micolor = new Color(aleatorio.nextInt(255), aleatorio.nextInt(255), aleatorio.nextInt(255));

				ventana.getContentPane().setBackground(micolor);

				Thread.sleep(100);

			}

		}
	}

}
