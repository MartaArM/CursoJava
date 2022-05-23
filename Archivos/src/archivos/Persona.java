/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.Serializable;

/**
 *
 * @author marta
 */
public class Persona implements Serializable{ // Para poder meter un objeto en un archivo binario hay que hacerlo "serializable"
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + "\nEdad: " + Integer.toString(edad));
    }
}
