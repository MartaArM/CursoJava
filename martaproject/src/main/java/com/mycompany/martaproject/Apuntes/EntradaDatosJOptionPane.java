/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Apuntes;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author marta
 */

// Entrada de datos de forma gráfica.
public class EntradaDatosJOptionPane {
    public static void main(String[] args) {
        String cadena;
        int numero;
        
        cadena = JOptionPane.showInputDialog("Introduzca cadena."); // Abre un diálogo para introducir un String
        System.out.println(cadena);
        
        JOptionPane.showMessageDialog(null, "La cadena es "+cadena); // Para mostrar los datos en un cuadro de texto.
        
        /*numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero")); // Meter un entero.
        System.out.println(numero);*/
    }
}
