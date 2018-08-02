package chatVentanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaCliente extends JFrame implements Runnable {

	private JPanel contentPane;
	private JTextField textTexto;
	JList jLista;

	ClienteTCP cliente;

	Vector vMensajes;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCliente frame = new VentanaCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaCliente() {
		vMensajes = new Vector();

		try {
			cliente = new ClienteTCP("localhost", 5008);
		} catch (IOException e1) {
			System.out.println("Error en la conexion");
		}
		// el hilo para recibir mensajes
		Thread hilo = new Thread(this);
		hilo.start();

		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 100, 647, 406);
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
					cliente.EnviarString(textTexto.getText());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
			// blucle infinito para escuchar por mensajes del cliente
			while (true) {
				String recibido = cliente.RecibirString();
				vMensajes.addElement("RECIBIDO: " + recibido);
				jLista.setListData(vMensajes);
			}
		} catch (IOException e) {
			System.out.println("Error en la comunicacion");

		}
	}
}
