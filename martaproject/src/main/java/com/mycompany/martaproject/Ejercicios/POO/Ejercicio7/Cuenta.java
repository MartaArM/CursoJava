/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.POO.Ejercicio7;

/**
 *
 * @author marta
 */
public class Cuenta {
    private String numero_cuenta;
    private double saldo;

    public Cuenta(String numero_cuenta, double saldo) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }
    
    public Cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = 0;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void agregarDinero(double dinero) {
        saldo+=dinero;
    }
    
    public void quitarDinero(double dinero) {
        saldo-=dinero;
    }
}
