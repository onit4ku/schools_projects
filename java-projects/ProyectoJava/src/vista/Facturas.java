package vista;

import java.awt.Button;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.dao.ClienteDAO;
import modelo.dao.ProductoDAO;
import modelo.vo.ClienteVO;
import modelo.vo.ProductoVO;

/**
 * 
 * @author onitaku
 *
 */

public class Facturas extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTable tableLineas;

	private ClienteVO c;
	private ProductoVO p;

	private ArrayList<ProductoVO> listaProductos;
	private ArrayList<ProductoVO> vProductosLineas = new ArrayList<ProductoVO>();
	private int ProductoActual;

	private JScrollPane scrollPaneLineas;

	private JTextField txtNumFactura, txtNombre, txtDireccion, txtPrecio, txtFechaAct;
	private JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5,
			lblDatosFactura, lblNmeroFactura, lblFechaFactura, lblIdCliente;
	private Choice choiceProducto, choiceNif;

	private DefaultTableModel model;
	private Button btnAnyadir;
	private JTextField textTotal;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Facturas frame = new Facturas();
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Facturas() {
		ClienteDAO miClienteDao = new ClienteDAO();
		ArrayList<ClienteVO> listaClientes = miClienteDao.listaDeClientes();

		ProductoDAO miProductoDao = new ProductoDAO();
		listaProductos = miProductoDao.listaDeProductos();

		setTitle("ABM - Facturas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 808, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(78, 101, 46, 20);
		contentPane.add(txtCantidad);

		scrollPaneLineas = new JScrollPane();
		scrollPaneLineas.setBounds(10, 132, 767, 251);
		contentPane.add(scrollPaneLineas);

		lblNmeroFactura = new JLabel("N\u00FAmero Factura:");
		lblNmeroFactura.setBounds(10, 35, 114, 22);
		contentPane.add(lblNmeroFactura);

		lblFechaFactura = new JLabel("Fecha Factura:");
		lblFechaFactura.setBounds(222, 35, 86, 22);
		contentPane.add(lblFechaFactura);

		lblIdCliente = new JLabel("Nif Cliente:");
		lblIdCliente.setBounds(472, 36, 78, 22);
		contentPane.add(lblIdCliente);

		lblNewLabel = new JLabel("Precio:");
		lblNewLabel.setBounds(152, 104, 46, 14);
		contentPane.add(lblNewLabel);

		txtNumFactura = new JTextField();
		txtNumFactura.setBounds(112, 36, 86, 20);
		contentPane.add(txtNumFactura);
		txtNumFactura.setColumns(10);

		lblNewLabel_1 = new JLabel("Cantidad:");
		lblNewLabel_1.setBounds(10, 104, 58, 14);
		contentPane.add(lblNewLabel_1);

		txtNombre = new JTextField();
		txtNombre.setBounds(569, 68, 139, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		lblNewLabel_2 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2.setBounds(472, 104, 78, 14);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Datos Cliente:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(472, 11, 94, 14);
		contentPane.add(lblNewLabel_3);

		txtDireccion = new JTextField();
		txtDireccion.setBounds(569, 101, 208, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);

		lblNewLabel_4 = new JLabel("Nombre:");
		lblNewLabel_4.setBounds(472, 71, 78, 14);
		contentPane.add(lblNewLabel_4);

		lblDatosFactura = new JLabel("Datos Factura:");
		lblDatosFactura.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDatosFactura.setBounds(10, 11, 104, 14);
		contentPane.add(lblDatosFactura);

		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(210, 101, 61, 20);
		contentPane.add(txtPrecio);

		lblNewLabel_5 = new JLabel("Producto:");
		lblNewLabel_5.setBounds(10, 68, 58, 14);
		contentPane.add(lblNewLabel_5);

		choiceNif = new Choice();
		choiceNif.setBounds(569, 36, 132, 20);
		choiceNif.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				c = listaClientes.get(choiceNif.getSelectedIndex());
				txtNombre.setText(listaClientes.get(choiceNif.getSelectedIndex()).getNombreCliente() + "");
				txtDireccion.setText(listaClientes.get(choiceNif.getSelectedIndex()).getDireccionCliente() + "");
			}
		});

		contentPane.add(choiceNif);

		btnAnyadir = new Button("A\u00F1adir:");
		btnAnyadir.setBounds(326, 99, 70, 22);
		btnAnyadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				agregarLinea();
			}
		});
		contentPane.add(btnAnyadir);

		choiceProducto = new Choice();
		choiceProducto.setBounds(78, 68, 193, 20);
		choiceProducto.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				txtPrecio.setText(listaProductos.get(choiceProducto.getSelectedIndex()).getPrecioProducto() + "");
			}
		});
		contentPane.add(choiceProducto);

		// for choice clientes
		for (int i = 0; i < listaClientes.size(); i++) {
			c = listaClientes.get(i);
			choiceNif.add(c.getNifCliente());

		}
		// for choice productos
		for (int i = 0; i < listaProductos.size(); i++) {
			p = listaProductos.get(i);
			choiceProducto.add(p.getNombreProducto());
		}

		model = new DefaultTableModel();// definimos el objeto tableModel
		tableLineas = new JTable() {
			public boolean isCellEditable(int rowIndex, int vColIndex) {
				return false;
			}; // return false: Deshabilitar edición de celdas.
		};

		tableLineas.setModel(model);
		tableLineas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tableLineas.getTableHeader().setReorderingAllowed(false);
		scrollPaneLineas.setViewportView(tableLineas);

		txtFechaAct = new JTextField();
		txtFechaAct.setHorizontalAlignment(SwingConstants.CENTER);
		txtFechaAct.setColumns(10);
		txtFechaAct.setBounds(318, 36, 78, 20);
		contentPane.add(txtFechaAct);

		model.addColumn("Cantidad");
		model.addColumn("Producto");
		model.addColumn("Precio");

		// fecha actual para el campo de texto de la factura
		Calendar fecha = Calendar.getInstance();
		txtFechaAct.setText(Integer.toString(fecha.get(Calendar.DATE)) + "-"
				+ Integer.toString(fecha.get(Calendar.MONTH) + 1) + "-" + Integer.toString(fecha.get(Calendar.YEAR)));

		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setBounds(472, 404, 46, 14);
		contentPane.add(lblTotal);

		textTotal = new JTextField();
		textTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		textTotal.setText("0");
		textTotal.setBounds(569, 401, 139, 20);
		contentPane.add(textTotal);
		textTotal.setColumns(10);

		JButton btnNewButton = new JButton("Facturar");
		btnNewButton.setBounds(20, 400, 89, 23);
		contentPane.add(btnNewButton);
	}

	public void agregarLinea() {
		Object[] objeto = new Object[3];
		objeto[0] = txtCantidad.getText();
		objeto[1] = choiceProducto.getSelectedItem();
		objeto[2] = txtPrecio.getText();

		model.addRow(objeto);
		ProductoActual = choiceProducto.getSelectedIndex();
		vProductosLineas.add(listaProductos.get(ProductoActual));
	}

	public void sumarTotal() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}