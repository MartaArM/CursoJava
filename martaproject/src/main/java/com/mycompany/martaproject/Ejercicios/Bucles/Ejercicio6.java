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

/* Pedir números hasta que se teclee un 0 y mostrar la suma.
*/
public class Ejercicio6 {
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;
        System.out.println("Introduzca un número (0 para terminar): ");
        numero = entrada.nextInt();
        while (numero!=0) {
            suma+=numero;
            System.out.println("Introduzca un número: ");
            numero = entrada.nextInt();
            
        }
        System.out.println("La suma es " + suma);
    }
}
