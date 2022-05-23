/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Proyecto.Aeropuerto;

import java.util.ArrayList;

/**
 *
 * @author marta
 */
public class Vuelo {
    protected String identificador;
    protected String ciudad_origen;
    protected String ciudad_destino;
    protected double precio;
    protected ArrayList<Pasajero> pasajeros;

    public Vuelo(String identificador, String ciudad_origen, String ciudad_destino, double precio) {
        this.identificador = identificador;
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.precio = precio;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
        
    public void insertarPasajero(Pasajero pas) {
        pasajeros.add(pas);
    }
    
    public void quitarPasajero(Pasajero pas) {
        pasajeros.remove(pas);
    }
    
    public String mostrarDatos() {
        return "Identificador: " + identificador + "\nCiudad de origen: " + ciudad_origen +
                "\nCiudad destino: " + ciudad_destino + "\nPrecio: " + precio;
    }
}
