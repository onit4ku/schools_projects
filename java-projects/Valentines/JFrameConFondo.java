import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class JFrameConFondo extends JFrame {

	private JLabel texto1;

	public JFrameConFondo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 690);
		PanelImagen p = new PanelImagen();
		setTitle("Javalentin Mochan");
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		p.setLayout(new BorderLayout(0, 0));

		setContentPane(p);
		setLayout(null);

		texto1 = new JLabel("Will you be my valentine?");
		texto1.setFont(new java.awt.Font("Comic Sans MS", 0, 25));
		texto1.setBounds(150, 20, 300, 40);

		JButton boton1 = new JButton("Nop");
		JButton boton2 = new JButton("Yes");

		boton1.setBounds(300, 550, 100, 25);
		boton2.setBounds(150, 550, 100, 25);

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelImagen2 p2 = new PanelImagen2();
				setTitle("Javalentin Mochan");
				p2.setBorder(new EmptyBorder(5, 5, 5, 5));
				p2.setLayout(new BorderLayout(0, 0));
				setContentPane(p2);
				setLayout(null);
			}
		});

		add(boton1);
		add(boton2);

		add(texto1);

		boton1.setVisible(true);
		boton2.setVisible(true);
		texto1.setVisible(true);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameConFondo frame = new JFrameConFondo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}