/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marta
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    
    File archivo;
    File carpeta;
    
    
    private void crearArchivo() {
        archivo = new File("./files/prueba.txt");
        
        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado.");
            }  
        } catch (IOException ex) {
            System.err.println("No se pudo crear el archivo.");
        }
    }
    
    private void crearDirectorio() {
        carpeta = new File("./files/nueva_carpeta");
        
        if (carpeta.mkdir()) {
            System.out.println("Se ha creado la carpeta.");
        }
    }
    
    private void escribirTexto() {
        FileWriter escribir = null;
        try {
            escribir = new FileWriter(archivo);
            escribir.write("hola caracola");
            escribir.write("\r\nNueva linea");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("No se puede escribir en el archivo");
        }
        
    }
    
    private void añadirTexto() {
            FileWriter escribir = null;
        try {
            escribir = new FileWriter(archivo, true);
            escribir.write("aniadir texto");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("No se puede escribir en el archivo");
        } 
    }
    
    private void leerTexto() {
        FileReader lector = null;
        BufferedReader lectura = null;
        String cadena = "";
        
        try {
            lector = new FileReader(archivo);
            lectura = new BufferedReader(lector);
            cadena = lectura.readLine();
            while (cadena  != null) {
                System.out.println(cadena);
                cadena = lectura.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Archivos archivos = new Archivos();
        
        archivos.crearArchivo();
        archivos.leerTexto();
        //archivos.escribirTexto();
        //archivos.añadirTexto();
        //archivos.crearDirectorio();
        
        
        /*if (file.exists()) {
            System.out.println("El archivo existe.");
        }
        else {
            System.out.println("No existe.");
        }*/
    }
    
}
