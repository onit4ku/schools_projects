package ejerciciosFernando;

public class EsPalindromoCadena {

	public static void main(String[] args) {

		String cadena="abba";
				
		int mitad=cadena.length() / 2;
		int indiceUltima=cadena.length()-1;
		
		int num=0;
		
// version fernando
//		for(int i=0; i < mitad;i++)	{		
//			if (cadena.charAt(i)  != cadena.charAt(indiceUltima) ){
//				num++;
//			}
//			indiceUltima--;
//		}
//		
//		if (num==0){
//			System.out.println("Es Palindromo");
//		}else{
//			System.out.println("no Palindromo");
//		}
		
		//otra version
		boolean noEspalindro=false;
		int i=0;
		
		while (i < mitad && noEspalindro!=true){
			if (cadena.charAt(i)  == cadena.charAt(indiceUltima) ){
				i++;
				indiceUltima--;
			}else{
				noEspalindro=true;
			}			
		}
		System.out.println(noEspalindro);		
			
	}

}
