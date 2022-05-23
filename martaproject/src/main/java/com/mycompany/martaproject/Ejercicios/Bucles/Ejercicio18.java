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

/* Ejercicio 17 pero solo hay 3 artículos con precios definidos.
*/
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Precios de los artículos.
        final double precio1 = 0.6;
        final double precio2 = 3;
        final double precio3 = 1.25;
        
        int codigo;
        double cantidad;
        double precio_total = 0;
        
        double facturacion = 0;
        double cantidad_total = 0;
        int facturas_mayores=0;
        
        
        for (int i=0;i<5;i++){
            System.out.println("Introduzca codigo.");
            codigo = entrada.nextInt();

            if (codigo>=1 && codigo<=3){ // Si el código es correcto.
                System.out.println("Introduzca cantidad.");
                cantidad = entrada.nextDouble();
                
                if (codigo==1) {
                    precio_total = cantidad*precio1;
                    cantidad_total+=cantidad;
                }
                else if (codigo==2) {
                    precio_total = cantidad*precio2;
                }
                else if (codigo==3) {
                    precio_total = cantidad*precio3;
                }
                facturacion+=precio_total;
                if (precio_total>600) {
                    facturas_mayores++;
                }
                
            }
            else {
                System.out.println("El código no es correcto.");
            }
            
        }
       
        System.out.println("Facturacion total: " + facturacion);
        if (cantidad_total>0) {
            System.out.println("Cantidad de litros del artículo 1: " + cantidad_total);
        }
        else {
            System.out.println("No se ha vendido el artículo 1.");
        }
        
        if (facturas_mayores>0) {
            System.out.println("Facturas de más de $600: " + facturas_mayores);
        }
        else {
            System.out.println("No hay facturas de más de $600.");
        }
        
        
    }
}
