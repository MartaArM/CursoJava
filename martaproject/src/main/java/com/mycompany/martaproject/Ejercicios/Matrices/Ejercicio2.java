/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Matrices;

/**
 *
 * @author marta
 */

// Sumar dos matrices.
public class Ejercicio2 {
    public static void main(String[] args) {
        int matriz[][] = {{1,3,4}, {6,8,2}, {5,8,1}};
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        int matriz2[][] = {{7,9,1}, {1,2,5}, {7,8,4}};
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;
        
        if (filas!=filas2 || columnas!=columnas2){
            System.out.println("Las matrices no se pueden sumar.");
        }
        else {
            int matriz_suma[][] = new int[filas][columnas];
        
            for (int i=0;i<filas;i++){
                for (int j=0; j<columnas; j++) {
                    matriz_suma[i][j] = matriz[i][j]+matriz2[i][j];
                }
            }
            
            for (int[] arr:matriz_suma) {
                for (int el:arr){
                    System.out.print(el + " ");
                }
                System.out.println("");
            }
        }
                
    }
}
