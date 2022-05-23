/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Arrays;

import static com.mycompany.martaproject.Ejercicios.Arrays.Ejercicio14.moverpos;

/**
 *
 * @author marta
 */

// Encontrar un numero y su posicion
public class Ejercicio15 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,9};
        int tam=array.length;
        int num = 10;
        boolean encontrado = false;
        boolean mayor = false;
        int pos = 0;
        
        for (int i=0; i<tam && !encontrado && !mayor; i++) {
            if (array[i] == num ){
                encontrado = true;
                pos = i;
            }
            else if (array[i]>num) {
                mayor = true;
            }
        }
       
        if (encontrado) {
            System.out.println("El numero "+num+" está en la posicion "+(pos+1));
        }
        else {
            System.out.println("El número no está.");
        }
                
    } 
}
