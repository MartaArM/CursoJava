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

/* Pedir un número entre 0 y 10 y mostrar la tabla de multiplicar.
*/
public class Ejercicio16 {
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        int numero, multiplicacion;
        boolean correcto = false;    
        
        while (!correcto) {
           System.out.println("Introduzca un número entre 0 y 10.");
           numero = entrada.nextInt();
           
           if (numero>=0 && numero<=10) {
               correcto = true;
               
               for (int i=0; i<=10; i++){
                   multiplicacion = numero*i;
                   System.out.println(numero + "x" + i + "=" + multiplicacion);
               }
               
           }
           else {
               System.out.println("Incorrecto.");
           }
        }
        
        
    }
}
