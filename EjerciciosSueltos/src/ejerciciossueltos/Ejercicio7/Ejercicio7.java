/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos.Ejercicio7;

/**
 *
 * @author marta
 */
public class Ejercicio7 {
    public static void main(String args[]) {
        Password clave = new Password(25);
        System.out.println(clave.getClave());
        
        if (clave.esFuerte()) {
            System.out.println("La clave es fuerte.");
        }
        else {
            System.out.println("La clave no es fuerte.");
        }
    }
}
