package ejerciciosFernando;

public class Buscar {

	public static void main(String[] args) {
		
		int[] vRandom=new int[100];
		
		for(int i=0; i < vRandom.length; i++){
			vRandom[i]=(int)(Math.random()*100);
		}		
		
		int[] vPosiciones5=new int[100];			
		
		int cuentaCincos=0;
		int cuenta10=0;
		for(int i=0; i < vRandom.length; i++){
			if (vRandom[i]==5){
				vPosiciones5[cuentaCincos]=i;
				cuentaCincos++;
								
			}	
			if (vRandom[i]<10){
				cuenta10++;
			}
			
		}		
		
		for(int i=0; i < vPosiciones5.length; i++){
			System.out.println(vPosiciones5[i]);
		}	
		
		System.out.println("numeros de 5: "+cuentaCincos);
		System.out.println("menores 10: "+cuenta10);
		
		

	}

}
