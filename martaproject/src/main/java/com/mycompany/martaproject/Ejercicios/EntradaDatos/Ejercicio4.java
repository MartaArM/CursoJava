/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.EntradaDatos;

import javax.swing.JOptionPane;

/**
 *
 * @author marta
 */

/* Una compañía de venta de coches usados paga a su personal de ventas un salario de 1000$
mensuales, más una comisión de 150$ por cada coche vendido, más el 5% del valor de la venta por coche.
Cada mes el capturista de la empresa ingresa en el ordenador los datos pertinentes. Hacer un programa que calcule e 
imprima el salario mensual de un vendedor.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        final int sueldo = 1000;
        int numero_coches;
        double precio_coche, sueldo_final;
        
        numero_coches = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos coches ha vendido?"));
        precio_coche = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto cuestan los coches?"));
        
        sueldo_final = sueldo + (150*numero_coches) + (numero_coches*precio_coche)*0.05;
        
        JOptionPane.showMessageDialog(null, "El vendedor ha ganado "+sueldo_final+" dolares.");
    }
}
