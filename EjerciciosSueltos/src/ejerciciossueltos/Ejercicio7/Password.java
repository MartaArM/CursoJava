/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos.Ejercicio7;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author marta
 */
public class Password {
    private int longitud;
    private String clave;
    
    private static final String valores = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789abcdefghijklmnopqrstuvwxyz123456789";

    public Password() {
        this.longitud = 8;
        this.clave = generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.clave = generarPassword();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    private String generarPassword() {
        String pass = "";
        for (int i=0; i<longitud; i++) {
            pass+=valores.charAt(generarNumero());
        }
        return pass;
    }
    
    private int generarNumero() {
        Random r = new Random();
        return r.nextInt((valores.length() - 1) + 1);
    }
    
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        
        for (int i=0; i<longitud; i++) {
            char caracter = clave.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            }
            else if (Character.isLowerCase(caracter)) {
                minusculas++;
            }
            else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }
        
        if (mayusculas>2 && minusculas>1 && numeros>5) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
