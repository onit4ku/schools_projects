package pruebasql;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

public class Interfaz extends JFrame {
	PersonaDAO miPersonaDAO;

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtProfesion;
	private JTextField txtTfn;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void registrarPersona() {
		miPersonaDAO = new PersonaDAO();
		ClienteDAO miPersona = new ClienteDAO();

		miPersona.setIdPersona(Integer.parseInt(txtID.getText()));
		miPersona.setNombrePersona(txtNombre.getText());
		miPersona.setEdadPersona(Integer.parseInt(txtEdad.getText()));
		miPersona.setProfesionPersona(txtProfesion.getText());
		miPersona.setTelefonoPersona(Integer.parseInt(txtTfn.getText()));

		miPersonaDAO.registrarPersona(miPersona);
	}

	private void modificarPersona(int doc) {
		miPersonaDAO = new PersonaDAO();
		ClienteDAO miPersona = new ClienteDAO();

		miPersona.setIdPersona(Integer.parseInt(txtID.getText()));
		miPersona.setNombrePersona(txtNombre.getText());
		miPersona.setEdadPersona(Integer.parseInt(txtEdad.getText()));
		miPersona.setProfesionPersona(txtProfesion.getText());
		miPersona.setTelefonoPersona(Integer.parseInt(txtTfn.getText()));

		miPersonaDAO.modificarPersona(miPersona);
	}

	private void eliminarPersona(int documento) {
		miPersonaDAO = new PersonaDAO();
		ClienteDAO miPersona = new ClienteDAO();
		miPersona.setIdPersona(Integer.parseInt(txtID.getText()));

		miPersonaDAO.eliminarPersona(miPersona);
	}

	private void obtenerRegistros() {
		miPersonaDAO = new PersonaDAO();
		ClienteDAO miPersona;

		ArrayList<ClienteDAO> listaPersonas = miPersonaDAO.listaDePersonas();
		if (listaPersonas.size() > 0) {
			int numeroPersona = 0;

			for (int i = 0; i < listaPersonas.size(); i++) {
				numeroPersona++;
				miPersona = listaPersonas.get(i);
				txtID.setText("" + miPersona.getIdPersona());
				txtNombre.setText("" + miPersona.getNombrePersona());
				txtEdad.setText("" + miPersona.getEdadPersona());
				txtProfesion.setText("" + miPersona.getProfesionPersona());
				txtTfn.setText("" + miPersona.getTelefonoPersona());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Actualmente no " + "existen registros de personas", "INFORMACIÓN",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private void buscarPersona(int documento) {
		miPersonaDAO = new PersonaDAO();
		ClienteDAO miPersona;
		ArrayList<ClienteDAO> personasEncontrada = miPersonaDAO.consultarPersona(documento);
		if (personasEncontrada.size() > 0) {
			for (int i = 0; i < personasEncontrada.size(); i++) {
				miPersona = personasEncontrada.get(i);
				txtID.setText("" + miPersona.getIdPersona());
				txtNombre.setText("" + miPersona.getNombrePersona());
				txtEdad.setText("" + miPersona.getEdadPersona());
				txtProfesion.setText("" + miPersona.getProfesionPersona());
				txtTfn.setText("" + miPersona.getTelefonoPersona());
			}
		} else {
			JOptionPane.showMessageDialog(null, "El documento ingresado " + "no corresponde a ninguna persona",
					"INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public Interfaz() {
		setTitle("ABM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JButton btnNuevo = new JButton("Nuevo");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNuevo, 37, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNuevo, 176, SpringLayout.WEST, contentPane);
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registrarPersona();
			}
		});
		contentPane.add(btnNuevo);

		JButton btnGuardar = new JButton("Listar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnGuardar, 0, SpringLayout.NORTH, btnNuevo);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnGuardar, 37, SpringLayout.EAST, btnNuevo);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnGuardar, 23, SpringLayout.NORTH, btnNuevo);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnGuardar, 146, SpringLayout.EAST, btnNuevo);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int doc = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el numero" + " de documento de la persona"));
				buscarPersona(doc);

			}
		});
		contentPane.add(btnGuardar);

		JButton btnEliminar = new JButton("Eliminar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnEliminar, 25, SpringLayout.SOUTH, btnNuevo);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnEliminar, 0, SpringLayout.WEST, btnNuevo);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnEliminar, -439, SpringLayout.EAST, contentPane);

		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int doc = Integer.parseInt(
						JOptionPane.showInputDialog("Ingrese el numero" + " de documento de la persona a eliminar"));
				eliminarPersona(doc);
			}
		});
		contentPane.add(btnEliminar);

		JLabel lblNewLabel = new JLabel("Id:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);

		txtID = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtID, 57, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtID, -188, SpringLayout.EAST, contentPane);
		contentPane.add(txtID);
		txtID.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 89, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -24, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Edad:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 35, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(lblNewLabel_2);

		txtNombre = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnEliminar, 258, SpringLayout.SOUTH, txtNombre);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtID, -18, SpringLayout.NORTH, txtNombre);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNombre, -3, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNombre, 0, SpringLayout.WEST, txtID);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNombre, -5, SpringLayout.EAST, txtID);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtEdad = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtEdad, 0, SpringLayout.WEST, txtID);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtEdad, 0, SpringLayout.SOUTH, lblNewLabel_2);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Profesi\u00F3n:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 31, SpringLayout.SOUTH, lblNewLabel_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Tel\u00E9fono:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 26, SpringLayout.SOUTH, lblNewLabel_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(lblNewLabel_4);

		txtProfesion = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtProfesion, -3, SpringLayout.NORTH, lblNewLabel_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtProfesion, 22, SpringLayout.EAST, lblNewLabel_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtProfesion, -242, SpringLayout.EAST, contentPane);
		contentPane.add(txtProfesion);
		txtProfesion.setColumns(15);

		txtTfn = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNuevo, 73, SpringLayout.SOUTH, txtTfn);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtTfn, 25, SpringLayout.EAST, lblNewLabel_4);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNuevo, 50, SpringLayout.SOUTH, txtTfn);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtTfn, 0, SpringLayout.NORTH, lblNewLabel_4);
		contentPane.add(txtTfn);
		txtTfn.setColumns(10);

		JButton btnNewButton = new JButton("Reestablecer");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, -4, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -32, SpringLayout.EAST, contentPane);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEdad.setText("");
				txtID.setText("");
				txtNombre.setText("");
				txtProfesion.setText("");
				txtTfn.setText("");
			}
		});
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int doc = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el numero" + " de documento de la persona"));
				modificarPersona(doc);

			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnEliminar);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, btnGuardar);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -317, SpringLayout.EAST, contentPane);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("<");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_2, 0, SpringLayout.NORTH, btnNuevo);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_2, 69, SpringLayout.EAST, btnGuardar);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton(">");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_3, 0, SpringLayout.NORTH, btnNuevo);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_3, 0, SpringLayout.WEST, btnNewButton);
		contentPane.add(btnNewButton_3);
	}
}