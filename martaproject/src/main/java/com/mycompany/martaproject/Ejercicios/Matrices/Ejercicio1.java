/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Matrices;

import java.util.Arrays;

/**
 *
 * @author marta
 */

// Decir si una matriz es simétrica o no.
public class Ejercicio1 {
    public static void main(String[] args) {
        int matriz[][] = {{1,1,1}, {1,2,1}, {7,1,1}};
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int matriz_inversa[][] = new int[filas][columnas];
        
        if (filas==columnas) {
            for (int i=0; i<filas;i++){
                for (int j=0; j<columnas;j++){
                    matriz_inversa[j][i] = matriz[i][j];
                }
            }
            if (Arrays.deepEquals(matriz, matriz_inversa)){ // Comparacion de matrices.
                System.out.println("La matriz es simétrica.");
            }
            else {
                System.out.println("La matriz no es simétrica.");
            }
        }
        else {
            System.out.println("La matriz no es simétrica.");
        }
    }
}
