package ejerciciosJava;
/*
 *      PromedioEntero.java
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
 * Leer 10 números enteros, almacenarlos en un vector
 * y determinar si el promedio entero de estos datos está almacenado en el vector.
 */

public class PromedioEntero {
    public static void main(String[] args) throws IOException {
        int v[]= new int[10];
        int prom;
        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));

        System.out.println( "Ingrese los elementos del vecor...");

        prom=0;
        for( int i=0; i<10; i++ ) {
            System.out.print( "Elemento "+ i+ " del vector: ");
            v[i]= Integer.parseInt( dato.readLine() );
            prom+= v[i]/10;
        }

        int aux=0;
        for( int i=0; i<10; i++ )
            if( prom== v[i] ) aux++;

        System.out.print("El promedio entero es "+ prom+ " y se encuentra "+ aux+ " veces repetido en el vector\n" );
    }
}
