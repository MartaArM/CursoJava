/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Bucles;

import java.util.Scanner;

/**
 *
 * @author marta
 */

/* Diseñar un programa que muestre el producto de los 10 primeros números impares.
*/
public class Ejercicio11 {
    public static void main(String[] args) {
               
        
        int contador = 0;
        int producto = 1;
        //int i = 0;
        
        for (int i=1; contador<10; i+=2) {
            producto*=i;
            contador++;
        }
        
        System.out.println("El producto es: " + producto);
    }
}
