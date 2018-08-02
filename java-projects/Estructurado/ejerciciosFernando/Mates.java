package ejerciciosFernando;

public class Mates {

	public static void main(String[] args) {
	
		int num1;
		int num2;
		int num3;
		
		
		num1=6;
		num2=44;
		num3=2;
		
		if (num1 > num2){
			if (num1 > num3){
				System.out.println(num1);
			}else{
				System.out.println(num3);
			}
		}else{
			if (num2 > num3){
				System.out.println(num2);
			}else{
				System.out.println(num3);
			}			
		}
			
	}

}
