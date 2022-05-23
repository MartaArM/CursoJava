/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Matrices;

/**
 *
 * @author marta
 */

// Rellenar una matriz con la diagonal cero y el resto unos.
public class Ejercicio4 {
    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        
        for (int i=0;i<7;i++) {
            for (int j=0; j<7; j++) {
                if (i==j) {
                    matriz[i][j] = 1;
                }
                else {
                    matriz[i][j] = 0;
                }
            }
        }
        
        for (int[] arr:matriz) {
            for (int el:arr){
                System.out.print(el + " ");
            }
            System.out.println("");
        }
    }
}
