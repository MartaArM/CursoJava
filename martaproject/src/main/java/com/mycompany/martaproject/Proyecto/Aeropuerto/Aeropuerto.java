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
public class Aeropuerto {
    protected String nombre;
    protected String ciudad;
    protected String pais;
    protected ArrayList<Compañia> compañias;
    boolean privado;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        compañias = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Compañia> getCompañias() {
        return compañias;
    }

    public void setCompañias(ArrayList<Compañia> compañias) {
        this.compañias = compañias;
    }
    
    
    
    public boolean isPrivado() {
        return privado;
    }
    
    public void añadirCompañia(Compañia c) {
        compañias.add(c);
    }
    
    public void eliminarCompañia(Compañia c){
        compañias.remove(c);
    }
    
    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nCiudad: " + ciudad + "\nPais: " + pais;
    }

    public String mostrarCompañias() {
        String datos = "";
        if (compañias.isEmpty()) {
            datos = "No hay empresas para este areopuerto.";
        }
        else {
            for (Compañia e:compañias) {
                datos += e.nombre;
                datos += "\n";
            }
        
            datos = datos.substring(0, datos.length() - 1);
        }
        return datos;
    }

    public Compañia buscarCompañia(String nombre) {
        int pos = -1;
        for (int i=0; i<compañias.size() && pos<0;i++) {
            if (compañias.get(i).getNombre() == nombre) {
                pos = i;
            }
        }
        
        if (pos<0){
            return null;
        }
        return compañias.get(pos);
    }
    
    
    
    
    
}
