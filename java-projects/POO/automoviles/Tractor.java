package automoviles;

public class Tractor extends Vehiculo {

	Tractor() {
		this.setPuertas(2);
	}

	void setPuertas(int num) {
		if (num <= 2) {
			super.setNumPuertas(num);
		}
	}

	public String toString() {
		return "Tractor " + " Deposito: " + getDeposito() + " Puertas: " + getNumPuertas();
	}
}