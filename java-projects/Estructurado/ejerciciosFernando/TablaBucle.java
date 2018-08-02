package ejerciciosFernando;

public class TablaBucle {

	public static void main(String[] args) {
		
		int multiplicador;
		int num;
		int resultado;		

		multiplicador=1;
		num=1;
				
		while( multiplicador < 10){	
			while( num <= 10 ){
				
				resultado=num*multiplicador;
				System.out.println(num+"x"+multiplicador+"="+resultado);
				
				num=num+1;
			}
			num=1;
			multiplicador=multiplicador+1;
			System.out.println("---------------------------------------");
		}
		

	}

}
