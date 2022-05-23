/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Arrays;

/**
 *
 * @author marta
 */

// Mezclar un array en otro.

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] impares = {1,3,5,7,9,11,13,15,17,19};
        int[] pares = {0,2,4,6,8,10,12,14,16,18};
        int[] mezcla = new int[20];
        
        int j = 0;
        for (int i=0; i<10; i++) {
            mezcla[j] = pares[i];
            mezcla[j+1] = impares[i];
            j+=2;
        }
        for(int k:mezcla) {
            System.out.println(k);
        }
                
     }

}
