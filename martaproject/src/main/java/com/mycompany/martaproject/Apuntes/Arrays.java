/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Apuntes;

/**
 *
 * @author marta
 */
public class Arrays {
    public static void main(String[] args) {
        // Arrays estáticos.
        int[] uno = new int[4];
        uno[2] = 2;
        
        int[] dos = {1,2,3};
        
        for (int i=0; i<4; i++){
            System.out.println(uno[i]);
        }
        System.out.println("\n");
        
        // Bucle foreach.
        for(int i:dos){
            System.out.println(i);
        }
    
    }
}
