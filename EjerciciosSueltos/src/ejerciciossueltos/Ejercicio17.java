/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

/**
 *
 * @author marta
 */
public class Ejercicio17 {
    public static void main(String args[]) {
        if (esPangrama("The quick brown fox jumps over the lazy dog")) {
            System.out.println("Es pangrama;");
        }
        else {
            System.out.println("No es pangrama.");
        }
    }
    
    public static boolean esPangrama(String frase) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String frase_min = frase.toLowerCase();
        
        boolean espangrama = true;
       
        for (int i=0; i<alfabeto.length() && espangrama; i++) {
            if (frase_min.indexOf(alfabeto.charAt(i)) == -1) {
                espangrama = false;
            }
        }
        
        return espangrama;
        
    } 
}
