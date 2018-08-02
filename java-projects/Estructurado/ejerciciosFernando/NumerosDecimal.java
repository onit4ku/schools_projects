package ejerciciosFernando;

public class NumerosDecimal {

	public static void main(String[] args) {
		String vTipos[]={	
						"Unidades" , 
						"Decenas", 
						"Centenas", 
						"Unidades millar",
						"Decenas millar", 
						"Centenas millar",
						"Millones"
		};		
		int base=10;
		int num=654654;		
		int resto=num;		
		int i=0;
		while(num > 0)	{
			resto=num%base;
			num=num/base;
			System.out.println(resto +" "+ vTipos[i]);
			//System.out.println(num);
			System.out.println("---------------");
			i++;		
		}	

	}

}
