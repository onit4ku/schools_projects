package agenda;

public class Fecha {

	private int dia;
	private int mes;
	private int anyo;

	Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.anyo = 1970;
	}

	boolean CambiarFecha(int dia, int mes, int anyo) {
		boolean tmp = false;
		if (ComprobarMes(mes) && ComprobarDia(dia)) {
			this.dia = dia;
			this.mes = mes;
			this.anyo = anyo;
			tmp = true;
		} else {
			tmp = false;
		}
		return tmp;
	}

	boolean CambiarDia(int dia) {
		boolean tmp = false;
		if (ComprobarDia(dia)) {
			this.dia = dia;
			tmp = true;
		} else {
			tmp = false;
		}
		return tmp;
	}

	int DameDia() {
		return this.dia;
	}

	int DameMes() {
		return this.mes;
	}

	int DameAnyo() {
		return this.anyo;
	}

	// devolvera true si se ha cambiado el mes
	private boolean ComprobarMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			return true;
		} else {
			return false;
		}
	}

	// devolvera true si se ha cambiado el dia
	private boolean ComprobarDia(int dia) {
		if (dia >= 1 && dia <= DiasMes()) {
			return true;
		} else {
			return false;
		}
	}

	private int DiasMes() {
		int dias = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
		case 2:
			dias = 28;
			if ((anyo % 4 == 0 || (anyo % 100 == 0 || anyo % 400 == 0))) {
				dias = 29;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		}
		return dias;
	}

	public String toString() {
		return dia + "/" + mes + "/" + anyo;
	}
}
