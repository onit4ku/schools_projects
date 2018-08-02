package automoviles;

public class Coche extends Vehiculo {

	int nuevoDeposito;

	Coche() {
		this.setPuertas(3);
	}

	void setPuertas(int num) {
		if (num <= 2) {
			super.setNumPuertas(num);
			;
		}
	}

	public String toString() {
		return "Coche: " + " Deposito: " + getDeposito() + " Puertas: " + getNumPuertas() + " Velocidad: "
				+ getVelocidad();
	}
}