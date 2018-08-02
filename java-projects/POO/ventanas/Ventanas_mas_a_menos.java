package ventanas;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;

public class Ventanas_mas_a_menos {

	public static void main(String[] args) throws InterruptedException {

		JFrame ventana;
		Random aleatorio = new Random();
		
	
			for (int columna = 1; columna <= 9; columna++) {
				ventana = new JFrame();
				ventana.setVisible(true);
				ventana.setBounds(500 ,200 , 600/columna, 400/columna);
				Color micolor = new Color(aleatorio.nextInt(255), aleatorio.nextInt(255), aleatorio.nextInt(255));

				ventana.getContentPane().setBackground(micolor);
				
				Thread.sleep(100);

			}

	}

}
