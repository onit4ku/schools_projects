package vista;

import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.table.DefaultTableModel;

import modelo.dao.ClienteDAO;
import modelo.vo.ClienteVO;

/**
 * 
 * @author onitaku
 *
 */

public class Clientes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField Nif, Nombre, Direccion;
	JButton Alta, Modificar, Borrar, Reestablecer;
	private JTable tableCliente;
	ClienteDAO miClienteDAO;
	JScrollPane scrollPaneCliente;

	DefaultTableModel model;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Clientes() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 863, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Nif = new JTextField();
		Nif.setColumns(10);
		Nif.setBounds(143, 30, 139, 20);
		contentPane.add(Nif);

		Nombre = new JTextField();
		Nombre.setColumns(10);
		Nombre.setBounds(143, 62, 139, 20);
		contentPane.add(Nombre);

		Direccion = new JTextField();
		Direccion.setColumns(10);
		Direccion.setBounds(143, 95, 139, 20);
		contentPane.add(Direccion);

		Alta = new JButton("Alta");
		Alta.setFont(new Font("Tahoma", Font.BOLD, 11));
		Alta.setBounds(30, 199, 104, 29);
		Alta.addActionListener(this);
		contentPane.add(Alta);

		Modificar = new JButton("Modificaci\u00F3n");
		Modificar.setFont(new Font("Tahoma", Font.BOLD, 11));
		Modificar.setBounds(30, 279, 104, 29);
		Modificar.addActionListener(this);
		contentPane.add(Modificar);

		Borrar = new JButton("Baja");
		Borrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		Borrar.setBounds(30, 239, 104, 29);
		Borrar.addActionListener(this);
		contentPane.add(Borrar);

		scrollPaneCliente = new JScrollPane();
		scrollPaneCliente.setBounds(310, 30, 527, 281);
		contentPane.add(scrollPaneCliente);

		Reestablecer = new JButton("Reestablecer");
		Reestablecer.setFont(new Font("Tahoma", Font.BOLD, 11));
		Reestablecer.setBounds(165, 239, 117, 29);
		Reestablecer.addActionListener(this);
		contentPane.add(Reestablecer);

		JLabel label = new JLabel("NIF:");
		label.setBounds(30, 27, 104, 22);
		contentPane.add(label);

		JLabel label_1 = new JLabel("Nombre:");
		label_1.setBounds(30, 60, 104, 22);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("Dirección:");
		label_2.setBounds(30, 93, 104, 22);
		contentPane.add(label_2);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(165, 282, 117, 29);
		contentPane.add(btnSalir);

		model = new DefaultTableModel();// definimos el objeto tableModel
		tableCliente = new JTable() {
			public boolean isCellEditable(int rowIndex, int vColIndex) {
				return false;
			}; // return false: Deshabilitar edición de celdas.
		};

		tableCliente.setModel(model);
		tableCliente.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tableCliente.getTableHeader().setReorderingAllowed(false);
		scrollPaneCliente.setViewportView(tableCliente);

		model.addColumn("NIF");
		model.addColumn("Nombre");
		model.addColumn("Dirección");

		ClienteDAO miClienteDao = new ClienteDAO();
		ArrayList<ClienteVO> vCli = miClienteDao.listaDeClientes();

		for (int i = 0; i < vCli.size(); i++) {
			ClienteVO miCliente = vCli.get(i);

			Object[] v = new Object[3];

			v[0] = miCliente.getNifCliente();
			v[1] = miCliente.getNombreCliente();
			v[2] = miCliente.getDireccionCliente();

			model.addRow(v);
		}

		mostrarSeleccionado();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Alta) {
			try {
				altaBD();
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == Modificar) {

			try {
				mostrarSeleccionado();
				modificarBD();
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Error en la modificación de los datos", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		if (e.getSource() == Borrar) {
			try {
				borrarBD();
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Error al eliminar los datos", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}

		if (e.getSource() == Reestablecer) {

			reestablecer();
		}
	}

	private void altaBD() {
		miClienteDAO = new ClienteDAO();
		ClienteVO miCliente = new ClienteVO();
		miCliente.setNifCliente(Nif.getText());
		miCliente.setNombreCliente(Nombre.getText());
		miCliente.setDireccionCliente(Direccion.getText());
		miClienteDAO.registrarCliente(miCliente);

		Object[] v = new Object[3];
		v[0] = miCliente.getNifCliente();
		v[1] = miCliente.getNombreCliente();
		v[2] = miCliente.getDireccionCliente();

		model.addRow(v);
		reestablecer();
	}

	private void reestablecer() {
		Nif.setText("");
		Nombre.setText("");
		Direccion.setText("");
	}

	public void mostrarSeleccionado() {
		tableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
			String documento;
			String nombre;
			String direccion;

			public void mouseClicked(java.awt.event.MouseEvent e) {
				if (e.getClickCount() >= 1) {
					int row = tableCliente.getSelectedRow();
					DefaultTableModel modelotabla = (DefaultTableModel) tableCliente.getModel();
					if (tableCliente.getSelectedRow() != -1) {
						documento = modelotabla.getValueAt(row, 0).toString();
						nombre = modelotabla.getValueAt(row, 1).toString();
						direccion = modelotabla.getValueAt(row, 2).toString();
					}
					Nif.setText(documento + "");
					Nombre.setText(nombre + "");
					Direccion.setText(direccion + "");
				}
			}
		});
	}

	public void modificarBD() {
		miClienteDAO = new ClienteDAO();
		ClienteVO miCliente = new ClienteVO();
		miCliente.setNifCliente(Nif.getText());
		miCliente.setNombreCliente(Nombre.getText());
		miCliente.setDireccionCliente(Direccion.getText());
		miClienteDAO.modificarCliente(miCliente);

		model.removeRow(tableCliente.getSelectedRow());

		Object[] v = new Object[3];
		v[0] = miCliente.getNifCliente();
		v[1] = miCliente.getNombreCliente();
		v[2] = miCliente.getDireccionCliente();
		model.addRow(v);
	}

	public void borrarBD() {
		miClienteDAO = new ClienteDAO();
		ClienteVO miCliente = new ClienteVO();
		miCliente.setNifCliente(Nif.getText());
		miClienteDAO.eliminarCliente(miCliente);

		model.removeRow(tableCliente.getSelectedRow());
	}
}