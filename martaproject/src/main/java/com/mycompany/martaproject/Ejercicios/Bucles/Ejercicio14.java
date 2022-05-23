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

/* Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000
*/
public class Ejercicio14 {
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        int sueldo = 0;
        int mayores_1000 = 0;
            
        for (int i=0; i<10; i++) {
            System.out.println("Introduzca un sueldo");
            sueldo = entrada.nextInt();
            
            suma+=sueldo;
            if (sueldo>1000) {
                mayores_1000++;
            }
        }
        
        System.out.println("La suma de los sueldos es " + suma);
        System.out.println("Hay "+mayores_1000+" sueldos mayores de $1000.");
        
    }
}
