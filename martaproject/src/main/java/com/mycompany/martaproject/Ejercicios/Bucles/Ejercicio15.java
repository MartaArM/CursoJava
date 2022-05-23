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
public class Ejercicio15 {
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        double edad, altura;
        double suma_edad=0, suma_altura=0;
        double edad_media, altura_media;
        int mayores_18=0, mas_altos=0;
            
        for (int i=0; i<5; i++) {
            System.out.println("Introduzca la edad:");
            edad = entrada.nextDouble();
            System.out.println("Introduzca la estatura:");
            altura = entrada.nextDouble();
            
            suma_edad+=edad;
            suma_altura+=altura;
            
            if (edad>=18) {
                mayores_18++;
            }
            if (altura>1.75){
                mas_altos++;
            }
            
            
        }
        
        edad_media = suma_edad/5.0;
        altura_media = suma_altura/5.0;
        
        System.out.println("La media de edad es: " + edad_media);
        System.out.println("La altura media es: " + altura_media);
        System.out.println("Hay " + mayores_18 + " alumnos mayores de 18 años.");
        System.out.println("Hay "+mas_altos+" alumnos más altos de 1.75m.");
        
    }
}
