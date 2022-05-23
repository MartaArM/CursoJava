/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Arrays;

/**
 *
 * @author marta
 */

// Meter un número en una posición dada y mover el resto hacia la derecha.
public class Ejercicio8 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7,8,9,0};
        int pos = 4;
        int num = 5;
        int val;
        
        for (int i=array.length-1; i>pos;i--) {
            array[i]=array[i-1];
        }
        array[pos] = num;
        
        for (int j:array) {
            System.out.println(j);
        }
                
     }
}
