package personaClase;

public class Persona {
	private String Nombre;
	private String Apellido;
	private String Apellido2;
	private int Edad;

	
	Persona(String Nombre, String Apellido, String Apellido2, int Edad) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Apellido2 = Apellido2;
		this.Edad = Edad;
	}

	void cambiarNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	void cambiarApellido(String Apellido) {
		this.Apellido = Apellido;
	}

	void cambiarApellido2(String Apellido2) {
		this.Apellido2 = Apellido2;
	}

	void cambiarEdad(int Edad) {
		this.Edad = Edad;
	}

	
	public String asignar_nombre() {
		return Nombre;
	}

	public String asignar_apellido() {
		return Apellido;
	}

	public String asignar_2_apellido() {
		return Apellido2;
	}

	public int asignar_edad() {
		return Edad;
	}

	public String toString() {
		return "Persona: Nombre:  " + Nombre + "  Apellido: " + Apellido + "  2ºApellido: " + Apellido2 + " Edad: "
				+ Edad;
	}

}
