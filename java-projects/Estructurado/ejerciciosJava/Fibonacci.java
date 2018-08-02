package ejerciciosJava;
/*
 *      Fibonacci.java
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
 * Cargar un vector de 10 posiciones con los 10 primeros
 * elementos de la serie de Fibonacci y mostrarlo en pantalla.
 */

public class Fibonacci {
    public static void main(String[] args) {
        int v[]= new int[10];
        int a, b;

        a= v[0]= 1;
        b= v[1]= 1;

        System.out.print( "Elementos fibonacci (de 1 a 10): 1, 1,");
        for( int i=2; i<10; i++ ) {
            v[i]= a+ b;
            a=b; b=v[i];
            System.out.print( " "+ v[i]+ ",");
        }
    }

}
