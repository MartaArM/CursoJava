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

/* Pedir un número N, introducir N sueldos y mostrar el sueldo máximo
*/
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        double sueldo;
        double maximo = 0;
        
        System.out.println("Introduzca numero de sueldos.");
        numero = entrada.nextInt();
        
        
        for (int i=0;i<numero;i++){
            System.out.println("Introduzca sueldo: ");
            sueldo = entrada.nextInt();  
            
            if (sueldo>maximo){
                maximo = sueldo;
            }
        }
       
        System.out.println("El sueldo máximo es $"+maximo);
        
        
    }
}
