package personas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentRegistro extends JFrame implements ActionListener {

	private static final long serialVersionUID = 6990156376516338395L;
	private JLabel labelTitulo;
	private JTextField textDni, textNombre, textDia, textTelefono, textProfesion;
	private JLabel cod, nombre, telefono, profesion;
	private JButton botonInsertar, botonLimpiar;
	JTable mitabla1;
	JScrollPane mibarra1;

	ArrayList<PersonaVo> miLista = new ArrayList<PersonaVo>();
	private JLabel lblNewLabel_1;
	private JTextField textApellido1;
	private JLabel lblNewLabel_2;
	private JTextField textApellido2;
	private JLabel lblNewLabel_3;
	private JTextField textDireccion;
	private JTextField textMes;
	private JTextField textAnyo;
	private JLabel lblDia;
	private JLabel lblMes;
	private JLabel lblAo;

	/**
	 * constructor de la clase donde se inicializan todos los componentes de la
	 * ventana de registro
	 */
	public VentRegistro() {
		botonInsertar = new JButton();
		botonInsertar.setBounds(336, 208, 120, 25);
		botonInsertar.setText("Insertar");

		labelTitulo = new JLabel();
		labelTitulo.setText("REGISTRO DE PERSONAS");
		labelTitulo.setBounds(120, 20, 380, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));

		cod = new JLabel();
		cod.setText("DNI:");
		cod.setBounds(20, 80, 80, 25);
		getContentPane().add(cod);

		nombre = new JLabel();
		nombre.setText("Nombre:");
		nombre.setBounds(20, 120, 80, 25);
		getContentPane().add(nombre);

		telefono = new JLabel();
		telefono.setText("Tel\u00E9fono:");
		telefono.setBounds(184, 160, 80, 25);
		getContentPane().add(telefono);

		profesion = new JLabel();
		profesion.setText("Profesion:");
		profesion.setBounds(20, 160, 80, 25);
		getContentPane().add(profesion);

		textDni = new JTextField();
		textDni.setBounds(80, 80, 94, 25);
		getContentPane().add(textDni);

		textNombre = new JTextField();
		textNombre.setBounds(80, 120, 94, 25);
		getContentPane().add(textNombre);

		textTelefono = new JTextField();
		textTelefono.setBounds(239, 160, 103, 25);
		getContentPane().add(textTelefono);

		textDia = new JTextField();
		textDia.setBounds(329, 80, 28, 25);
		getContentPane().add(textDia);

		textProfesion = new JTextField();
		textProfesion.setBounds(80, 160, 94, 25);
		getContentPane().add(textProfesion);

		botonInsertar.addActionListener(this);
		// ////////////////////////////////////////////
		mibarra1 = new JScrollPane();
		mibarra1.setBounds(10, 244, 580, 367);
		mostrarDatosUsandoLogica();// mostramos la tabla

		botonLimpiar = new JButton();
		botonLimpiar.setBounds(466, 208, 120, 25);
		botonLimpiar.setText("Limpiar");
		botonLimpiar.addActionListener(this);

		getContentPane().add(botonLimpiar);
		getContentPane().add(botonInsertar);
		getContentPane().add(labelTitulo);
		getContentPane().add(mibarra1);
		limpiar();
		setSize(606, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Componentes JTable");
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Fecha Nacimiento:");
		lblNewLabel.setBounds(184, 85, 88, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(184, 125, 60, 14);
		getContentPane().add(lblNewLabel_1);
		
		textApellido1 = new JTextField();
		textApellido1.setBounds(239, 120, 103, 25);
		getContentPane().add(textApellido1);
		textApellido1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Apellido 2:");
		lblNewLabel_2.setBounds(352, 125, 60, 14);
		getContentPane().add(lblNewLabel_2);
		
		textApellido2 = new JTextField();
		textApellido2.setBounds(422, 120, 120, 25);
		getContentPane().add(textApellido2);
		textApellido2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_3.setBounds(20, 213, 60, 14);
		getContentPane().add(lblNewLabel_3);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(80, 208, 242, 25);
		getContentPane().add(textDireccion);
		textDireccion.setColumns(10);
		
		textMes = new JTextField();
		textMes.setText("");
		textMes.setBounds(397, 80, 28, 25);
		getContentPane().add(textMes);
		
		textAnyo = new JTextField();
		textAnyo.setText("");
		textAnyo.setBounds(466, 80, 76, 25);
		getContentPane().add(textAnyo);
		
		lblDia = new JLabel("Dia");
		lblDia.setBounds(305, 82, 28, 20);
		getContentPane().add(lblDia);
		
		lblMes = new JLabel("Mes");
		lblMes.setBounds(369, 85, 28, 14);
		getContentPane().add(lblMes);
		
		lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(435, 85, 46, 14);
		getContentPane().add(lblAo);

	}

	/**
	 * Permite el llenado de la tabla1 usando sin utilizar el table model, para
	 * esto usamos logica de programación por medio de la captura de información
	 * en una lista y luego en una matriz para llenar la tabla
	 */
	public void mostrarDatosUsandoLogica() {

		String titulos[] = { "Dni", "Nombre", "Apellido 1", "Apellido 2", "Profesión", "Fecha Nacimiento", "Telefono", "Direccion" };
		String información[][] = obtieneMariz();// obtenemos la informacion de

		mitabla1 = new JTable(información, titulos);
		mitabla1.setEnabled(false);
		mitabla1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		mibarra1.setViewportView(mitabla1);

	}

	/**
	 * Metodo que permite retornar la matriz
	 * 
	 * @return
	 */
	private String[][] obtieneMariz() {

		/*
		 * como sabemos que son 5 campos, definimos ese valor por defecto para
		 * las columnaslas filas dependen de los registros retornados
		 */
		String informacion[][] = new String[miLista.size()][5];

		for (int x = 0; x < informacion.length; x++) {
			informacion[x][0] = miLista.get(x).getIdPersona() + "";
			informacion[x][1] = miLista.get(x).getNombrePersona() + "";
			informacion[x][2] = miLista.get(x).getProfesionPersona() + "";
			informacion[x][3] = miLista.get(x).getEdadPersona() + "";
			informacion[x][4] = miLista.get(x).getTelefonoPersona() + "";
		}
		return informacion;
	}

	/**
	 * Limpia el formulario de Registro
	 */
	private void limpiar() {
		textDni.setText("");
	//	textAnyo.setText("");
	//	textMes.setText("");
    //  textApellido1.setText("");
	//	textApellido2.setText("");
	//	textDireccion.setText("");
		textNombre.setText("");
		textDia.setText("");
		textTelefono.setText("");
		textProfesion.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonInsertar) {
			try {
				PersonaVo miPersona = new PersonaVo();
				miPersona.setIdPersona(Integer.parseInt(textDni.getText()));
				miPersona.setNombrePersona(textNombre.getText());
				miPersona.setTelefonoPersona(Integer.parseInt(textTelefono.getText()));
				miPersona.setEdadPersona(Integer.parseInt(textDia.getText()));
				miPersona.setProfesionPersona(textProfesion.getText());

				miLista.add(miPersona);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Error en el Ingreso de Datos", "Error", JOptionPane.ERROR_MESSAGE);
			} finally {
				/* Actualizamos siempre las tablas despues del registro */
				mostrarDatosUsandoLogica();
				limpiar();
			}
		}
		if (e.getSource() == botonLimpiar) {
			limpiar();
		}
	}
}
