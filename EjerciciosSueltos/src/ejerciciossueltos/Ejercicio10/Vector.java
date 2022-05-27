/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos.Ejercicio10;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author marta
 */
public class Vector {
    private double datos[];

    public Vector() {
    }

    public Vector(double[] datos) {
        this.datos = datos;
    }

    public double[] getDatos() {
        return datos;
    }

    public void setDatos(double[] datos) {
        this.datos = datos;
    }
    
    public double [] eliminarRepetidos() {
        double[] resultado = new double[1];
        boolean repetido;
        resultado[0] = datos[0];
        int i;
        for (int j=1; j<datos.length; j++) {
            repetido = false;
            for (i=0; i<resultado.length; i++) {
                if (datos[j] == resultado[i]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                resultado = Arrays.copyOf(resultado, resultado.length+1);
                resultado[resultado.length-1] = datos[j];
            }
        }
                
        return resultado;
    }
    
    public double [] ordenado() {
                
        double[] resultado = datos;
        
        for(int k=0;k<datos.length-1;k++) {
            for(int f=0;f<resultado.length-1-k;f++) {
                if (Math.abs(resultado[f])<Math.abs(resultado[f+1])) {
                    double aux;
                    aux=resultado[f];
                    resultado[f]=resultado[f+1];
                    resultado[f+1]=aux;
                }
            }
        }
        
        return resultado; 
    }
    
}
