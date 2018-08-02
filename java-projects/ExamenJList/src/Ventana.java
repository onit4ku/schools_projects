import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField agregarTxt;
	DefaultListModel<Integer> modelo = new DefaultListModel<Integer>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setTitle("Exámen JList");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 333);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		agregarTxt = new JTextField();
		agregarTxt.setBounds(10, 38, 280, 20);
		contentPane.add(agregarTxt);
		agregarTxt.setColumns(10);

		JButton btnAgregar = new JButton("Insertar número");
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num = 0;
				try {
					num = new Integer(Ventana.this.agregarTxt.getText()).intValue();

					Ventana.this.modelo.addElement(Integer.valueOf(num));
					Ventana.this.agregarTxt.setText("");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error de lectura, sólo admite numeros\n" + e);
				}
			}
		});
		btnAgregar.setBounds(10, 263, 162, 23);
		contentPane.add(btnAgregar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 69, 280, 183);
		contentPane.add(scrollPane);

		JList<Integer> lista = new JList<Integer>();
		scrollPane.setViewportView(lista);

		lista.setModel(modelo);

		JLabel lblEtiqueta = new JLabel("Número:");
		lblEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEtiqueta.setHorizontalAlignment(SwingConstants.LEFT);
		lblEtiqueta.setBounds(10, 13, 280, 14);
		contentPane.add(lblEtiqueta);

		JButton btnBorrar = new JButton("Borrar Lista");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBorrar.setBounds(182, 263, 108, 23);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.removeAllElements();
			}
		});

		contentPane.add(btnBorrar);
	}
}
