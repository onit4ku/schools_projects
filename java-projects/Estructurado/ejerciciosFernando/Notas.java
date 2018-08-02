package ejerciciosFernando;

public class Notas {

	public static void main(String[] args) {
		
		double nota;
		String sNota="";
		
		nota=8.8;		
		
		if (nota < 3.0){
			sNota="Muy deficiente";			
		}
		if (nota > 3.0 && nota <5.0){
			sNota="Insuficiente";			
		}
		if (nota >= 5.0 && nota <6.0){
			sNota="Suficente";			
		}
		if (nota >= 6.0 && nota <7.0){
			sNota="Bien";			
		}
		if (nota >= 7.0 && nota <9.0){
			sNota="Notable";			
		}
		if (nota >= 9.0 && nota <=10.0){
			sNota="Sobresaliente";			
		}
		
		System.out.println(sNota);
	}

}
