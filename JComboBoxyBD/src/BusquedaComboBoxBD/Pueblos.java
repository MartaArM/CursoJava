/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusquedaComboBoxBD;

/**
 *
 * @author marta
 */
public class Pueblos {
    private String nombre, ciudad, comunidad, pais;

    public Pueblos() {
    }

    public Pueblos(String nombre, String ciudad, String comunidad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.comunidad = comunidad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String toString() {
        return nombre + "-" + ciudad;
    }
    
}
