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
public class AeropuertoPrivado extends Aeropuerto{
    protected ArrayList<Empresa> empresas;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        privado = true;
        empresas = new ArrayList<>();
    }
    
    public void añadirEmpresa(Empresa e) {
        empresas.add(e);
    }
    
    public void eliminarEmpresa(Empresa e) {
        empresas.remove(e);
    }
    
    public String mostrarEmpresas() {
        String datos = "";
        if (empresas.isEmpty()) {
            datos = "No hay empresas para este areopuerto.";
        }
        else {
            for (Empresa e:empresas) {
                datos += e.nombre;
                datos += "\n";
            }
        
            datos = datos.substring(0, datos.length() - 1);
        }
        return datos;
    }
    
    
}
