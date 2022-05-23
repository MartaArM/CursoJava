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

/* Pedir 10 numeros y mostrar al final si se ha introducido algún número negativo.
*/
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean negativo = false;  
        
        System.out.println("Introduzca 10 numeros: ");
        for (int i=0;i<10;i++){
            
            numero = entrada.nextInt();  
            
            if (numero<0) {
                negativo = true;
            }
        }
       
        if (negativo) {
            System.out.println("Se ha introducido algún número negativo.");
        }
        else {
            System.out.println("No se ha introducido ningún número negativo.");
        }
        
        
    }
}
