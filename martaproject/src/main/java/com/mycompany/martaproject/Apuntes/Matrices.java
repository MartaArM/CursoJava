/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Apuntes;

/**
 *
 * @author marta
 */
public class Matrices {
    public static void main(String[] args) {
        int matriz[][] = {{1,2,3}, {1,2,3}, {1,2,3}};
        
        int matriz2[][];
        matriz2 = new int[4][3];
        
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                matriz2[i][j] = j;
            }
        }
        for (int[] el:matriz2) {
            for (int num:el){
                System.out.println(num);
            }
        }
    }
}
