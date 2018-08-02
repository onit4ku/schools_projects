package ejerciciosFernando;

public class Sumas {

	public static void main(String[] args) {
		int num=1;
		int total=0;		
		
		
		while( num <=100){			
			total=num+total;
			num++;
		}

		System.out.println(total);
	}

}
