/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Arrays;

/**
 *
 * @author marta
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int[] array = {2,2,2,2,2,2,2,2,2,3};
        boolean creciente=true;
        boolean decreciente = true;
        
        for(int i=0; i<9; i++) {
            if (array[i]<array[i+1]) {
                decreciente = false;
            }
            else if (array[i]>array[i+1]){
                creciente = false;
            }
        }
       
        if (creciente && decreciente) {
            System.out.println("Todos los números son iguales.");
        }
        else if (creciente) {
            System.out.println("Esta ordenado de forma creciente");
        }     
        else if (decreciente) {
            System.out.println("Está ordenado de forma decreciente.");
        }
        else {
            System.out.println("Está desordenado.");
        }
                
     }
}
