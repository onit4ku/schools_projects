package vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import modelo.dao.ClienteDAO;

/**
 * 
 * @author onitaku
 *
 */

public class Principal extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ClienteDAO miClienteDAO;

	boolean cliente = true;
	boolean producto = true;
	boolean factura = true;

	JTable tableCliente;
	JButton btnClientes, btnProductos;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		setTitle("ABM - Facturaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnClientes = new JButton("Clientes");
		btnClientes.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cliente == true) {
					new Clientes().setVisible(true);
					cliente = false;
					producto = true;
					factura = true;
				} else {
					new Clientes().dispose();
					cliente = true;
				}
			}
		});
		contentPane.setLayout(null);

		btnClientes.setBounds(73, 97, 135, 36);
		getContentPane().add(btnClientes);

		btnProductos = new JButton("Productos");
		btnProductos.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (producto == true) {
					new Productos().setVisible(true);
					cliente = true;
					producto = false;
					factura = true;
				} else {
					new Productos().dispose();
					producto = true;
				}
			}
		});
		btnProductos.setBounds(385, 169, 135, 36);
		getContentPane().add(btnProductos);

		JButton btnFactura = new JButton("Facturas");
		btnFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (factura == true) {
					new Facturas().setVisible(true);
					cliente = true;
					producto = true;
					factura = false;
				} else {
					new Facturas().dispose();
					factura = true;
				}
			}
		});
		btnFactura.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnFactura.setBounds(215, 141, 135, 36);
		getContentPane().add(btnFactura);

		JToolBar toolBar = new JToolBar();
		toolBar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		toolBar.setBounds(0, 0, 398, 69);
		contentPane.add(toolBar);

		JButton btnAbClientes = new JButton("Clientes");
		btnAbClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cliente == true) {
					new Clientes().setVisible(true);
					cliente = false;
					producto = true;
					factura = true;
				} else {
					new Clientes().dispose();
					cliente = true;
				}
			}
		});
		btnAbClientes.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/client.png")));
		toolBar.add(btnAbClientes);

		JButton btnAbFacturas = new JButton("Facturas");
		btnAbFacturas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (factura == true) {
					new Facturas().setVisible(true);
					cliente = true;
					producto = true;
					factura = false;
				} else {
					new Facturas().dispose();
					factura = true;
				}
			}
		});
		btnAbFacturas.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/factura.png")));
		toolBar.add(btnAbFacturas);

		JButton btnAbProductos = new JButton("Productos");
		btnAbProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (producto == true) {
					new Productos().setVisible(true);
					cliente = true;
					producto = false;
					factura = true;
				} else {
					new Productos().dispose();
					producto = true;
				}
			}
		});
		toolBar.add(btnAbProductos);
		btnAbProductos.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/product.png")));

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFacturacion = new JMenu("ABM");
		menuBar.add(mnFacturacion);

		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cliente == true) {
					new Clientes().setVisible(true);
					cliente = false;
					producto = true;
					factura = true;
				} else {
					new Clientes().dispose();
					cliente = true;
				}
			}
		});
		mnFacturacion.add(mntmClientes);

		JMenuItem mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (producto == true) {
					new Productos().setVisible(true);
					cliente = true;
					producto = false;
					factura = true;
				} else {
					new Productos().dispose();
					producto = true;
				}
			}
		});

		JMenuItem mntmFactura = new JMenuItem("Factura");
		mntmFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (factura == true) {
					new Facturas().setVisible(true);
					cliente = true;
					producto = true;
					factura = false;
				} else {
					new Facturas().dispose();
					factura = true;
				}
			}
		});
		mnFacturacion.add(mntmFactura);
		mnFacturacion.add(mntmProductos);
	}
}
