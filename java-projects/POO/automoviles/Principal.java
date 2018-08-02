package automoviles;

public class Principal {

	public static void main(String[] args) {

		Coche miCoche = new Coche();
		miCoche.setColor(Coche.colorType.blue);
		System.out.println(miCoche);

		System.out.println("********************");
		Tractor miTractor = new Tractor();

		// miTractor.CambiarPuertas(5);

		System.out.println(miTractor);
	}

}

// miCoche.CambiarVelocidad(40);
//
// System.out.println(miCoche.CogerVelocidad());
//
// miCoche.CambiarPuertas(5);
//
// System.out.println(miCoche.Puertas());