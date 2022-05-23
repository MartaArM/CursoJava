/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.POO.Ejercicio9;

/**
 *
 * @author marta
 */
public class Triangulo extends Poligono {
    int lados, base;

    public Triangulo(int lado1, int base) {
        this.lados = lado1;
        this.base = base;
    }

    public int getLado() {
        return lados;
    }

    public void setLado(int lado) {
        this.lados = lado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    @Override
    public double calcularArea() {
        double cateto1 = Math.pow((double)lados, 2);
        double cateto2 = Math.pow((double)(base/2), 2);
        double altura = Math.sqrt(cateto1-cateto2);
        
        return (base*altura)/2;
        
    }
}
