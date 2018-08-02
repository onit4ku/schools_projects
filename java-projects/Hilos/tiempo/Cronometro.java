package tiempo;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Cronometro extends JFrame implements Runnable {
	private static final long serialVersionUID = 5683627382377197838L;

	private JPanel contentPane;
	private JLabel lblTiempo = new JLabel("00:00:00:000");

	Random aleatorio = new Random();

	int segundos = 0, minutos = 0, horas = 0, milisegundos = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cronometro frame = new Cronometro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cronometro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		lblTiempo.setFont(new Font("Narkisim", Font.BOLD, 100));
		lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTiempo);

		crono.start();
	}

	Thread crono = new Thread() {
		@Override
		public void run() {
			try {
				while (true) {
					if (segundos == 59) {
						segundos = 00;
						minutos++;
					}
					if (minutos == 59) {
						minutos = 00;
						horas++;
					}
					segundos++;

					lblTiempo.setText(String.format("%02d:%02d:%02d", horas, minutos, segundos));
					// Color micolor = new Color(aleatorio.nextInt(255),
					// aleatorio.nextInt(255), aleatorio.nextInt(255));
					// Color micolor2 = new Color(aleatorio.nextInt(255),
					// aleatorio.nextInt(255), aleatorio.nextInt(255));
					// contentPane.setBackground(micolor);
					// lblTiempo.setForeground(micolor2);
					Thread.sleep(1000);
				}
			} catch (java.lang.InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	};

	@Override
	public void run() {
	}
}