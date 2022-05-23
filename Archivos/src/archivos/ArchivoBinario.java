/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marta
 */
public class ArchivoBinario {
    
    // Para añadir contenido sin eliminar, hay que utilizar la clase AniadirBinario
    // que la hemos creado nosotros, para sobreescribir el método writeStreamHeader
    
    private void escribirBinario() {
        try {
            FileOutputStream archivo = new FileOutputStream("./files/pruebabinario.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            Persona persona1 = new Persona("marta", 26);
            Persona persona2 = new Persona("pepe", 54);
            
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            
            escritura.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void leerBinario() {
        
        Persona persona;
        
        try {
            FileInputStream archivo = new FileInputStream("./files/pruebabinario.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while (true) { // Recorremos el archivo binario
                persona = (Persona)lectura.readObject();
                persona.mostrarDatos();
            }
        }catch (EOFException ex) {
            return; // Finalizo de leer el archivo
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    private void aniadirBinario() {
        try {
            FileOutputStream archivo = new FileOutputStream("./files/pruebabinario.bin", true); // Hay que ponerle true
            AniadirBinario escritura = new AniadirBinario(archivo);
            
            Persona persona1 = new Persona("maria", 33);
            
            escritura.writeObject(persona1);
            
            escritura.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArchivoBinario archivo = new ArchivoBinario();
        //archivo.escribirBinario();
        archivo.aniadirBinario();
        archivo.leerBinario();
    }
}

