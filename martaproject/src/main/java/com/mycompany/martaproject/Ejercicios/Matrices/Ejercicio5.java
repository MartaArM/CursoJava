/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Matrices;

/**
 *
 * @author marta
 */
// Sumar filas y columnas de una matriz
public class Ejercicio5 {
    public static void main(String[] args) {
        int matriz[][] = {{1,3,4}, {6,8,2}, {5,8,1}};
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int suma_fila, suma_columna;
        
        for (int i=0; i<filas;i++) {
            suma_fila = 0;
            suma_columna = 0;
            for (int j=0; j<columnas; j++) {
                suma_fila+=matriz[i][j];
                suma_columna+=matriz[j][i];
            }
            System.out.println("Suma de la fila "+i+": "+suma_fila);
            System.out.println("Suma de la columna "+i+": "+suma_columna);
        }
    }
}
