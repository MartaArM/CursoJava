/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

/**
 *
 * @author marta
 */
public class Consultas extends Conexion{
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertar(String nombre, String apellido, String telefono) {
        Connection conexion = null;
        boolean insertado = false;
        
        conexion = this.getConnection();
        
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("INSERT INTO mitabla1(nombre, apellido, telefono) values ('" +
                    nombre + "', '" + apellido + "','" + telefono + "')");
            int resultado = ps.executeUpdate();
            
            
            if (resultado >0) {
                insertado = true;
            }
            
            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Erros"+ex);
        }
        
        return insertado;
    }
    
    public boolean modificar(String nombre, String apellido, String telefono) {
        Connection conexion = null;
        boolean insertado = false;
        
        conexion = getConnection();
        try {
            ps = conexion.prepareStatement("UPDATE mitabla1 set nombre='" + nombre
             + "', apellido='" + apellido + "' where telefono = '" + telefono + "'");
             int resultado = ps.executeUpdate();
            
            
            if (resultado >0) {
                insertado = true;
            }
            
            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Erros"+ex);
        }
        
        return insertado;
    }
    
    public boolean eliminar(String telefono) {
        Connection conexion = null;
        boolean insertado = false;
        
        conexion = getConnection();
        try {
            ps = conexion.prepareStatement("DELETE FROM mitabla1 where telefono='" + telefono + "'");
            int resultado = ps.executeUpdate();
            
            
            if (resultado >0) {
                insertado = true;
            }
            
            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Erros"+ex);
        }
        
        return insertado;
    }
    
    public void buscar(String opcion, String texto, DefaultTableModel modelo) {
        String [] datos = new String[3];
        PreparedStatement ps;
        ResultSet rs = null;
        
        Connection conexion = getConnection();
        String consulta = "";
        
        switch (opcion) {
            case "Nombre":
                consulta = "SELECT * FROM mitabla1 where nombre like '%" + texto + "%'";
                break;
            case "Apellidos":
                consulta = "SELECT * FROM mitabla1 where apellido like '%" + texto + "%'";
                break;
            default:
                consulta = "SELECT * FROM mitabla1 where telefono like '%" + texto + "%'";
                break;
        }
        try {
            ps = conexion.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                datos = new String[3];
                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("apellido");
                datos[2] = rs.getString("telefono");
                
                modelo.addRow(datos);
            }

            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }
    }
    
}
