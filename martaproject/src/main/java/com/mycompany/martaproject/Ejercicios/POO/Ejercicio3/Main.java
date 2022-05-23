/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.POO.Ejercicio3;

/**
 *
 * @author marta
 */
public class Main {
    
    public static int indiceMenor(Coche coches[]) {
        int min = coches[0].getPrecio();
        int pos = 0;
        for (int i=1; i < coches.length; i++) {
            if (coches[i].getPrecio()<min) {
                min = coches[i].getPrecio();
                pos = i;
            }
        }
        return pos;
    }
    
    public static void main(String[] args) {
        Coche coche1 = new Coche("Audi", "A3", 20000);
        Coche coche2 = new Coche("Chevrolet", "Cruce", 16000);
        Coche coche3 = new Coche("Citroen", "DS", 17300);
        
        Coche coches[] = new Coche[3];
        
        coches[0] = coche1;
        coches[1] = coche2;
        coches[2] = coche3;
        
        int pos = indiceMenor(coches);
        
        System.out.println("Los datos del coche con menos precio son: ");
        System.out.println("Marca: " + coches[pos].getMarca());
        System.out.println("Modelo: " + coches[pos].getModelo());
        System.out.println("Precio: " + coches[pos].getPrecio());
        
    }
}
