/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Apuntes;

/**
 *
 * @author marta
 */
public class Busquedas {
    // Búsqueda binaria
    // El array tiene que estar ordenado ascendentemente.
    public static void main(String[] args) {
        int[] array = {1,3,4,5,6,8};
        int dato = 7;
        int inferior, superior, mitad;
        boolean encontrado = false;
        
        inferior = 0;
        superior = array.length;
        mitad = (inferior+superior)/2;
        
        for (int i=0; i<array.length && inferior<=superior;i++) {
            if (array[mitad]==dato){
                encontrado = true;
                break; // Salimos del bucle
            } 
            // Si es mayor
            else if (array[mitad]>dato) {
                superior = mitad;
                mitad = (superior+inferior)/2;
            }
            else {
                inferior = mitad;
                mitad = (superior+inferior)/2;
            }
        }
        
        if (encontrado) {
            System.out.println("El elemento está en el array en la posición "+(mitad+1));
        }
        else{
            System.out.println("No se encuentra el elemento.");
        }
    }
}
