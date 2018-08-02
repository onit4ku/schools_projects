package ejerciciosFernando;

public class Funciones {

	public static void main(String[] args) {		
		
		char operacion='-';
		
		int num1=5;
		int num2=4;
		
		int resultado=0;		
		
		switch(operacion){		
			case '+':
				resultado=suma(num1,num2);
			break;
			case '-':
				resultado=resta(num1,num2);
			break;
			case '*':
				resultado=multipicacion(num1,num2);
			break;
			case '/':
				resultado=division(num1,num2);
			break;		
		}			
		System.out.println(resultado);	
	}

	// esto es la funcion suma
	public static int suma(int x,int y){		
		int resultado;		
		resultado=x+y;		
		return resultado;
	}		
	
	public static int resta(int x,int y){		
		return x-y;
	}	
	
	public static int multipicacion(int x,int y){		
		return x*y;
	}
	
	public static int division(int x,int y){		
		return x/y;	
	}
}
