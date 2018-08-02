package examen;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

public class JProgressHilos extends JFrame implements Runnable {
	boolean parar = false; // booleano para el semaforo
	int contador = 0; // contador para incrementar
	private JPanel panel;
	JLabel lblEtiqueta;
	JProgressBar barraProgreso;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JProgressHilos ventana = new JProgressHilos();
					ventana.setVisible(true);
				} catch (Exception excepcion) {
					excepcion.printStackTrace();
				}
			}
		});
	}

	public JProgressHilos() {
		setTitle("Examen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 160);
		panel = new JPanel();
		panel.setToolTipText("");
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		lblEtiqueta = new JLabel("0");
		lblEtiqueta.setFont(new Font("Narkisim", Font.BOLD, 100));
		panel.add(lblEtiqueta);

		JButton btnIniciar = new JButton("INICIO");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (parar) {
					contador = 0;
					parar = true;
				} else {
					parar = true;
				}
			}
		});
		panel.add(btnIniciar);

		JButton btnParar = new JButton("PARAR");
		btnParar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// semaforo
				if (parar) {
					parar = false;
				}
			}
		});
		panel.add(btnParar);
		barraProgreso = new JProgressBar();
		barraProgreso.setMaximum(60); // para que el tope sea 60
		panel.add(barraProgreso);

		Thread crono = new Thread(this); // inicio del hilo
		crono.start();
	}

	public void run() {
		while (true) {
			lblEtiqueta.setText("" + contador);
			if ((parar) && (contador < 60)) {
				contador++;
				barraProgreso.setValue(contador);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException excepcion) {
				excepcion.printStackTrace();
			}
		}
	}
}