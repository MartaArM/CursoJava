/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.POO.Ejercicio1;

/**
 *
 * @author marta
 */
public class Main {
    public static void main(String[] args) {
        Cuadrilatero cuad = new Cuadrilatero(7, 3);
        Cuadrilatero cuadrado = new Cuadrilatero(9);
        
        System.out.println("Area del primer cuadrilatero: " + cuad.calcularArea());
        System.out.println("Area del segundo cuadrilatero: " + cuadrado.calcularArea());
        System.out.println("Perímetro del primer cuadrilatero: " + cuad.calcularPerimetro());
        System.out.println("Perímetro del segundo cuadrilatero: " + cuadrado.calcularPerimetro());
        
    }
    
    
}
