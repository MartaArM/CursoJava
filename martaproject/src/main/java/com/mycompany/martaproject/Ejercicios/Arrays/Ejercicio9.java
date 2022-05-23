/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Arrays;

/**
 *
 * @author marta
 */

// Mover todos los números una posición a la derecha.
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7,8,9,0};
        int num = array[array.length-1];
        int val;
        
        for (int i=array.length-1; i>0;i--) {
            array[i]=array[i-1];
        }
        array[0] = num;
        
        for (int j:array) {
            System.out.println(j);
        }
                
     }
}
