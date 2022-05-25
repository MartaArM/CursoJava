/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/*
Crear una lista de números decimales, la cantidad de elementos de la lista debe
ser un número aleatorio dentro del intervalo [5; 10].
Los valores que se agregan a la lista DEBEN ser números decimales dentro del 
intervalo [45.0; 90.0]
Se pide una aplicación en Java que permita cumplir con los siguientes requerimientos
    - Imprimir la lista de números generados
    - Imprimir el promedio de los valores que fueron incorporados
    - Imprimir el número mayor que forma parte de la lista
    - Imprimir la diferencia entre el segundo número más grande y el segundo más pequeño

*/
public class Ejercicio8 {
    
    public static ArrayList<Double> rellenarArray() {
        ArrayList<Double> array = new ArrayList<Double>();
        Random r = new Random();
	int tam = r.nextInt((10 - 5) + 1) + 5;
        
        for (int i=0; i<tam; i++) {
            array.add(r.nextDouble((90 - 45) + 1) + 45);
        }
        
        return array;
    }
    
    public static void main(String args[]) {
        ArrayList<Double> array = rellenarArray();
        ArrayList<Double> array_ordenado = array;
        Collections.sort(array_ordenado);
        
        double suma = 0.0;
        double max = 0.0;
        for (double d : array) {
            suma+=d;
            max = array_ordenado.get(array_ordenado.size()-1);
            System.out.println(d);
        }
        
        System.out.println("Promedio: " + (suma/array.size()));
        System.out.println("Maximo: " + max);
        double diferencia = array_ordenado.get(array_ordenado.size()-2) - array_ordenado.get(1);
        System.out.println("Diferencia: " + diferencia);
    }
}
