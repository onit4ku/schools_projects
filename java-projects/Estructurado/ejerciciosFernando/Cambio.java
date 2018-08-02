package ejerciciosFernando;

public class Cambio {

	public static void main(String[] args) {	
		
		int billetes[]={200, 100, 50, 20, 10,5,2, 1};
		
		int saldo=32568;
		
		int parcial=0;
		int resto=saldo;
		
		int indice=0;
		while(indice < billetes.length){			
			
			parcial=resto / billetes[indice];
			resto=resto % billetes[indice];	
			
			System.out.println("billetes de "+billetes[indice]+": "+parcial);
			System.out.println("resto: "+resto +" euros");
			
			indice++;
		}
		
	}

}
