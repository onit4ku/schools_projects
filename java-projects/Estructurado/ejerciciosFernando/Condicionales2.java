package ejerciciosFernando;

public class Condicionales2 {

	public static void main(String[] args) {
		
		int sumaPares;
		int sumaImpares;		
		
		sumaPares=0;
		sumaImpares=0;
		int num=1;
	
		while( num <=100){
		
			switch(num%2){		
				case 0:
					System.out.println("Par "+num);	
					sumaPares= sumaPares+num;
					break;				
				default:
					System.out.println("Impar "+num);
					sumaImpares= sumaImpares+num;
					break;
			}			
			num++;
		}
		System.out.println("Suma Pares "+sumaPares);	
		System.out.println("Suma Impares "+sumaImpares);	
	}

}
