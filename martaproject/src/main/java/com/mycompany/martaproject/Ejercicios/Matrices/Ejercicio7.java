/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Matrices;

/**
 *
 * @author marta
 */

// Matriz marco
public class Ejercicio7 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        
        for (int i=0;i<5;i++) {
            for (int j=0; j<5; j++) {
                if (i==0 || i==4 || j==0 ||j==4) {
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
