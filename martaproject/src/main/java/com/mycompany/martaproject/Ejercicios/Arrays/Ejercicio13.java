/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Arrays;

/**
 *
 * @author marta
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        int[] array = {7,8,7,1,5,2,3,11};
        int n_pares=0, n_impares=0;
        int i;
        int i_pares=0, i_impares=0;
        
        for (int el:array) {
            if (el%2==0) {
                n_pares++;
            }
            else {
                n_impares++;
            }
        }
        
        int[] pares = new int[n_pares];
        int[] impares = new int[n_impares];
        
        for (int arr:array) {
            if (arr%2==0) {
                pares[i_pares] =arr;
                i_pares++;
            }
            else {
                impares[i_impares] =arr;
                i_impares++;
            }
        }
       System.out.println("Pares:");
        for (int el:pares) {
            System.out.println(el);
        }
        
        for (int j:impares) {
            System.out.println(j);
        }
                
    }
}
