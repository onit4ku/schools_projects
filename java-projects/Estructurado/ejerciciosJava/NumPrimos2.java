package ejerciciosJava;
/*
 *      NumPrimos2.java
 *      
 *      Copyright 2009 Jonathan Alvarez <jonas.al.co@gmail.com>
 *      Archivo disbruido con fines de aprendizaje.
 * 		puedes modificar y resdistrubuir el archivo, solo manten intacta
 * 		la notificacion de licencia.
 *      
 *      This program is free software; you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation; either version 2 of the License, or
 *      (at your option) any later version.
 *      
 *      This program is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *      
 *      You should have received a copy of the GNU General Public License
 *      along with this program; if not, write to the Free Software
 *      Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 *      MA 02110-1301, USA.
 */

/*
 * Almacenar en un vector de 10 posiciones los 10 números 
 * primos comprendidos entre 100 y 300. Luego mostrarlos en pantalla.
 */

public class NumPrimos2 {
    public static void main(String[] args) {
        int v[]= new int[10];
        int aux, ultimo;

        //Ciclo principal para el vector
        for( int i=0; i<10; i++ ) {
            if( i== 0) ultimo= 99;
            else ultimo= v[i-1];

            //Comprobacion de numeros primos solo para impares; empezando
            //desde el ultimo numero par encontrado. eficiencia!!
            for( int j= ultimo+ 2; j<300; j+= 2) {
                aux=0;
                for( int k=2; k< j; k++ ) {
                    if( j% k == 0 ) aux++;
                }
                if( aux == 0 ) { v[i]= j; break; }
            }
        }
        System.out.print( "10 primeros numeros primos de 100 a 300: " );
        for( int i=0; i<10; i++ )
            System.out.print( ""+ v[i]+ ", ");
    }
}
