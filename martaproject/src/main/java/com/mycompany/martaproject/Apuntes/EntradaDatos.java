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
public class EntradaDatos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        String cadena;
        char caracter;
        
        /*System.out.println("Introducir número:");
        // Guardar el número del usuario
        numero = entrada.nextInt();
        
        System.out.println(numero);*/
        
        /*
        System.out.println("Introduzca cadena:");
        // Guardar un String
        cadena = entrada.nextLine();
        
        System.out.println(cadena); */
        
        System.out.println("Introduzca caracter:");
        // Guardar caracter
        caracter = entrada.next().charAt(0); // Guarda el primer caracter que lea.
        
        System.out.println(caracter);
    }
}
