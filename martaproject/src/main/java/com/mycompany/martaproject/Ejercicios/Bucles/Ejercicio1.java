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

/* Leer un número y mostrar su cuadrado, repetir el proceso hasta que se 
introduzca un número negativo.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        System.out.println("Introduzca un número: ");
        numero = entrada.nextDouble();
        while (numero>=0) {
            double cuadrado = Math.pow(numero, 2);
            System.out.println("El cuadrado es: " + cuadrado);
            System.out.println("Introduzca un número: ");
            numero = entrada.nextDouble();
            
        }
        System.out.println("Ha introducido un número negativo. Saliendo...");
    }
}
