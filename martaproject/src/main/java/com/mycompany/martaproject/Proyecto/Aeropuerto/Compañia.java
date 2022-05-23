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
public class Compañia {
    protected String nombre;
    protected ArrayList<Vuelo> vuelos;

    public Compañia(String nombre) {
        this.nombre = nombre;
        vuelos = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
   
    
    public void insertarVuelo(Vuelo v) {
        vuelos.add(v);
    }
    
    public void eliminarVuelo(Vuelo v) {
        vuelos.remove(v);
    }
    
    public String mostrarVuelos() {
        String datos = "";
        if (vuelos.isEmpty()) {
            datos = "No hay empresas para este areopuerto.";
        }
        else {
            for (Vuelo v:vuelos) {
                datos += v.mostrarDatos();
                datos += "\n";
            }
        
            datos = datos.substring(0, datos.length() - 1);
        }
        return datos;
    }
}
