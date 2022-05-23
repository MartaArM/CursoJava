/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Matrices;

/**
 *
 * @author marta
 */

// Transponer una matriz.
public class Ejercicio3 {
    public static void main(String[] args) {
        int matriz[][] = {{1,2},{3,4},{5,6}};
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        int matriz_tras[][] = new int[columnas][filas];
        
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas;j++) {
                matriz_tras[j][i] = matriz[i][j];
            }
        }
        
        for (int[] arr:matriz_tras) {
                for (int el:arr){
                    System.out.print(el + " ");
                }
                System.out.println("");
            }
    }
}
