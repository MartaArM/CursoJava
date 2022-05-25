/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

import java.util.ArrayList;
import java.util.Random;

/*
Se desea manejar DOS listas de números enteros. La cantidad de elementos de la 
lista 1 DEBE ser un número aleatorio entre 5 y 15. La cantidad de elementos de 
la lista 2 DEBE ser un numero aleatorio entre 10 y 20.

El rango de los números que serán agregados a la lista DEBE estar entre 50 y 550.
Se pide construir una aplicación en java que permita cumplir con la siguiente funcionalidad:
    - Imprimir las listas que han sido generadas.
    - Crear una tercera lista que contenga los elementos que están en la lista 1 y 
    NO ESTAN en la lista 2
    - Imprimir la tercera lista
    - Crear una cuarta lista que contenga los elementos de la lista 1 que son 
    pares y los elementos de la lista 2 que son impares
    - Imprimir la cuarta lista.
*/


public class Ejercicio9 {
        
    public static ArrayList<Integer> rellenarArray1() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random r = new Random();
	int tam = r.nextInt((15 - 5) + 1) + 5;
        
        for (int i=0; i<tam; i++) {
            array.add(r.nextInt((550 - 50) + 1) + 50);
        }
        
        return array;
    }
    
    public static ArrayList<Integer> rellenarArray2() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random r = new Random();
	int tam = r.nextInt((20 - 10) + 1) + 10;
        
        for (int i=0; i<tam; i++) {
            array.add(r.nextInt((550 - 50) + 1) + 50);
        }
        
        return array;
    }
    
    public static ArrayList<Integer> elementosNoRepetidos(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer> norepetidos = new ArrayList<Integer>();
        
        for (int i : array1) {
            if (!array2.contains(i)) {
                norepetidos.add(i);
            }
        }
        
        return norepetidos;
        
    }
    
    public static ArrayList<Integer> paresImpares(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer> paresimpares = new ArrayList<Integer>();
        
        for (int i : array1) {
            if (i%2==0) {
                paresimpares.add(i);
            }
        }
        
        for (int i : array2) {
            if (i%2!=0) {
                paresimpares.add(i);
            }
        }
        
        return paresimpares;
        
    }
    
    
    public static void main(String args[]) {
        ArrayList<Integer> array1 = rellenarArray1();
        ArrayList<Integer> array2 = rellenarArray2();
        
        ArrayList<Integer> norepetidos = elementosNoRepetidos(array1, array2);
        
        for (int i : array1) {
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        for (int i : norepetidos) {
            System.out.print(i + " ");
        }
        System.out.println("");
        ArrayList<Integer> paresimpares = paresImpares(array1, array2);
        
        for (int i : paresimpares) {
            System.out.print(i + " ");
        }
        
    }
}
