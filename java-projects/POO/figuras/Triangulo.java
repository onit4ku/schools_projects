package figuras;

public class Triangulo extends Figura {

	Punto P1;
	Punto P2;
	Punto P3;

	public Triangulo(Punto p1, Punto p2, Punto p3) {
		P1 = p1;
		P2 = p2;
		P3 = p3;
	}

	public String toString() {
		return "Esto es un triangulo: " + P1.toString() + " " + P2.toString() + " " + P3.toString();
	}
}