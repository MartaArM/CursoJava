/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author marta
 */
public class MetodosUsuario {
    
    //Insertamos un usuario.
    public static boolean registrar(Usuario us) {
        Conexion conn = new Conexion();
        PreparedStatement ps = null;
        boolean insertado = false;
        try {
            
            Connection conexion = conn.getConnection();
            ps = conexion.prepareStatement("INSERT INTO usuarios(nombreusuario, "
                    + "clave,nombre, correo, id_tipo_usuario) values (?, ?, ?, ?, ?)");
            ps.setString(1, us.getNombre_usuario());
            ps.setString(2, us.getClave());
            ps.setString(3, us.getNombre());
            ps.setString(4, us.getCorreo());
            ps.setInt(5, us.getTipo_usuario());
            int resultado = ps.executeUpdate();
            
            if (resultado > 0) {
                insertado = true;
            }
            conexion.close();
            
        }catch(Exception ex) {
            System.err.println("Error - " + ex);
        }
        
        return insertado;
    }
    
    // Buscamos usuario por nombre de usuario
    public static Usuario encontrarUsuarioNombreUsuario(String nombre) {
        Conexion conn = new Conexion();
        
        Connection conexion = conn.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        String consulta = "SELECT * FROM usuarios where nombreusuario='" + nombre + "'";
        Usuario us = null;
        try {
            ps = conexion.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            
            
            while(rs.next()) {
                us = new Usuario(rs.getString("nombreusuario"), rs.getString("clave"),
                rs.getString("nombre"), rs.getString("correo"), rs.getInt("id_tipo_usuario"));
            }
            
            
        } catch(Exception ex) {
            System.err.println("Error - " + ex);
        }
        
        return us;
    }
    
    // Buscamos usuario por correo.
    public static Usuario encontrarUsuarioCorreo(String correo) {
        Conexion conn = new Conexion();
        
        Connection conexion = conn.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        String consulta = "SELECT * FROM usuarios where correo='" + correo + "'";
        Usuario us = null;
        try {
            ps = conexion.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            
            while(rs.next()) {
                us = new Usuario(rs.getString("nombreusuario"), rs.getString("nombre"),
                rs.getString("clave"), rs.getString("correo"), rs.getInt("id_tipo_usuario"));
            }
            
            
        } catch(Exception ex) {
            System.err.println("Error - " + ex);
        }
        
        return us;
    }
    
    public static boolean cambiarFechaInicio(String nombreusuario) {
        Conexion conn = new Conexion();
        PreparedStatement ps = null;
        boolean cambiado = false;
        try {
            
            Connection conexion = conn.getConnection();
            ps = conexion.prepareStatement("UPDATE usuarios set ultima_sesion=(?) where nombreusuario='" +
                    nombreusuario + "'");
            ps.setDate(1, new java.sql.Date(new Date().getTime()));
            int resultado = ps.executeUpdate();
            
            if (resultado > 0) {
                cambiado = true;
            }
            conexion.close();
            
        }catch(Exception ex) {
            System.err.println("Error - " + ex);
        }
        
        return cambiado;
    }
    
    public static boolean comprobarFormatoCorreo(String correo) {
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        // El email a validar
 
        Matcher matcher = pattern.matcher(correo);
 
        return matcher.find();
    }
 
}
