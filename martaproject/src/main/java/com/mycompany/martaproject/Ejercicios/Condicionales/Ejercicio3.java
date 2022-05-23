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

// Comprobar si una letra es mayúscula o minúscula.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;
        while (true) {
            

            System.out.println("Introducir letra");
            letra = entrada.next().charAt(0);

            System.out.println(Character.isUpperCase(letra) ? "Es mayuscula" : "Es minuscula");
        }
    }
    
}
