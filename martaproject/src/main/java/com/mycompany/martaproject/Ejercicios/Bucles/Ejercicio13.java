/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Bucles;

import java.util.Scanner;

/**
 *
 * @author marta
 */

/* Pedir 10 números. Mostrar la media de los números positivos, la media de los
números negativos y la cantidad de ceros.
*/
public class Ejercicio13 {
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        int numero;
        double suma_positivos =0, suma_negativos=0;
        double media_positivos, media_negativos;
        int cantidad_ceros=0, cantidad_positivos=0, cantidad_negativos=0;
            
        for (int i=0; i<10; i++) {
            System.out.println("Introduzca un número");
            numero = entrada.nextInt();
            
            if (numero>0) {
                suma_positivos+=numero;
                cantidad_positivos++;
            }
            else if (numero<0) {
                suma_negativos+=numero;
                cantidad_negativos++;
            }
            else{
                cantidad_ceros++;
            }
        }
        
        media_positivos = suma_positivos/cantidad_positivos;
        media_negativos = suma_negativos/cantidad_negativos;
        
        System.out.println("Le media de los positivos es " + media_positivos);
        System.out.println("Le media de los negativos es " + media_negativos);
        System.out.println("La cantidad de ceros es " + cantidad_ceros);
        
    }
}
