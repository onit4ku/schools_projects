import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GestionPersonas {

	public static void procesar_persona(ObjectInputStream ois,
			ObjectOutputStream oos) throws EOFException, IOException,
			ClassNotFoundException {
		Persona p = (Persona) ois.readObject();
		System.out.println(" >> Persona:\n" + p);
		try {
			if (p.validar()) {
				oos.writeObject(p);
			}
		} catch (PersonaException pe) {
			System.err.println("Error: " + pe.getMessage());
		}
	}

	public static void procesar_fichero(String f, String g) {
		try {
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream(f));
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(g));

			try {
				while (true) {
					procesar_persona(ois, oos);
				}
			} catch (EOFException eof) {
			}
			oos.close();
			ois.close();

		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("*********************************");
		System.out.println("Procesamiento fichero personas.dat ");
		System.out.println("*********************************");
		procesar_fichero("personas.dat", "personasOK.dat");
		System.out.println();
		System.out.println("*********************************");
		System.out.println("Verificación fichero personasOK.dat");
		System.out.println("*********************************");
		procesar_fichero("personasOK.dat", "personasOK2.dat");
	}

	public static void main2() {
		Persona[] personas = new Persona[40];
		personas[0] = new Persona("Alberto", "Pérez Blanco", "12345678Q",
				"1/2/1976", "Galicia");
		personas[1] = new Persona("Juan", "González Castro", "63498642N",
				"10/5/1956", "Extremadura");
		personas[2] = new Persona("María", "Martín García", "1455446Y",
				"3/21/1982", "Castilla y León");
		personas[3] = new Persona("Ana", "López Galdós", "8875645Z",
				"4/16/1983", "Madrid");
		personas[4] = new Persona("Lorena", "Torres Sánchez", "F5767434X",
				"9/3/1992", "Cataluña");
		personas[5] = new Persona("Manuel", "Iglesias Vázquez", "53643634K",
				"12/31/1899", "Melilla");
		personas[6] = new Persona("Luisa", "Hidalgo Gómez", "23663223H",
				"2/28/1962", "Andalucía");
		personas[7] = new Persona("Jaime", "Prat Teruel", "76593422I",
				"6/24/1968", "Murcia");
		personas[8] = new Persona("Carmen", "Ortiz Muñoz", "52425742K",
				"10/10/1944", "Ceuta");
		personas[9] = new Persona("Abelardo", "Madrid Puerto", "12635444N",
				"4/21/1957", "País Vasco");
		personas[10] = new Persona("Celia", "Díaz Soriano", "87566123Y",
				"8/2/2016", "Aragón");
		personas[11] = new Persona("Rosendo", "Beltrán Ros", "1676523F",
				"2/2/2014", "Menorca");
		personas[12] = new Persona("Daniela", "Portillo García", "32857763D",
				"1/1/2000", "Ibiza");
		personas[13] = new Persona("Jorge", "Martínez Campos", "13565634G",
				"5/5/2015", "Canarias");
		personas[14] = new Persona("Susan", "Lincoln", "Y4565534P", "8/6/1986",
				"Asturias");
		personas[15] = new Persona("Isabella", "Martini", "Z97891234H",
				"4/22/1963", "Cantabria");
		personas[16] = new Persona("Jean", "Proust", "G15767234G", "9/28/1868",
				"Navarra");
		personas[17] = new Persona("Iván", "Denisovitch", "X12665434R",
				"10/10/1935", "Aragón");
		personas[18] = new Persona("Juan José", "López Sánchez", "1267634RL",
				"7/7/1972", "Castilla La Mancha");

		for (int i = 0; i <= 18; i++) {
			System.out.println(personas[i]);
			try {
				personas[i].validar();
			} catch (PersonaException e) {
				System.out.println(e);
			}
		}
	}
}
