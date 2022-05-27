/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

import java.util.Scanner;

/**
 *
 * @author marta
 */

/*
Crea una función que reciba dos cadenas de caracteres y que devuelva la primera 
cadena, pero transformando en mayúsculas la parte que coincide con la segunda cadena 
introducida.

Desde la función principal se pedirán las dos cadenas y se mostrará el resultado 
que devuelva la función de arriba.
*/
public class Ejercicio13 {
    public static void main(String args[]) {
        System.out.println("Frase: ");
        Scanner entradaEscaner = new Scanner(System.in); 
        String frase = entradaEscaner.nextLine();
        
        System.out.println("subcadena: ");
        entradaEscaner = new Scanner(System.in); 
        String subcadena = entradaEscaner.nextLine();
        
        int index = frase.indexOf(subcadena);
        
        if (index == -1) {
            System.out.println("La cadena no está en la frase.");
        }
        else {
            String palabra_mayuscula = subcadena.toUpperCase();
            String frase_mayuscula = frase.substring(0, index) 
                   + palabra_mayuscula  + frase.substring(index+subcadena.length(), frase.length());
            System.out.println(frase_mayuscula);
        }
    }
    
}
