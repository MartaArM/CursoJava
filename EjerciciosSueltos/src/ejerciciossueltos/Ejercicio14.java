/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

/* Crea una función que reciba una cadena de caracteres y la devuelva invertida 
con efecto espejo, esto es, se concatena a la palabra original su inversa, 
compartiendo la última letra, que hará de espejo, por lo que la palabra obtenida
se lee igual hacia adelante que hacia atrás.

Desde la función principal se pedirá al usuario que introduzca una cadena y 
haciendo uso de dicha función se le mostrará su correspondiente cadena espejo.
*/
public class Ejercicio14 {
    public static void main(String args[]) {
        System.out.println(espejo("hola"));
    }
    
    public static String espejo(String palabra) {
        String palabra_espejo = "";
        String sub_espejo = "";
                
        for (int i=palabra.length()-2; i>=0; i--) {
            sub_espejo+=palabra.charAt(i);
        }
        
        palabra_espejo = palabra + sub_espejo;
        
        return palabra_espejo;
    }
}
