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

/* Con un array con 10 enteros, debemos mostrarlos en el siguiente orden: 
el primero, el último, el segundo, el penúltimo, el tercero...
*/
public class Ejercicio4 {
     public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        
        for (int i=0; i<(array.length)/2;i++) {
            System.out.println(array[i]);
            System.out.println(array[array.length - i - 1]);
        }
                
     }
}
