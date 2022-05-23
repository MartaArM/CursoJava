/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Apuntes;

/**
 *
 * @author marta
 */
public class MetodosOrdenamiento {
    public static int[] OrdenamientoQuick(int[] array, int first, int last){
        int i,j,p,t;

        // i se hace igual al índice del primer elemento
        i= first; //0
        // y j igual al índice del último elemento
        j= last; // tamaño-1
        // p se hace igual al elemento pivote del arreglo
        p= array[(first+last)/2]; // Elemento de la mital del vector

        do { 
            // se hace la partición del arreglo
            while (array[i]<p) i++; 
            while (p<array[j]) j--;
            if (i<=j) {

                    // se intercambian los elementos i-esimo y j-esimo del arreglo
                t= array[i]; 
                array[i]= array[j]; 
                array[j]= t; 
                i++; j--;
            }
        } while (i<=j); 
        if (first<j) OrdenamientoQuick(array,first,j); 
        if (i<last) OrdenamientoQuick(array,i,last); 
        return array;
    }
   
    public static void main(String[] args) {
        int[] array = {4,1,5,2,3,8};
        /* // Método burbuja
        boolean terminado = false;
        boolean cambiado = false;
        
        while (!terminado) {
            cambiado = false;
            for (int i=0; i<array.length-1; i++){
                
                if (array[i]>array[i+1]) {
                    int aux =array[i+1];
                    array[i+1] = array[i];
                    array[i] = aux;
                    cambiado = true;
                }
            }
            if (cambiado == false) {
                terminado = true;
            }
        }
        */
        
        /* // Método de insercion
        int pos;
        int valor;
        for (int i=0; i<array.length; i++) {
            pos = i;
            valor = array[i];
            while (pos>0 && array[pos-1]>valor) {
                array[pos] = array[pos-1];
                pos--;
                
            }
            array[pos] = valor;
        }
        */
        
        // Método de selección.
        /*int min;
        int aux;
        for (int i=0; i<array.length; i++){
            min = i; // Se busca la posición del elemento mínimo.
            for (int j=i+1; j<array.length; j++){
                if (array[j] <array[min]){
                    min = j;
                }
            }
            aux = array[min]; // Se intercambia el minimo con la posición i.
            array[min] = array[i];
            array[i] = aux;
            
        }*/
        
        int[] ordenado = OrdenamientoQuick(array, 0, array.length-1);
        for(int i:ordenado) {
            System.out.println(i);
        }
        
        
    }
}
