/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Consultas;
import vista.*;

/**
 *
 * @author marta
 */
public class ControladorBusqueda implements ActionListener{
    private VistaBusqueda vista;
    private Consultas consultas;
    
    public ControladorBusqueda(VistaBusqueda vista, Consultas consultas) {
        this.vista = vista;
        this.consultas = consultas;
        vista.bt_guardar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        rellenarTabla();
    }
    
    
    private void rellenarTabla() {
        DefaultTableModel modelo;
        String [] datos;
        modelo = new DefaultTableModel(); // Hay que utilizar modelos.
        
        // Añadimos columnas (con titulo)
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Teléfono");
        
        
        vista.tabla.setModel(modelo);
        
        consultas.buscar(vista.cb_opcion.getSelectedItem().toString(), vista.tf_opcion.getText(), modelo);
        
    }
}
