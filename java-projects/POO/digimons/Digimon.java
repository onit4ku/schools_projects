package digimons;

public class Digimon {

	private double tamanyo;
	private String color;
	private String nombre;

	public Digimon(double tamanyo, String color, String nombre) {
		setTamanyo(tamanyo);
		setColor(color);
		setNombre(nombre);
	}
	
	enum Colores{
		naranja,
		rojo,
		verde,
		negro,
		amarillo,
		azul
	}

	public void setTamanyo(double tamanyo) {

		this.tamanyo = tamanyo;
	}

	public double getTamanyo() {

		return tamanyo;
	}

	public void setColor(String color) {

		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public String getNombre() {

		return nombre;
	}

	public String toString() {
		String str = "Digimon: \nColor: " + this.getColor() + "\nTamaño: " + this.getTamanyo() + "\nNombre: "
				+ this.getNombre();

		return str;
	}

}
