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
 Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, año;
        int max, min, med;
        while (true) {
            System.out.println("Introducir números");
            dia = entrada.nextInt();
            mes = entrada.nextInt();
            año = entrada.nextInt();
            
            
            if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                if (dia>0 && dia<=31){
                    System.out.println("El día es correcto.");
                }
                else {
                    System.out.println("El día es incorrecto.");
                }
                System.out.println("El mes es correcto.");
            }
            else if (mes==4 || mes==6 || mes==9 || mes==11) {
                if (dia>0 && dia<=30) {
                    System.out.println("El día es correcto.");
                }
                else {
                    System.out.println("El día es incorrecto.");
                }
                System.out.println("El mes es correcto.");
            }
            else if (mes==2){
                if (dia>0 && dia<=28) {
                    System.out.println("El día es correcto");
                }
                else {
                    System.out.println("El día es incorrecto.");
                }
                System.out.println("El mes es correcto.");
            }
            else {
                System.out.println("No es posible comprobar si el día es correcto.");
                System.out.println("El mes es incorrecto.");
            }
            
            if (año>0){
                System.out.println("El año es correcto.");
            }
            else {
                System.out.println("El año es incorrecto.");
            }
            
            
        }
    }
    
}
