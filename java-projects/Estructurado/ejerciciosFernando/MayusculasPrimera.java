package ejerciciosFernando;

public class MayusculasPrimera {

	public static void main(String[] args) {
		String cadena=" hola como estas";
		
		String nuevaCadena="";
		char letra;
		
		
		int i=0;
		
		//esto es para el la primera letra de la cadena
		letra=cadena.charAt(i);
		if (letra!=' '){	
			letra=(char)(cadena.charAt(i)-32);
			nuevaCadena=nuevaCadena+letra;
			i++;
		}
		
		//el resto de la cadena
		while(i < cadena.length()){
			letra=cadena.charAt(i);
			if (letra==' '){
				i++;
				letra=(char)(cadena.charAt(i)-32);
				nuevaCadena=nuevaCadena+" "+letra;
			}else{
				nuevaCadena=nuevaCadena+letra;
			}	
			i++;
		}		
		System.out.println(nuevaCadena);
	}

}
