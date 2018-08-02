package automoviles;

public class Vehiculo {

	enum colorType {
		red, blue, black,
	}

	// datos objeto
	private colorType color;
	private int deposito;
	private int velocidad;
	private int numPuertas;

	// Constructores
	public Vehiculo() {
		numPuertas = 3;
		deposito = 40;
		velocidad = 100;
		color = Vehiculo.colorType.red;
	}

	public Vehiculo(int lPuertas, int lVelocidad, int lDeposito) {
		numPuertas = lPuertas;
		deposito = lDeposito;
		velocidad = lVelocidad;
	}

	public Vehiculo(int lVelocidad, int lDeposito) {
		deposito = lDeposito;
		velocidad = lVelocidad;
	}

	public Vehiculo(colorType color, int deposito, int velocidad, int numPuertas) {
		super();
		this.color = color;
		this.deposito = deposito;
		this.velocidad = velocidad;
		this.numPuertas = numPuertas;
	}

	// Metodos
	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	void setColor(colorType lColor) {
		this.color = lColor;
	}

	// Velocidad
	void setVelocidad(int num) {
		this.velocidad = num;
	}

	int getVelocidad() {
		return velocidad;
	}

	public String toString() {
		return "Soy un Vehiculo " + " Deposito: " + deposito + " Velocidad: " + velocidad + " Puertas: " + numPuertas
				+ " Color: " + color;
	}

}