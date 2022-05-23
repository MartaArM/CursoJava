/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Apuntes;

import java.util.Scanner;

/**
 *
 * @author marta
 */
public class Condicionales {
    public static void main(String[] args) {
        int dato;
        // ----------------------SWITCH----------------------------
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero");
        
        dato = entrada.nextInt();
        
        // Solo se puede utilizar para comprobar datos con operador de igualdad.
        /*switch(dato) {
            case 5:  
                System.out.println("Igual a 5");
                break;
            default:
                System.out.println("Distinto de 5");
                break;
        }*/
        
        // ------------------- OPERADOR TERNARIO -------------------------
        String mensaje;
        
        mensaje = (dato%2==0) ? "Es par" : "Es impar"; // Si dato es par, mensaje=="Es par", si es impar, mensaje=="Es impar";
        
        System.out.println(mensaje);
        
        
    }
}
