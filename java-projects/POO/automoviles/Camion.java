package automoviles;

public class Camion extends Vehiculo {

	int nuevoDeposito;

	Camion() {
		this.setPuertas(3);
	}

	void setPuertas(int num) {
		if (num <= 2) {
			super.setNumPuertas(num);
		}
	}

	public String toString() {
		return "Camion: " + " Deposito: " + getDeposito() + " Puertas: " + getNumPuertas() + " Velocidad: "
				+ getVelocidad();
	}
}