import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class PanelImagen2 extends javax.swing.JPanel {
	public PanelImagen2() {
		this.setSize(573, 670);
	}

	@Override
	public void paintComponent(Graphics g) {
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource(
				"/imagenes/gintama.png"));
		g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width,
				tamanio.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}
}