import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Calculadora extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldOp1;
	private JTextField textFieldOp2;
	private JTextField textFieldResultado;

	private JComboBox comboBox;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JLabel lblOp1 = new JLabel("Operando 1:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblOp1, 23, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblOp1, 71, SpringLayout.WEST, contentPane);
		contentPane.add(lblOp1);

		JLabel lblOp2 = new JLabel("Operando 2:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblOp2, 17, SpringLayout.SOUTH, lblOp1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblOp2, 0, SpringLayout.WEST, lblOp1);
		contentPane.add(lblOp2);

		JLabel lblOperacion = new JLabel("Operaci\u00F3n:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblOperacion, 20, SpringLayout.SOUTH, lblOp2);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblOperacion, 0, SpringLayout.WEST, lblOp1);
		contentPane.add(lblOperacion);

		JLabel lblres = new JLabel("Resultado:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblres, 62, SpringLayout.SOUTH, lblOperacion);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblres, 0, SpringLayout.WEST, lblOp1);
		contentPane.add(lblres);

		JButton btnIgual = new JButton("=");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnIgual, 146, SpringLayout.WEST, contentPane);
		contentPane.add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double op1 = new Double(Calculadora.this.textFieldOp1.getText()).doubleValue();
				double op2 = new Double(Calculadora.this.textFieldOp2.getText()).doubleValue();

				switch (comboBox.getSelectedIndex()) {
				case 0:
					Calculadora.this.textFieldResultado.setText("" + (op1 + op2));
					break;
				case 1:
					Calculadora.this.textFieldResultado.setText("" + (op1 - op2));
					break;
				case 2:
					Calculadora.this.textFieldResultado.setText("" + (op1 * op2));
					break;
				case 3:
					Calculadora.this.textFieldResultado.setText("" + (op1 / op2));
				}
			}
		});

		textFieldOp1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.EAST, textFieldOp1, -61, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnIgual, 0, SpringLayout.EAST, textFieldOp1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textFieldOp1, 0, SpringLayout.NORTH, lblOp1);
		contentPane.add(textFieldOp1);
		textFieldOp1.setColumns(10);

		textFieldOp2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textFieldOp2, 0, SpringLayout.NORTH, lblOp2);
		sl_contentPane.putConstraint(SpringLayout.WEST, textFieldOp2, 0, SpringLayout.WEST, textFieldOp1);
		contentPane.add(textFieldOp2);
		textFieldOp2.setColumns(10);

		textFieldResultado = new JTextField();
		textFieldResultado.setFont(new Font("Tahoma", Font.BOLD, 13));
		textFieldResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldResultado.setEnabled(false);
		textFieldResultado.setText("0");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnIgual, 33, SpringLayout.SOUTH, textFieldResultado);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textFieldResultado, 0, SpringLayout.NORTH, lblres);
		sl_contentPane.putConstraint(SpringLayout.WEST, textFieldResultado, 0, SpringLayout.WEST, textFieldOp1);
		contentPane.add(textFieldResultado);
		textFieldResultado.setColumns(10);

		comboBox = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox, -3, SpringLayout.NORTH, lblOperacion);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, textFieldOp1);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBox, 134, SpringLayout.EAST, lblOperacion);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "+", "-", "*", "/" }));

		contentPane.add(comboBox);
	}
}
