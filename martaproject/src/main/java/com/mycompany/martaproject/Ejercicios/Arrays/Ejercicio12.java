/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Arrays;

/**
 *
 * @author marta
 */

// Eliminar un elemento de una posición dada.
public class Ejercicio12 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int pos = 3;
        
        for (int i=pos-1; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        
        array[array.length-1] = 0;
        
        
        for (int j:array) {
            System.out.println(j);
        }
                
     }
}
