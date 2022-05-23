/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.POO.Ejercicio7;

/**
 *
 * @author marta
 */
public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Pepito", "Pérez");
        c.setDNI("77777777X");
        
        Cuenta cuenta = new Cuenta("12345");
        
        c.añadirCuenta(cuenta);
        
        System.out.println(c.consultarSaldo("12345"));
        
        c.agregarDinero("12345", 500);
        System.out.println(c.consultarSaldo("12345"));
    }
}
