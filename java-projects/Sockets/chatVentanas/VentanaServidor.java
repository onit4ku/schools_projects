package chatVentanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaServidor extends JFrame implements Runnable {

	private JPanel contentPane;
	private JTextField textTexto;
	JList jLista;

	ServidorTCP servidor;

	Vector vMensajes;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaServidor frame = new VentanaServidor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaServidor() {

		vMensajes = new Vector();

		try {
			servidor = new ServidorTCP(5008);
		} catch (IOException e1) {
			System.out.println("Error en la conexion");
		}
		// el hilo para recibir mensajes
		Thread hilo = new Thread(this);
		hilo.start();

		setTitle("Servidor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 33, 611, 217);
		contentPane.add(scrollPane);

		jLista = new JList();
		scrollPane.setViewportView(jLista);

		textTexto = new JTextField();
		textTexto.setBounds(10, 289, 480, 49);
		contentPane.add(textTexto);
		textTexto.setColumns(10);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// lista
				vMensajes.addElement("YO: " + textTexto.getText());

				// enviar
				try {
					servidor.EnviarString(textTexto.getText());
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "Error en el Ingreso de Datos", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				// actualizo lista
				jLista.setListData(vMensajes);
				// borro texto
				textTexto.setText("");
			}
		});
		btnEnviar.setBounds(500, 289, 121, 49);
		contentPane.add(btnEnviar);
	}

	public void run() {
		try {
			// bucle infinito para escuchar por mensajes del cliente
			while (true) {
				String recibido = servidor.RecibirString();
				vMensajes.addElement("RECIBIDO: " + recibido);
				jLista.setListData(vMensajes);
			}
		} catch (IOException e) {
			System.out.println("Error en la comunicacion");
		}
	}
}