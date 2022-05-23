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

// Leer 5 números y mostrarlos al revés.
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<5; i++) {
            System.out.println("Número: ");
            array[i] = entrada.nextInt();
        }
        
        System.out.println("\n");
        
        for (int i=4; i>=0; i--) {
            System.out.println(array[i]);
        }
    }
}
