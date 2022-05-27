/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

/**
 *
 * @author marta
 */
public class Ejercicio16 {
    public static void main(String args[]) {
        System.out.println(letraDNI("77148198"));
    }
    
    public static char letraDNI(String dni) {
        int dni_n = Integer.parseInt(dni);
        String alfabeto = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        int index = dni_n%23;
        
        return alfabeto.charAt(index);
    }
}
