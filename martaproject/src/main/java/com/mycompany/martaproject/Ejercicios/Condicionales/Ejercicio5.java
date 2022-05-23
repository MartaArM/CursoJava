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
 Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
 · Si trabaja 40 horas o menos, se le paga $16 por hora.
 · Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20
por cada hora extra.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas;
        int sueldo;
        while (true) {
            System.out.println("Introducir horas");
            horas = entrada.nextInt();

            if(horas<=40) {
                sueldo = horas*16;
            }
            else {
                sueldo = 40*16+(horas-40)*20;
            }
            
            System.out.println("El sueldo es $"+sueldo);
        }
    }
    
}
