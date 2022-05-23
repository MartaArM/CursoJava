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

/*  Calcular el cuadrado de una suma */
public class Ejercicio6 {
    public static void main(String[] args) {
        double a, b;
        double cuadrado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca dos numeros");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        
        double suma = a+b;
        cuadrado = Math.pow(suma, 2);
        
        System.out.println("El cuadrado es "+cuadrado);
        
    }
}
