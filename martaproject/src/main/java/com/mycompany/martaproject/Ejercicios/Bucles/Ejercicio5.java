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

/* Adivinar un número aleatorio entre 0 y 100 y mostrar el número de intentos.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        int numero_aleatorio = (int) Math.floor(Math.random()*(100+1)); // Número aleatorio entre 0 y 100.
        
        Scanner entrada = new Scanner(System.in);
        double numero;
        int contador;
        System.out.println("Adivine el número: ");
        numero = entrada.nextDouble();
        contador = 0;
        while (numero!=numero_aleatorio) {
            if(numero>numero_aleatorio) {
                System.out.println("El numero es menor.");
            }
            else {
                System.out.println("El número es mayor");
            }
            
            contador++;
            
            System.out.println("Introduzca un número: ");
            numero = entrada.nextDouble();
            
        }
        System.out.println("¡Ha encontrado el número!");
        System.out.println("Intentos: " + contador);
    }
}
