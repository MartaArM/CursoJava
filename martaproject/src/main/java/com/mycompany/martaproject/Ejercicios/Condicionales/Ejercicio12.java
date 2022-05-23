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
 Pedir una nota de 0 a 10 y mostrarla de la forma: insuficiente, suficiente, bien, notable y sobresaliente.
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        String mensaje;
        while (true) {
            System.out.println("Introducir nota");
            nota = entrada.nextInt();
            
            if (nota<5) {
                mensaje = "Insuficiente";
            }
            else if (nota==5) {
                mensaje = "Suficiente";
            }
            else if (nota==6) {
                mensaje = "Bien";
            }
            else if (nota>=7 && nota<=8){
                mensaje = "Notable";
            }
            else if (nota>=9 && nota <=10){
                mensaje = "Sobresaliente";
            }
            else {
                mensaje = "El formato de nota no es correcto.";
            }
            
            System.out.println(mensaje);
            
        }
    }
    
}
