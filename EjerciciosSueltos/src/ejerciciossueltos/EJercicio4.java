/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

import java.util.ArrayList;


/**
 *
 * @author marta
 */

/* Dada una frase, separarla en palabras*/
public class EJercicio4 {
    public static ArrayList<String> separarString(String frase) {
        String palabra = "";
        ArrayList<String> palabras = new ArrayList<String>();
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i) != ' ') {
                palabra+=frase.charAt(i);
                if (i==frase.length()-1) {
                    palabras.add(palabra);
                }
            }
            else {
                palabras.add(palabra);
                palabra="";
            }
        }
        return palabras;
    }
    
    public static void main(String args[]) {
        ArrayList<String> array = new ArrayList<>();
        String frase = "La lluvia en Sevilla es una maravilla";
        array = separarString(frase);
        
        for (String e : array) {
            System.out.println(e);
        }
    }
}
