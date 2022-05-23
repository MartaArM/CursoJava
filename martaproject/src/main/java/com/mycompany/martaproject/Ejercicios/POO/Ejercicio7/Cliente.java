/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Ejercicios.POO.Ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author marta
 */
public class Cliente {
    private ArrayList<Cuenta> cuentas;
    private String nombre;
    private String apellido;
    private String DNI;

    public Cliente(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cuentas = new ArrayList<Cuenta>();
    }
    
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentas = new ArrayList<Cuenta>();
    }
    
    public Cliente(String DNI) {
        this.DNI = DNI;
        this.cuentas = new ArrayList<Cuenta>();
    }
    

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    private int buscarCuenta(String num_cuenta) {
        int pos = -1;
        boolean encontrado = false;
        for (int i=0; i<cuentas.size() && !encontrado; i++) {
            if (cuentas.get(i).getNumero_cuenta()==num_cuenta) {
                pos = 0;
                encontrado = true;
            }
        }
        
        return pos;
    }
    
    public void agregarDinero(String numero_cuenta, double dinero) {
        int pos = buscarCuenta(numero_cuenta);
        Cuenta cuenta = cuentas.get(pos);
        cuenta.agregarDinero(dinero);
    }
    
    public void quitarDinero(String numero_cuenta, double dinero) {
        int pos = buscarCuenta(numero_cuenta);
        Cuenta cuenta = cuentas.get(pos);
        cuenta.quitarDinero(dinero);
    }
    
    public double consultarSaldo(String numero_cuenta) {
        int pos = buscarCuenta(numero_cuenta);
        return cuentas.get(pos).getSaldo();
    }
    
    public double[] consultarSaldo() {
        double[] saldos = new double[cuentas.size()];
        
        for (int i=0; i<saldos.length; i++) {
            saldos[i] = cuentas.get(i).getSaldo();
        }
        
        return saldos;
    }
    
    public void añadirCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
}
