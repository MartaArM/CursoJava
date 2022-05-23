/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.POO.Ejercicio9;

import java.util.ArrayList;

/**
 *
 * @author marta
 */
public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(5, 3);
        Triangulo t2 = new Triangulo(6, 2);
        Rectangulo r1 = new Rectangulo(5, 4);
        Rectangulo r2 = new Rectangulo(7, 5);
        
        ArrayList<Poligono> poligonos = new ArrayList<>();
        poligonos.add(t1);
        poligonos.add(t2);
        poligonos.add(r1);
        poligonos.add(r2);
        
        for (Poligono p:poligonos) {
            System.out.println(p.calcularArea());
        }
        
    }
}
