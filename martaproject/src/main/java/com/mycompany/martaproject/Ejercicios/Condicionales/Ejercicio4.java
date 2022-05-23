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

/* En un supermercado se hace un 20% de descuento a los clientes cuya compra supere los
$300. ¿Cuál será la cantidad que pagará una persona por su compra?
*/

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double compra, pago;
        while (true) {
            

            System.out.println("Introducir compra");
            compra = entrada.nextDouble();

            pago = (compra>300) ? compra*0.8 : compra;
            
            System.out.println("El usuario pagará " + pago + " $");
        }
    }
    
}
