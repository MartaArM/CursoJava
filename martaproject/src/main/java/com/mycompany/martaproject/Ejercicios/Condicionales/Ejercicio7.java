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
 Pedir tres números y mostrarlos ordenador de mayor a menor.
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;
        int max, min, med;
        while (true) {
            System.out.println("Introducir números");
            num1 = entrada.nextInt();
            num2 = entrada.nextInt();
            num3 = entrada.nextInt();
            
            med = 0;

            if (num1>num2) {
                max = num1;
                min = num2;
            }
            else {
                max = num2;
                min = num1;
            }
            
            if (num3>max) {
                if (max == num2){
                    med = num2;
                }
                else {
                    med = num1;
                }
                max = num3;
            }
            if (num3<min){
                if (min == num2){
                    med = num2;
                }
                else {
                    min = num1;
                }
                min = num3;
            }
            
            System.out.println("Maximo: " + max + "\nMedio: " + med + "\nMínimo: " + min);
            
            
            
        }
    }
    
}
