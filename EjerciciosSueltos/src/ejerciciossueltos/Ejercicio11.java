/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marta
 */
public class Ejercicio11 {
    public static void main(String args[]) {
        int[] masaltos = masAltos();
        
        System.out.println(masaltos[0] + "-" + masaltos[1]);
    }
    
    public static int [] masAltos() {
        File archivo = new File("./elementos.txt");
        ArrayList<Integer> elementos = new ArrayList<>();
        elementos = leerTexto();
        
        int max1 = Collections.max(elementos);
        int index = elementos.indexOf(max1);
        elementos.remove(index);
        int max2 = Collections.max(elementos);
        
        int[] resultado = {max2, max1};
        
        return resultado;
    }
    
    private static ArrayList<Integer> leerTexto() {
        File archivo = new File("./elementos.txt");
        ArrayList<Integer> elementos = new ArrayList<>();
        FileReader lector = null;
        BufferedReader lectura = null;
        String cadena = "";
        
        try {
            lector = new FileReader(archivo);
            lectura = new BufferedReader(lector);
            cadena = lectura.readLine();
            while (cadena  != null) {
                elementos.add(Integer.parseInt(cadena));
                cadena = lectura.readLine();
            }
            
        } catch (Exception ex) {
            System.err.println("Error - " + ex);
        } 
        
        return elementos;
    }
}
