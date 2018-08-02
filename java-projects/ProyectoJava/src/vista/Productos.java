package vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
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

import modelo.dao.ProductoDAO;
import modelo.vo.ProductoVO;

/**
 * 
 * @author onitaku
 *
 */

public class Productos extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtIdProducto, txtNombreProducto, txtPrecioProducto;
	JButton Alta, Modificar, Borrar, Reestablecer;
	private JTable tableProducto;
	ProductoDAO miProductoDAO;
	JScrollPane scrollPaneProducto;

	DefaultTableModel model;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Productos frame = new Productos();
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Productos() {
		setTitle("Productos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 822, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtIdProducto = new JTextField();
		txtIdProducto.setColumns(10);
		txtIdProducto.setBounds(143, 30, 139, 20);
		contentPane.add(txtIdProducto);

		txtNombreProducto = new JTextField();
		txtNombreProducto.setColumns(10);
		txtNombreProducto.setBounds(143, 62, 139, 20);
		contentPane.add(txtNombreProducto);

		txtPrecioProducto = new JTextField();
		txtPrecioProducto.setColumns(10);
		txtPrecioProducto.setBounds(143, 95, 139, 20);
		contentPane.add(txtPrecioProducto);

		Alta = new JButton("Alta");
		Alta.setFont(new Font("Tahoma", Font.BOLD, 11));
		Alta.setBounds(30, 167, 104, 29);
		Alta.addActionListener(this);
		contentPane.add(Alta);

		Modificar = new JButton("Modificaci\u00F3n");
		Modificar.setFont(new Font("Tahoma", Font.BOLD, 11));
		Modificar.setBounds(30, 247, 104, 29);
		Modificar.addActionListener(this);
		contentPane.add(Modificar);

		Borrar = new JButton("Baja");
		Borrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		Borrar.setBounds(30, 207, 104, 29);
		Borrar.addActionListener(this);
		contentPane.add(Borrar);

		scrollPaneProducto = new JScrollPane();
		scrollPaneProducto.setBounds(344, 30, 416, 281);
		contentPane.add(scrollPaneProducto);

		Reestablecer = new JButton("Reestablecer");
		Reestablecer.setFont(new Font("Tahoma", Font.BOLD, 11));
		Reestablecer.setBounds(165, 207, 117, 29);
		Reestablecer.addActionListener(this);
		contentPane.add(Reestablecer);

		JLabel lblIdProducto = new JLabel("Id Producto:");
		lblIdProducto.setBounds(30, 27, 104, 22);
		contentPane.add(lblIdProducto);

		JLabel lblNombreProducto = new JLabel("Nombre Producto:");
		lblNombreProducto.setBounds(30, 60, 104, 22);
		contentPane.add(lblNombreProducto);

		JLabel lblPrecioProducto = new JLabel("Precio Producto:");
		lblPrecioProducto.setBounds(30, 93, 104, 22);
		contentPane.add(lblPrecioProducto);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(165, 250, 117, 29);
		contentPane.add(btnSalir);

		model = new DefaultTableModel();// definimos el objeto tableModel
		tableProducto = new JTable() {
			public boolean isCellEditable(int rowIndex, int vColIndex) {
				return false;
			}; // return false: Deshabilitar edición de celdas.
		};

		tableProducto.setModel(model);
		tableProducto.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tableProducto.getTableHeader().setReorderingAllowed(false);
		scrollPaneProducto.setViewportView(tableProducto);

		model.addColumn("ID");
		model.addColumn("Nombre");
		model.addColumn("Precio");

		ProductoDAO miProductoDAO = new ProductoDAO();
		ArrayList<ProductoVO> vPro = miProductoDAO.listaDeProductos();

		for (int i = 0; i < vPro.size(); i++) {
			ProductoVO miProducto = vPro.get(i);

			Object[] v = new Object[3];

			v[0] = miProducto.getIdProducto();
			v[1] = miProducto.getNombreProducto();
			v[2] = miProducto.getPrecioProducto();

			model.addRow(v);
		}

		mostrarSeleccionado();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Alta) {

			try {
				registrarProducto();

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

	private void registrarProducto() {
		miProductoDAO = new ProductoDAO();
		ProductoVO miProducto = new ProductoVO();
		miProducto.setIdProducto(Integer.parseInt(txtIdProducto.getText()));
		miProducto.setNombreProducto(txtNombreProducto.getText());
		miProducto.setPrecioProducto(new BigDecimal(txtPrecioProducto.getText()));
		miProductoDAO.registrarProducto(miProducto);

		Object[] v = new Object[3];
		v[0] = miProducto.getIdProducto();
		v[1] = miProducto.getNombreProducto();
		v[2] = miProducto.getPrecioProducto();
		model.addRow(v);

		reestablecer();
	}

	private void reestablecer() {
		txtIdProducto.setText("");
		txtNombreProducto.setText("");
		txtPrecioProducto.setText("");
	}

	public void mostrarSeleccionado() {
		tableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
			String id;
			String nombre;
			String precio;

			public void mouseClicked(java.awt.event.MouseEvent e) {
				if (e.getClickCount() >= 1) {
					int row = tableProducto.getSelectedRow();
					DefaultTableModel modelotabla = (DefaultTableModel) tableProducto.getModel();
					if (tableProducto.getSelectedRow() != -1) {
						id = modelotabla.getValueAt(row, 0).toString();
						nombre = modelotabla.getValueAt(row, 1).toString();
						precio = modelotabla.getValueAt(row, 2).toString();
					}
					txtIdProducto.setText(id + "");
					txtNombreProducto.setText(nombre + "");
					txtPrecioProducto.setText(precio + "");
				}
			}
		});
	}

	public void modificarBD() {
		miProductoDAO = new ProductoDAO();
		ProductoVO miProducto = new ProductoVO();
		miProducto.setIdProducto(Integer.parseInt(txtIdProducto.getText()));
		miProducto.setNombreProducto(txtNombreProducto.getText());
		miProducto.setPrecioProducto(new BigDecimal(txtPrecioProducto.getText()));
		miProductoDAO.modificarProducto(miProducto);

		model.removeRow(tableProducto.getSelectedRow());

		Object[] v = new Object[3];
		v[0] = miProducto.getIdProducto();
		v[1] = miProducto.getNombreProducto();
		v[2] = miProducto.getPrecioProducto();
		model.addRow(v);

	}

	public void borrarBD() {
		miProductoDAO = new ProductoDAO();
		ProductoVO miProducto = new ProductoVO();
		miProducto.setIdProducto(Integer.parseInt(txtIdProducto.getText()));
		miProductoDAO.eliminarProducto(miProducto);
		model.removeRow(tableProducto.getSelectedRow());
	}
}