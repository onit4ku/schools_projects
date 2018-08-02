package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	/**
	 * serializable generado
	 */
	private static final long serialVersionUID = -7383200290266265988L;

	JTextField pantalla;
	double resultado;
	String operacion;
	JPanel panelNum, panelOp;
	boolean nuevaOp = true;

	public Calculadora() {
		super();
		setSize(260, 260);
		setTitle("Calculadora");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new BorderLayout());

		pantalla = new JTextField("0", 20);
		pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
		pantalla.setFont(new Font("Consolas", Font.BOLD, 30));
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		pantalla.setEditable(false);
		pantalla.setBackground(Color.BLACK);
		pantalla.setForeground(Color.ORANGE);
		pantalla.setText("0");

		panel.add("North", pantalla);

		panelNum = new JPanel();
		panelNum.setBackground(Color.GRAY);
		panelNum.setLayout(new GridLayout(4, 3));
		panelNum.setBorder(new EmptyBorder(4, 4, 4, 4));

		for (int n = 9; n >= 0; n--) {
			nuevoBtnNum("" + n);
		}

		nuevoBtnNum(".");

		panel.add("Center", panelNum);

		panelOp = new JPanel();
		panelOp.setBackground(Color.DARK_GRAY);
		panelOp.setLayout(new GridLayout(6, 1));
		panelOp.setBorder(new EmptyBorder(5, 5, 5, 5));

		nuevoBotonOperacion("CE");
		nuevoBotonOperacion("/");
		nuevoBotonOperacion("*");
		nuevoBotonOperacion("-");
		nuevoBotonOperacion("+");
		nuevoBotonOperacion("=");

		panel.add("East", panelOp);
	}

	private void nuevoBtnNum(String digito) {
		JButton btn = new JButton();
		btn.setFont(new Font("Consolas", Font.BOLD, 20));
		btn.setText(digito);
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent evt) {
				JButton btn = (JButton) evt.getSource();
				numeroPulsado(btn.getText());
			}
		});

		panelNum.add(btn);
	}

	private void nuevoBotonOperacion(String operacion) {
		JButton btn = new JButton(operacion);
		btn.setFont(new Font("Consolas", Font.BOLD, 20));
		btn.setForeground(new Color(210, 105, 30));
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent evt) {
				JButton btn = (JButton) evt.getSource();
				operacionPulsado(btn.getText());
			}
		});

		panelOp.add(btn);
	}

	private void numeroPulsado(String digito) {
		if (pantalla.getText().equals("0") || nuevaOp) {
			pantalla.setText(digito);
		} else {
			pantalla.setText(pantalla.getText() + digito);
		}
		nuevaOp = false;
	}

	private void operacionPulsado(String tecla) {
		if (tecla.equals("=")) {
			calcularResultado();
		} else if (tecla.equals("CE")) {
			resultado = 0;
			pantalla.setText("0");
			nuevaOp = true;
		} else {
			operacion = tecla;
			if ((resultado > 0) && !nuevaOp) {
				calcularResultado();
			} else {
				resultado = new Double(pantalla.getText());
			}
		}
		nuevaOp = true;
	}

	private void calcularResultado() {
		if (operacion.equals("+")) {
			resultado += new Double(pantalla.getText());
		} else if (operacion.equals("-")) {
			resultado -= new Double(pantalla.getText());
		} else if (operacion.equals("/")) {
			resultado /= new Double(pantalla.getText());
		} else if (operacion.equals("*")) {
			resultado *= new Double(pantalla.getText());
		}
		pantalla.setText("" + resultado);
		operacion = "";
	}
}