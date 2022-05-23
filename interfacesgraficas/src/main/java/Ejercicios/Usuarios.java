/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.ArrayList;

/**
 *
 * @author marta
 */
public class Usuarios {
    private ArrayList<Usuario> usuarios;

    public Usuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public String devolverClave(String nombre_us) {
        String clave = "";
        for (Usuario us : usuarios) {
            if (us.getNombre().equals(nombre_us)) {
                clave = us.getClave();
            }
        }
        
        return clave;
    }
}
