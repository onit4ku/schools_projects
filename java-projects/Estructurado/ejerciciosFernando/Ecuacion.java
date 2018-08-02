package ejerciciosFernando;

public class Ecuacion {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		a=0;
		b=2;
		c=1;		
		double x;		
		double discriminante;
		
		if (a == 0){
			x=-c/b;
			System.out.println("No es ecuacion segundo grado");
			System.out.println("x = "+x);
		}else{
			discriminante=b*b-4*a*c;	
			
			if (discriminante >= 0){
				if (discriminante != 0) {
					System.out.println("x1 = "+(-b+Math.sqrt(discriminante)) / (2*a) );
					System.out.println("x2 = "+(-b-Math.sqrt(discriminante)) / (2*a) );
				}else{
					System.out.println("x = "+(-b+Math.sqrt(discriminante)) / (2*a) );
				}
			}else{
				System.out.println("No existe solucion real");
			}			
		}
		
		
	}

}
