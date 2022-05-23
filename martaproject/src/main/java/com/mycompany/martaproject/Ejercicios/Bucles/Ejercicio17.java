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

/* Una empresa que se dedica a la venta de desinfectantes necesita un programa
para gestionar las facturas. En cada factura figura: el código del artículo,
la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas introducidas:
facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas 
se emitieron de más de $600.
*/
public class Ejercicio17 {
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        int codigo; // codigo de articulo
        double cantidad, precio;  // Cantidad en litros y precio por litro.
        double facturacion = 0; // Total de facturacion
        double cantidad_total = 0; // Cantidad total del artículo 1
        int facturas_mayores=0; // Número de facturas mayores de $600
        
        
        for (int i=0;i<5;i++){
           System.out.println("Introduzca codigo, cantidad y precio.");
           codigo = entrada.nextInt();
           cantidad = entrada.nextDouble();
           precio = entrada.nextDouble();
           
           double precio_total = cantidad*precio;
           
           facturacion+=precio_total;
           if (codigo==1) {
               cantidad_total+=cantidad;
           }
           
           if (precio_total>600) {
               facturas_mayores++;
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
