package linea;

import punto.Punto;

public class Linea {
	Punto _puntoA;
	Punto _puntoB;

	public Linea() {
	}

	public Linea(Punto p1, Punto p2) {
		this._puntoA = p1;
		this._puntoB = p2;
	}

	public void mueveDerecha(float valor) {
		_puntoA.setX(_puntoA.getX() + valor);
		_puntoB.setX(_puntoB.getX() + valor);
	}

	public void mueveIzquierda(float valor) {
		_puntoA.setX(_puntoA.getX() - valor);
		_puntoB.setX(_puntoB.getX() - valor);
	}

	public void mueveArriba(float valor) {
		_puntoA.setY(_puntoA.getY() + valor);
		_puntoB.setY(_puntoB.getY() + valor);
	}

	public void mueveAbajo(float valor) {
		_puntoA.setY(_puntoA.getY() - valor);
		_puntoB.setY(_puntoB.getY() - valor);
	}

	public Linea(int x1, int y1, int x2, int y2) {
		_puntoA = new Punto(x1, y1);
		_puntoB = new Punto(x2, y2);
	}

	public Punto get_puntoA() {
		return _puntoA;
	}

	public void set_puntoA(Punto _puntoA) {
		this._puntoA = _puntoA;
	}

	public Punto get_puntoB() {
		return _puntoB;
	}

	public void set_puntoB(Punto _puntoB) {
		this._puntoB = _puntoB;
	}

	public String toString() {
		return "Esto es una linea: " + _puntoA.toString() + " " + _puntoB.toString();
	}

}
