package ejerciciosFernando;

//comprueba es palindromo con numeros
public class EsPalindromo {

	public static void main(String[] args) {

		int number=123;
		
		int temp = number;
        int remainder;
        int reverse = 0;
        
        while(temp > 0)
        {
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
        }
        
        if (reverse == number){
        	System.out.println("Si es Palindromo");        	
        }
        
        
		
	}

}
