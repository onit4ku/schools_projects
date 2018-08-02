package digimons;

public class Principal {
	public static void main(String[] args) {

		Digimon digimon1 = new Digimon(20.4, "Naranja", "Agumon");
		Digimon digimon2 = new Digimon(50.4, "Rojo", "Greymon");

		System.out.println(digimon1.toString());
		System.out.println();
		System.out.println(digimon2.toString());
		
	}
}