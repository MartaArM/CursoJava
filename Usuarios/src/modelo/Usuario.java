/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author marta
 */
public class Usuario {
    private String nombre_usuario, clave, nombre, correo;
    private int tipo_usuario;
    private Date fecha_ultima_sesion;

    public Usuario() {
    }

    public Usuario(String nombre_usuario, String clave, String nombre, String correo, int tipo_usuario) {
        this.nombre_usuario = nombre_usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.correo = correo;
        this.tipo_usuario = tipo_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public Date getFecha_ultima_sesion() {
        return fecha_ultima_sesion;
    }

    public void setFecha_ultima_sesion(Date fecha_ultima_sesion) {
        this.fecha_ultima_sesion = fecha_ultima_sesion;
    }
    
    
}
