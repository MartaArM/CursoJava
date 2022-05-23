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
public class Main {
    
    private static ArrayList<Aeropuerto> aeropuertos;
    
    
    public static void mostrarDatosAeropuerto(Aeropuerto a){
        if (a.isPrivado()) {
            AeropuertoPrivado ap = (AeropuertoPrivado) a;
            System.out.println("Las empresas de este aeropuerto son: ");
            System.out.println(ap.mostrarEmpresas());
        }
        else {
            AeropuertoPublico ap = (AeropuertoPublico) a;
            System.out.println("La subvención es de " + ap.getSubvencion());
        }
    }
    
    public static void consultarAeropuertos() {
        for (Aeropuerto a: aeropuertos) {
            if (a.isPrivado()) {
                System.out.println("El hospital es privado.");
            }
            else {
                System.out.println("El hospital es publico.");
            }
            System.out.println(a.mostrarDatos());
        }
    }
    
    public static Aeropuerto buscarAeropuerto(String nombre) {
        int pos = -1;
        for (int i=0; i<aeropuertos.size() && pos<0;i++) {
            if (aeropuertos.get(i).getNombre().equals(nombre)) {
                pos = i;
            }
        }
        
        if (pos<0){
            return null;
        }
        return aeropuertos.get(pos);
    }
        
    public static ArrayList<Vuelo> buscarVuelos() {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for (Aeropuerto a:aeropuertos) {
            for (Compañia c:a.getCompañias()){
                for (Vuelo v: c.getVuelos()) {
                    vuelos.add(v);
                }
            }
        }
        return vuelos;
    }
    
    public static ArrayList<Vuelo> buscarVueloCiudad(ArrayList<Vuelo> vs, String ciudad_origen, String ciudad_destino) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for (Vuelo v:vs) {
            if (v.getCiudad_origen().equals(ciudad_origen) && v.getCiudad_destino().equals(ciudad_destino)) {
                vuelos.add(v);
            } 
        }
        
        return vuelos;
    }
    
    public static void main(String[] args) {
        
        aeropuertos = new ArrayList<>();
        
        AeropuertoPrivado aeropuerto = new AeropuertoPrivado("Nuevo aeropuerto", "Granada", "España");
        AeropuertoPublico aeropuerto2 = new AeropuertoPublico("Nuevo aeropuerto", "Granada", "España", 6000);
        
        aeropuerto.añadirEmpresa(new Empresa("Nueva empresa"));
        aeropuerto.añadirEmpresa(new Empresa("Nueva empresa2"));
        Compañia comp = new Compañia("Nueva compañia");
        comp.insertarVuelo(new Vuelo("1234", "Granada", "Madrid", 150));
        Compañia comp2 = new Compañia("Nueva compañia2");
        comp2.insertarVuelo(new Vuelo("2345", "Málaga", "Barcelona", 75));
        aeropuerto.añadirCompañia(comp);
        aeropuerto2.añadirCompañia(comp2);
        
        aeropuertos.add(aeropuerto);
        aeropuertos.add(aeropuerto2);
        
        /*for (Aeropuerto a:aeropuertos) {
            mostrarDatosAeropuerto(a);
        }*/
        
        // Mostrar vuelos de una compañoa de un areopuerto.
        //System.out.println(buscarAeropuerto("Nuevo aeropuerto").buscarCompañia("Nueva compañia").mostrarVuelos());
        
        
        ArrayList<Vuelo> vuelos = buscarVuelos();
        ArrayList<Vuelo> vuelos1 = buscarVueloCiudad(vuelos, "Málaga", "Barcelona");
        
        for (Vuelo v:vuelos1) {
            System.out.println("Identificador: " + v.getIdentificador());
            System.out.println("Precio: " + v.getPrecio());
        }
        
    }
}
