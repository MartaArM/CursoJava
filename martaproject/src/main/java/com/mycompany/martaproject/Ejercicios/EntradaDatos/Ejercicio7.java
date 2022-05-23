/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.EntradaDatos;

import java.util.Scanner;

/**
 *
 * @author marta
 */


/* Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
*/
public class Ejercicio7 {
    
    public static void main(String[] args) {
        final int horas_por_semana = 24*7;
        Scanner entrada = new Scanner(System.in);
        int numero_horas;
        int numero_semanas, numero_dias;
        
        System.out.println("Introduzca numero de horas");
        numero_horas = entrada.nextInt();
        
        numero_semanas = (int) (numero_horas / horas_por_semana);
        numero_dias = (int) ((numero_horas % horas_por_semana) / 24);
        numero_horas = (int) ((numero_horas % horas_por_semana) % 24);
        
        if (numero_semanas>0){
            System.out.println("Numero de semanas " + numero_semanas);
            System.out.println("Numero de días " + numero_dias);
            System.out.println("Numero de horas " + numero_horas);
        }
        else {
            if (numero_dias>0) {
                System.out.println("Numero de días " + numero_dias);
                System.out.println("Numero de horas " + numero_horas);
            }
            else {
                System.out.println("Numero de horas " + numero_horas);
            }    
        }
        
    }
}
