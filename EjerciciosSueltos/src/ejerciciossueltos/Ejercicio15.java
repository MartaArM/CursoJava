/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

/*
Crea una función que reciba como parámetro una cadena de texto con una frase
y dicha función tendrá que devolver dicha cadena pero invirtiendo la primera y 
la última palabra.

*/
public class Ejercicio15 {
    public static void main(String args[]) {
        System.out.println(intercambio("hola pepe que haces"));
    }
    
    public static String intercambio(String frase) {
        String frase_int = "";
        String primera_palabra = "";
        String ultima_palabra = "";
        
        boolean espacio = false;
        
        for (int i=0; i<frase.length() && !espacio; i++) {
            if (frase.charAt(i) != ' ') {
                primera_palabra+=frase.charAt(i);
            }
            else {
                espacio = true;
            }
        }
        
        espacio = false;
        
        for (int i=frase.length()-1; i>0 && !espacio; i--) {
            if (frase.charAt(i) != ' ') {
                ultima_palabra+=frase.charAt(i);
            }
            else {
                espacio = true;
            }
        }
        
        ultima_palabra = girarPalabra(ultima_palabra);
        
        frase_int =  ultima_palabra + 
                frase.substring(frase.indexOf(primera_palabra) + primera_palabra.length(), 
                        frase.indexOf(ultima_palabra)) + primera_palabra;
        
        
        return frase_int;
    }
    
    public static String girarPalabra(String palabra) {
        String girada = "";
        
        for (int i=palabra.length()-1; i>=0; i--) {
            girada+=palabra.charAt(i);
        }
        
        return girada;
    }
}
