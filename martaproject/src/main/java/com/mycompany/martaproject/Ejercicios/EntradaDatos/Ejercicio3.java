/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene
la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule 
e imprima la cantidad de dinero que tienen entre los tres.
*/
package com.mycompany.martaproject.Ejercicios.EntradaDatos;

import javax.swing.JOptionPane;

/**
 *
 * @author marta
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        double dinero_guillermo, dinero_luis, dinero_juan, total;
        
        dinero_guillermo = Double.parseDouble( JOptionPane.showInputDialog("Introduzca dinero de Guillermo.")); // Abre un diálogo para introducir un String
        dinero_luis = dinero_guillermo/2;
        dinero_juan = (dinero_luis+dinero_guillermo)/2;
        
        total = dinero_guillermo+dinero_luis+dinero_juan;
        
        
        JOptionPane.showMessageDialog(null, "Entre los tres tienen "+total+" dólares.");
    }
}
