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

/* Pedir un número y calcular su factorial.
*/
public class Ejercicio12 {
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        int numero;
        long factorial = 1;
        
        System.out.println("Introduzca un número");
        numero = entrada.nextInt();
        
        for (int i=2; i<=numero; i++) {
            factorial*=i;
        }
        
        System.out.println("El factorial es "+factorial);
    }
}
