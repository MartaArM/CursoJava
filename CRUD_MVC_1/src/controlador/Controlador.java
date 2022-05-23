/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vista.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marta
 */
public class Controlador implements ActionListener{
    private Vista vista;
    private Consultas consultas;

    public Controlador(Vista vista, Consultas consultas) {
        this.vista = vista;
        this.consultas = consultas;
        vista.bt_insertar.addActionListener(this);
        vista.bt_modificar.addActionListener(this);
        vista.bt_eliminar.addActionListener(this);
        vista.bt_buscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean resultado;
        if (e.getSource() == vista.bt_insertar) {
            resultado = consultas.insertar(vista.tf_nombre.getText(), vista.tf_apellido.getText(), vista.tf_telefono.getText());
            if (resultado)
                JOptionPane.showMessageDialog(null, "Usuario insertado");
            else
                JOptionPane.showMessageDialog(null, "Usuario no insertado");
        }
        else if (e.getSource() == vista.bt_modificar) {
            resultado = consultas.modificar(vista.tf_nombre.getText(), vista.tf_apellido.getText(), vista.tf_telefono.getText());
            if (resultado)
                JOptionPane.showMessageDialog(null, "Usuario modificado");
            else
                JOptionPane.showMessageDialog(null, "Usuario no insertado");
        }
        else if (e.getSource() == vista.bt_eliminar) {
            resultado = consultas.eliminar(vista.tf_telefono.getText());
            if (resultado)
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
            else
                JOptionPane.showMessageDialog(null, "Usuario no eliminado");
        }
        else if (e.getSource() == vista.bt_buscar) {
            Consultas modelo = new Consultas();
            VistaBusqueda vistaBusqueda = new VistaBusqueda(vista, true);
            ControladorBusqueda controlador_b = new ControladorBusqueda(vistaBusqueda, modelo);
            vistaBusqueda.setVisible(true);
        }
    }
    
    
    
    
}
