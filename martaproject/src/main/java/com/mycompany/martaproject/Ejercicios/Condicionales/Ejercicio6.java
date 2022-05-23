/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Condicionales;

import java.util.Scanner;

/**
 *
 * @author marta
 */

/* 
 Hacer un programa que tome dos números y diga si ambos son pares o impares.
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        while (true) {
            System.out.println("Introducir números");
            num1 = entrada.nextInt();
            num2 = entrada.nextInt();

            if (num1%2==0 && num2%2==0) {
                System.out.println("Los números son pares");
            }
            else if (num1%2!=0 && num2%2!=0) {
                System.out.println("Los números son impares");
            }
            else {
                System.out.println("Uno es par y otro impar.");
            }
        }
    }
    
}
