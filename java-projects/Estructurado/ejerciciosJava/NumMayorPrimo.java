package ejerciciosJava;
/*
 *      2-NumMayorPrimo.java
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

import java.io.*;

/**
 * leer 10 enteros, almacenarlos en un vector y determinar
 * en qué posición del vector está el mayor número primo leído.
 */

 public class NumMayorPrimo {
    public static void main(String[] args) throws IOException {
        int v[]= new int[10];
        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));

        System.out.println( "Ingrese los elementos del vecor...");

        for( int i=0; i<10; i++ ) {
            System.out.print( "Elemento "+ i+ " del vector: ");
            v[i]= Integer.parseInt( dato.readLine() );
        }

        //Variables auxiliares iniciadas con valores por defecto
        int j, aux, mayor= -1, posMayor=-1;
        for( int i=0; i<10; i++ ) {
            j=1; aux=0;
            while( j<= v[i] ) {
                if( v[i]% j== 0 ) aux++;
                j++;
            }
            if( aux== 2 ) { //es primo?
                if( mayor < v[i] ) { //es mayor?
                    mayor= v[i];
                    posMayor= i;
                }
            }
        }

        if( mayor != -1 )
            System.out.print( "El mayor elemento primo encontrado es: "+ mayor+ " en la posicion: "+ posMayor );
        else
            System.out.print( "No se han encontrado numeros primos.\n");
    }
}
