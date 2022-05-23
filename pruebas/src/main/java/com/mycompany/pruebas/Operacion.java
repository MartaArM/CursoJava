/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebas;

/**
 *
 * @author marta
 */
public class Operacion {
    
    int numero1, numero2;
    
    int suma;
    int resta;
    int multiplicacion;
    double division;
    
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
    }
    
    public void sumar() {
        suma = numero1+numero2;
    }
    
    public void restar() {
        resta = numero1-numero2;
    }
    
    public void multiplicacion() {
        multiplicacion = numero1*numero2;
    }
}
