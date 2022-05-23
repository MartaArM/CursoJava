/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.POO.Ejercicio2;

/**
 *
 * @author marta
 */
public class Main {
    public static void main(String[] args) {
        Pieza pieza = new Pieza();
        
        pieza.arriba();
        System.out.println(pieza.mostrarCoordenadas());
        pieza.derecha();
        System.out.println(pieza.mostrarCoordenadas());
        pieza.derecha();
        System.out.println(pieza.mostrarCoordenadas());
        pieza.arriba();
        System.out.println(pieza.mostrarCoordenadas());
        
        
    }
}
