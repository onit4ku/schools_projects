package ejerciciosFernando;

public class Matriz {

	public static void main(String[] args) {
		
		int numFilas=3;
		int numColumnas=3;
		
		int[][] vMatriz= new int[numFilas][numColumnas];
		
//		// rellenar matriz
//		int num=9;
//		for(int f=0; f < numFilas; f++){			
//			for(int c=0; c < numColumnas; c++ ){				
//				vMatriz[f][c]=num;
//				num--;
//			}			
//		}
		
//		int num=0;
//		for(int f=0; f < numFilas; f++){			
//			for(int c=0; c < numColumnas; c++ ){
//				if (num%2 ==0){
//					vMatriz[f][c]=0;
//				}else{
//					vMatriz[f][c]=num;
//				}
//				num++;
//			}
//		}
		
		
//		for(int f=0; f < numFilas; f++){			
//			for(int c=0; c < numColumnas; c++ ){
//				if (f == c){
//					vMatriz[f][c]=1;
//				}
//			}
//		}
		
		
//		for(int f=0; f < numFilas; f++){			
//			for(int c=0; c < numColumnas; c++ ){
//				if ((f+c)==2){
//					vMatriz[f][c]=1;
//				}
//			}
//		}
		
//		for(int f=0; f < numFilas; f++){			
//			for(int c=0; c < numColumnas; c++ ){
//				if ( c==1){
//					vMatriz[f][c]=1;
//				}
//			}
//		}
		
//		for(int f=0; f < numFilas; f++){			
//			for(int c=0; c < numColumnas; c++ ){
//				if ( f==1){
//					vMatriz[f][c]=1;
//				}
//			}
//		}
		
		for(int f=0; f < numFilas; f++){			
			for(int c=0; c < numColumnas; c++ ){
				if ((f+c)==2 || f == c){
					vMatriz[f][c]=1;
				}
			}
		}
		
		//imprimir
		for(int f=0; f < numFilas; f++){			
			for(int c=0; c < numColumnas; c++ ){				
				System.out.print( vMatriz[f][c] );
			}
			System.out.println();
		}

	}

}
