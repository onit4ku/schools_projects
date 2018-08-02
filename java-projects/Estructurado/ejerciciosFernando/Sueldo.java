package ejerciciosFernando;

public class Sueldo {

	public static void main(String[] args) {
		int sueldo;			//euros
		int antiguedad; 	//años
		int distancia; 		//km
		
		antiguedad=3;
		distancia=25;
		
		sueldo=0;
		
		if (antiguedad < 5){
			sueldo=60;
		}else{
			if (antiguedad >=5 && antiguedad <=10){
				sueldo=60;
				int diferencia=antiguedad-5;
				sueldo=sueldo+diferencia*10;				
			}else {
				sueldo=120;
			}
		}		
		if (distancia > 20){
			sueldo=sueldo+distancia;
		}				
		System.out.println(sueldo);

	}

}
