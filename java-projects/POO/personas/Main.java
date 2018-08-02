package personas;

///////////////////////////////////////////////////////////////////////////////////////////
//Clase Principal
///////////////////////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	// se crea el ArrayList de Personas
	static ArrayList<Persona> personas = new ArrayList<Persona>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// se leen las personas y se introducen en el ArrayList
		leerPersonas();
		if (numeroDePersonas() > 0) {
			// se muestran todas las personas introducidas
			System.out.println("\nPersonas introducidas: ");
			mostrar();
		}
	}

	// M�todo que lee los datos de cada persona y las a�ade al ArrayList
	public static void leerPersonas() {

		String nombre, direccion, ciudad;
		Fecha fecha;
		Persona p;
		int codigoPostal, N, i, dia, mes, a�o;

		do {
			System.out.print("N�mero de personas? ");
			N = sc.nextInt();
		} while (N < 0);
		sc.nextLine(); // limpiar el buffer de entrada

		for (i = 1; i <= N; i++) {
			System.out.println("Persona " + i);
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			do {
				System.out.println("Fecha de Nacimiento: ");
				System.out.print("Dia: ");
				dia = sc.nextInt();
				System.out.print("Mes: ");
				mes = sc.nextInt();
				System.out.print("A�o: ");
				a�o = sc.nextInt();
				fecha = new Fecha(dia, mes, a�o);
			} while (!fecha.fechaCorrecta());

			sc.nextLine();
			System.out.print("Direcci�n: ");
			direccion = sc.nextLine();
			System.out.print("Codigo Postal: ");
			codigoPostal = sc.nextInt();
			sc.nextLine();
			System.out.print("Ciudad: ");
			ciudad = sc.nextLine();

			// se crea una nueva instancia de Persona
			p = new Persona();
			p.setNombre(nombre);
			p.setFechaNacimiento(fecha);
			p.setDireccion(direccion);
			p.setCodigoPostal(codigoPostal);
			p.setCiudad(ciudad);

			// se a�ade el objeto al array
			personas.add(p);
		}
	}

	// Mostrar todas las personas
	public static void mostrar() {
		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i));
		}
	}

	// Devuelve el n�mero de personas que contiene el array
	public static int numeroDePersonas() {
		return personas.size();
	}

	// Calcula y devuelve el n�mero de personas mayores de edad
	public static int personasMayoresDeEdad() {
		int cont = 0;
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).esMayorDeEdad()) {
				cont++;
			}
		}
		return cont;
	}
} // Fin de la Clase Principal  