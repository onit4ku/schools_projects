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

public class Lista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField agregarTxt;
	DefaultListModel<Integer> modelo = new DefaultListModel<Integer>();
	private JTextField textField;
	private JTextField textField_1;
	private JList<Integer> lista = new JList<Integer>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista frame = new Lista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Lista() {
		setTitle("Exámen UF1290 - UF1291");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 348);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		agregarTxt = new JTextField();
		agregarTxt.setBounds(71, 38, 219, 20);
		contentPane.add(agregarTxt);
		agregarTxt.setColumns(10);

		JButton btnAgregar = new JButton("Insertar número");
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num = 0;
				try {
					num = new Integer(Lista.this.agregarTxt.getText()).intValue();

					Lista.this.modelo.addElement(Integer.valueOf(num));
					Lista.this.agregarTxt.setText("");

					float suma = 0;
					float numero = 0;
					String cadena = "";

					for (int i = 0; i < lista.getModel().getSize(); i++) {

						cadena = lista.getModel().getElementAt(i).toString();
						numero = Float.parseFloat(cadena);
						suma = suma + numero;
					}

					float media = suma / lista.getModel().getSize();
					textField.setText("" + suma);
					textField_1.setText("" + media);

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

		scrollPane.setViewportView(lista);

		lista.setModel(modelo);

		JLabel lblEtiqueta = new JLabel("Número:");
		lblEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEtiqueta.setHorizontalAlignment(SwingConstants.LEFT);
		lblEtiqueta.setBounds(10, 40, 90, 14);
		contentPane.add(lblEtiqueta);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBounds(389, 68, 135, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Suma Total:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(300, 70, 81, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Media:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(300, 101, 46, 14);
		contentPane.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setEditable(false);
		textField_1.setBounds(389, 99, 135, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnBorrar = new JButton("Borrar Lista");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBorrar.setBounds(182, 263, 108, 23);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.removeAllElements();
				textField.setText("0.0");
				textField_1.setText("0.0");
			}
		});

		contentPane.add(btnBorrar);
	}
}
