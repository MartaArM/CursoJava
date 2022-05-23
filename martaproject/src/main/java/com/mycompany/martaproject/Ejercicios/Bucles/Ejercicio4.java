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

/* Pedir números hasta que se teclee uno negativo y mostrar cuántos números se han
introducido
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        int contador;
        System.out.println("Introduzca un número: ");
        numero = entrada.nextDouble();
        contador = 0;
        while (numero>=0) {
            System.out.println("Introduzca un número: ");
            numero = entrada.nextDouble();
            contador++;
        }
        System.out.println("Ha introducido "+contador+" números.");
    }
}
