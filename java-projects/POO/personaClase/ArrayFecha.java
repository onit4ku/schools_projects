package personaClase;

import java.lang.reflect.Array;
import java.util.Vector;

public class ArrayFecha {

	private Fecha vect[];
	int indiceActual = 0;
	boolean exito = true;
	int num;

	ArrayFecha() {
		int maxTamanyo = 100;
		vect = new Fecha[maxTamanyo];
	}

	ArrayFecha(int num) {
		this.num = num;
		vect = new Fecha[num];
	}

	void inserta(Fecha f) {
		vect[indiceActual] = f;
		if (indiceActual<num) {
			indiceActual++;
		}	
	}

	int tamanyo() {
		return indiceActual;
	}

	Fecha DarFecha(int indice) {
		Fecha tmp = vect[indice];
		if (indice < num) {
			indice++;
		}
		return tmp;

	}
}
