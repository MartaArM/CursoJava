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

/* La calificación final de un estudiante se calcula en base a las calificaciones de cuatro aspectos
de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 
25% y 40%, hacer un programa que calcule e imprima la calificación final obtenida.
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        double participacion, primer_examen, segundo_examen, examen_final;
        double nota_final;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introducir notas");
        participacion = entrada.nextDouble();
        primer_examen = entrada.nextDouble();
        segundo_examen = entrada.nextDouble();
        examen_final = entrada.nextDouble();
        
        nota_final = participacion*0.1 + primer_examen*0.25 + segundo_examen*0.25 + examen_final*0.4;
        
        System.out.println("Nota final:"+nota_final);
        
    }
}
