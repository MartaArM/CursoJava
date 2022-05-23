/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author marta
 */
public class InsertarUsuarios {
    public boolean registrar(Usuario us) {
        Conexion conn = new Conexion();
        PreparedStatement ps = null;
        boolean insertado = false;
        try {
            
            Connection conexion = conn.getConnection();
            ps = conexion.prepareStatement("INSERT INTO usuarios('nombreusuario', "
                    + "'clave','nombre', 'correo', 'ultima_sesion', 'id_tipo_usuario') values (?, ?, ?, ?, ?)");
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
}
