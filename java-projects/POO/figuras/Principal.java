package figuras;

public class Principal {

	public static void main(String[] args) {
		Figura v[] = new Figura[10];
		Figura aux;
		// creo una linea
		aux = new Linea(1, 1, 5, 5);
		System.out.println(aux.toString());

		// creo una figura base
		aux = new Figura();
		System.out.println(aux.toString());

		// creo una linea, con el otro constructor, sin variable Punto
		aux = new Linea(new Punto(10, 10), new Punto(50, 50));
		System.out.println(aux.toString());

		// creo una linea, con el otro constructor, con variable Punto
		Punto p1 = new Punto(2, 3);
		Punto p2 = new Punto(15, 15);
		Linea L1 = new Linea(p1, p2);
		System.out.println(L1.toString());

		// ahora creo un triangulo, solo tiene un posible constructor
		p1 = new Punto(20, 3); // reutilizo las variables p1,p2, anteriores
		p2 = new Punto(15, 15);
		Punto p3 = new Punto(5, 5);
		aux = new Triangulo(p1, p2, p3);
		System.out.println(aux.toString());

		// todas las figuras que han sido creadas en la variable aux, ahora
		// solo tengo un triangulo, la ultima asignacion.

		// ahora creo varios objetos (de diferentes maneras) y los pongo en el
		// vector
		Linea l = new Linea(1, 4, 5, 7);
		aux = new Linea(5, 6, 7, 9);
		v[0] = aux;

		p1 = new Punto(20, 3); // reutilizo las variables p1,p2, p3
		p2 = new Punto(15, 15);
		p3 = new Punto(5, 5);
		Triangulo t = new Triangulo(p1, p2, p3);

		v[1] = t;
		v[2] = l;

		System.out.println("**********************************");
		for (int i = 0; v[i] != null; i++) {
			System.out.println(v[i].toString());
			System.out.println(v[i].Color());
		}
	}
}