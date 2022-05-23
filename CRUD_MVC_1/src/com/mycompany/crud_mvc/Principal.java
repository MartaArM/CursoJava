/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud_mvc;

import controlador.Controlador;
import controlador.ControladorBusqueda;
import modelo.*;
import vista.Vista;
import vista.VistaBusqueda;

/**
 *
 * @author marta
 */
public class Principal {
    public static void main(String[] args) {
        Vista vista = new Vista();
        VistaBusqueda vistaBusqueda = new VistaBusqueda(vista, true);
        Consultas modelo = new Consultas();
        Controlador controlador = new Controlador(vista, modelo);
        ControladorBusqueda controlador_b = new ControladorBusqueda(vistaBusqueda, modelo);
        
        vista.setVisible(true);
    }
}
