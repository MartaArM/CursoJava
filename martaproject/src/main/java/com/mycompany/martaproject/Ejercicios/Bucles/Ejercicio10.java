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

/* Pedir 10 números y escribir la suma total
*/
public class Ejercicio10 {
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        int numero;
        double suma = 0;
        
        for (int i=0; i<10;i++) {
            System.out.println("Introduzca un número:");
            numero = entrada.nextInt();
            suma+=numero;
        }
        
        System.out.println("La suma es: " + suma);
    }
}
