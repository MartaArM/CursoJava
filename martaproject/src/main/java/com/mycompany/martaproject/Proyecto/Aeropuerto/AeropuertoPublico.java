/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martaproject.Proyecto.Aeropuerto;

/**
 *
 * @author marta
 */
public class AeropuertoPublico extends Aeropuerto {
    protected double subvencion;

    public AeropuertoPublico( String nombre, String ciudad, String pais, double subvencion) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
        this.privado = false;
    }

    public double getSubvencion() {
        return subvencion;
    }

    public void setSubvencion(double subvencion) {
        this.subvencion = subvencion;
    }
    
    
    
    
}
