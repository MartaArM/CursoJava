/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Arrays;

import java.util.Scanner;

/**
 *
 * @author marta
 */

// Promedio de números negativos, positivos y contar el número de ceros.
public class Ejercicio3 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int[] array = {7,8,2,-1,0};
         double suma_positivos=0, suma_negativos=0;
         double media_negativos, media_positivos;
         int numero_ceros=0;
         int numero_positivos = 0, numero_negativos=0;
         
         for(int num:array) {
            if (num>0) {
                suma_positivos+=num;
                numero_positivos++;
            }
            else if (num<0){
                suma_negativos+=num;
                numero_negativos++;
            }
            else 
                numero_ceros++;
         }
         
         media_positivos = suma_positivos/numero_positivos;
         media_negativos = suma_negativos/numero_negativos;
         
         System.out.println("Media positivos: "+media_positivos);
         System.out.println("Media negativos: "+media_negativos);
         System.out.println("Numero ceros: "+numero_ceros);
         
         
    }
}
