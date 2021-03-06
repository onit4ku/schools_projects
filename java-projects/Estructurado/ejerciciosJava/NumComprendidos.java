package ejerciciosJava;
/*
 *      NumComprendidos.java
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
 * Leer 10 números enteros, almacenarlos en un vector y mostrar
 * en pantalla todos los enteros comprendidos entre 1
 * y cada uno de los números almacenados en el vector.
 */

public class NumComprendidos {
    public static void main(String[] args) throws IOException {
        int v[]= new int[10];

        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));

        System.out.println( "Ingrese los elementos del vecor...");

        for( int i=0; i<10; i++ ) {
            System.out.print( "Elemento "+ i+ " del vector: ");
            v[i]= Integer.parseInt( dato.readLine() );
        }


        for( int i=0; i<10; i++ ) {
            System.out.print("\n·Los enteros comprendidos entre 1 y "+ v[i]+ " son: ");
            for( int s=2; s<v[i]; s++ )
                System.out.print(""+ s+ ", ");          
        }
    }
}
