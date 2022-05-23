/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Arrays;

/**
 *
 * @author marta
 */

/* Teniendo un array ordenado, coger un número e insertarlo en el lugar adecuado 
para que el array continue ordenado.
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7,0,0,0};
        boolean encontrado = false;
        int num = 5;
        int i = 0;
        
        while (!encontrado && i<array.length) {
            if (array[i] < num && array[i+1]>num) {
                encontrado = true;
                int pos = i+1;
        
                for (int j=array.length-1; j>pos;j--) {
                    array[j]=array[j-1];
                }
                array[pos] = num;
            }
            i++;
        }
        
        
        for (int j:array) {
            System.out.println(j);
        }
                
     }
}
