/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.POO.Ejercicio1;

/**
 *
 * @author marta
 */
public class Cuadrilatero {
    private int lado1;
    private int lado2;
    
    public Cuadrilatero(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public Cuadrilatero(int lado) {
        this.lado1 = lado;
        this.lado2 = lado;
    }
    
    public int calcularArea() {
        return lado1*lado2;
    }
    
    public int calcularPerimetro() {
        return (lado1*2) + (lado2*2);
    }
}
