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
 Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares,
con el siguiente menú.
1. Ingresar dinero a la cuenta.
2. Retirar dinero de la cuenta.
3. Salir.
*/
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int saldo;
        String mensaje;
        boolean seguir = true;
        
        saldo = 1000;
        while (seguir) {
            System.out.println("Su saldo actual es de $" + saldo);
            System.out.println("Introduzca opción: \n 1. Ingresar dinero. \n 2. Retirar dinero. \n 3. Salir.");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1 : 
                    System.out.println("¿Cuánto dinero quiere ingresar?");
                    int ingreso = entrada.nextInt();
                    saldo +=ingreso;
                    break;
                case 2: 
                    System.out.println("¿Cuánto dinero quiere retirar?");
                    int retiro = entrada.nextInt();
                    saldo -=retiro;
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    seguir = false;
                    break;
            }
            
        }
    }
    
}
