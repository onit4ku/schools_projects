package rectangulo;

import punto.Punto;

public class Rectangulo {

	private Punto p1;
	private Punto p2;
	private Punto p3;
	private Punto p4;

	public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	public Rectangulo(float alto, float ancho) {
		p1 = new Punto(0, 0);
		p2 = new Punto(0 + ancho, 0);
		p3 = new Punto(0 + ancho, 0 + alto);
		p4 = new Punto(0, 0 + alto);
	}

	float area() {
		return Math.abs((p1).getX() - (p2).getX()) * Math.abs((p1).getY() - (p4).getY());
	}

	void desplazar(float x, float y) {
		p1.setX(p1.getX() + x);
		p1.setY(p1.getY() + y);
		
		p2.setX(p2.getX() + x);
		p2.setY(p2.getY() + y);
		
		p3.setX(p3.getX() + x);
		p3.setY(p3.getY() + y);
		
		p4.setX(p4.getY() + x);
		p4.setY(p4.getY() + y);
	}

	@Override
	public String toString() {
		return "Rectangulo [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + "]";
	}
}
