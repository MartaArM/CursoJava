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

/* Dadas 6 notas escribir la cantidad de alumnos aprobados, condicionados (4<nota<5) y suspensos.
*/
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        int aprobados=0, condicionados=0, suspensos=0;
        
        for (int i=0;i<6;i++){
            System.out.println("Introduzca nota.");
            nota = entrada.nextDouble();
            
            if (nota<4) {
                suspensos++;
            }
            else if (nota>=4 && nota<5) {
                condicionados++;
            }
            else{
                aprobados++;
            }
            
        }
       
        System.out.println("Hay "+aprobados+" alumnos aprobados");
        System.out.println("Hay "+condicionados+" alumnos condicionados.");
        System.out.println("Hay "+suspensos+" alumnos suspensos.");
        
        
    }
}
