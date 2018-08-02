import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

public class Persona implements Serializable {

	/** declaracion de los atributos de instancia */
	private String nombre;
	private String apellidos;
	private String nif;
	private Date fecha;
	private String lugar;

	/** declaracion de los atributos estaticos */
	private static final DateFormat df = DateFormat
			.getDateInstance(DateFormat.MEDIUM);
	private static final long serialVersionUID = -7143657398023718689L;

	/** el atributo estatico COMUNIDADES sera util en el metodo validarLugar */
	private static final String[] COMUNIDADES = { "GALICIA", "ASTURIAS",
			"CANTABRIA", "PAÍS VASCO", "NAVARRA", "LA RIOJA",
			"CASTILLA Y LEÓN", "CASTILLA LA MANCHA", "MADRID", "EXTREMADURA",
			"ANDALUCÍA", "MURCIA", "COMUNIDAD VALENCIANA", "ARAGÓN",
			"CATALUÑA", "BALEARES", "CANARIAS", "CEUTA", "MELILLA" };

	/** el atributo estatico LONG_TIME_AGO sera util en el metodo validarFecha */
	private static final Date LONG_TIME_AGO = new Date("01/01/1900"); // deprecated

	/**
	 * el atributo estatico TABLA sera util en el metodo validarNif el atributo
	 * estatico TABLA se usa en el metodo verificarLetra
	 */
	private static final String TABLA = "TRWAGMYFPDXBNJZSQVHLCKE";

	/** constructor */
	public Persona(String nombre, String apellidos, String nif, String fecha,
			String lugar) {
		this.nombre = nombre.toUpperCase();
		this.apellidos = apellidos.toUpperCase();
		this.nif = nif.toUpperCase();
		this.fecha = new Date(fecha); // deprecated
		this.lugar = lugar.toUpperCase();
	}

	/** metodo toString */
	public String toString() {
		return "-----------------------\n" + "nombre: " + nombre + "\n"
				+ "apellidos: " + apellidos + "\n" + "nif: " + nif + "\n"
				+ "fecha: " + df.format(fecha) + "\n" + "lugar: " + lugar
				+ "\n";
	}

	/** metodo validar */
	public boolean validar() throws PersonaException {

		return validarLugar() && validarFecha() && validarNif();

	}

	/**
	 * metodo verificarLetra este metodo sera util en el metodo validarNif
	 */
	private boolean verificarLetra(int numero, char letra) {
		return letra == TABLA.charAt(numero % 23);
	}

	private boolean validarLugar() throws LugarDesconocido {
		for (int cont = 0; cont < COMUNIDADES.length; cont++) {
			if (COMUNIDADES[cont].equalsIgnoreCase(lugar)) {
				return true;
			}
		}
		throw new LugarDesconocido(lugar, "El lugar es desconocido");
	}

	private boolean validarFecha() throws FechaIncorrecta {
		if (fecha.after(LONG_TIME_AGO) && fecha.before(new Date())) {
			return true;
		}
		throw new FechaIncorrecta(df.format(fecha),
				"La fecha de nacimiento no es válida");
	}

	private boolean validarNif() throws NifIncorrecto {
		int num = getNumeroNif();
		char letra = nif.charAt(nif.length() - 1);
		if (verificarLetra(num, letra)) {
			return true;
		}
		throw new NifIncorrecto(nif, "La letra de control del NIF no coincide");
	}

	private int getNumeroNif() throws NifIncorrecto {
		try {
			int num = -1;
			char c = nif.charAt(0);
			switch (c) {
			case 'x':
			case 'X':
				num = Integer.valueOf(nif.substring(1, nif.length() - 1));
				break;
			case 'y':
			case 'Y':
				num = 1 + Integer.valueOf(nif.substring(1, nif.length() - 1));
				break;
			case 'z':
			case 'Z':
				num = 2 + Integer.valueOf(nif.substring(1, nif.length() - 1));
				break;
			default:
				num = Integer.valueOf(nif.substring(0, nif.length() - 1));
				break;
			}
			return num;
		} catch (NumberFormatException e) {
			throw new NifIncorrecto(nif, "El formato del NIF es incorrecto");
		}
	}

}
