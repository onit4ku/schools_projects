package personaClase;

import java.util.Vector;

public class Vector_fecha {

	private Vector vect;

	Vector_fecha() {
		vect = new Vector();
	}

	void inserta(Fecha f) {
		vect.addElement(f);
	}

	int tamanyo() {
		return vect.size();
	}

	Fecha DarFecha(int indice) {
		Fecha tmp;
		tmp = (Fecha)vect.elementAt(indice);
		return tmp;
	}

}
