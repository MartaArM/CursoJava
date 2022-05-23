/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.Arrays;

/**
 *
 * @author marta
 */

// Mezclar dos arrays ordenados en otro también ordenado.
public class Ejercicio14 {
        
    static public int[] moverpos(int[] array, int pos, int valor) {
        for (int i=array.length-1; i>pos;i--) {
            array[i]=array[i-1];
        }
        array[pos] = valor;
        return array;
    }
    
    public static void main(String[] args) {
        
        int[] array1 = {3,5,7,9,12};
        int[] array2 = {2,4,6,8,10,11};
        int tam1 = array1.length;
        int tam2 = array2.length;
        boolean encontrado;
        
        int tam_mezcla = tam1+tam2;
        int[] mezcla = new int[tam_mezcla];
        
        for (int i=0; i<tam1; i++) {
            mezcla[i] = array1[i];
        }
        
        for(int j=0; j<tam2; j++){
            encontrado = false;
            
            for (int k=0; k<tam_mezcla-1 && !encontrado; k++) {
                if (array2[j]<mezcla[k]){
                    mezcla = moverpos(mezcla, k, array2[j]);
                    encontrado = true;
                }
                else if (array2[j]>mezcla[k] && mezcla[k+1]==0){
                    mezcla[k+1]=array2[j];
                }
            }
        }
       
        for (int el:mezcla) {
            System.out.println(el);
        }
                
    } 
}
