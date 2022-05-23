/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;

/**
 *
 * @author marta
 */
public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/usuarios_java?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String clave = "";

    public Conexion() {
    }
     
    
    public Connection getConnection() {
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion = DriverManager.getConnection(URL, usuario, clave);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Error - " + ex);
        }
        
        return conexion;
    }
        
}
