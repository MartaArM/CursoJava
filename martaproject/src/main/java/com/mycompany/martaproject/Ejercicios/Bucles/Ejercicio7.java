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

/* Pedir números hasta que se teclee un número negativo y calcular la media.
*/
public class Ejercicio7 {
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        int numero;
        double suma = 0;
        double contador = 0;
        double media;
        
        
        System.out.println("Introduzca un número (0 para terminar): ");
        numero = entrada.nextInt();
        while (numero>0) {
            suma+=numero;
            contador++;
            System.out.println("Introduzca un número: ");
            numero = entrada.nextInt();
        }
        
        media = suma/contador;
        System.out.println("La media es " + media);
    }
}
