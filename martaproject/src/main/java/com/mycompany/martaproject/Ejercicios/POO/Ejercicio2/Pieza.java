/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.POO.Ejercicio2;

/**
 *
 * @author marta
 */
public class Pieza {
    private int x;
    private int y;

    public Pieza() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void derecha() {
        x+=1;
    }
    
    public void izquierda() {
        x-=1;
    }
    
    public void arriba() {
        y+=1;
    }
    
    public void abajo() {
        y-=1;
    }
    
    public String mostrarCoordenadas() {
        return "("+x+","+y+")";
    }
}
