/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Arrays;

/**
 *
 * @author marta
 */

// Mover los elementos de un array N veces a la derecha.
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7,8,9,0};
        
        int val;
        
        int pos = 4;
        
        for (int j=0; j<pos; j++) {
            int num = array[array.length-1];
            for (int i=array.length-1; i>0;i--) {
                array[i]=array[i-1];
            }
            array[0] = num;
        }
        
        
        for (int j:array) {
            System.out.println(j);
        }
                
     }
}
