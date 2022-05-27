/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos.Ejercicio12;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author marta
 */
public class Imagen {
    private int pixels[][];

    public Imagen() {
        pixels = new int[10][10];
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                pixels[i][j] = ThreadLocalRandom.current().nextInt(0, 255);
            }
        }
    }

    public Imagen(int[][] pixels) {
        this.pixels = pixels;
    }
    
    

    public int[][] getPixels() {
        return pixels;
    }

    public void setPixels(int[][] pixels) {
        this.pixels = pixels;
    }
    
    public int [] histograma() {
        int[] resultado = new int[256];
        
        for (int i=0; i<resultado.length; i++) {
            int numero = 0;
            for (int j=0; j<10; j++) {
                for (int k=0; k<10; k++) {
                    int valor = pixels[j][k];
                    if (pixels[j][k] == i) {
                        numero++;
                    }
                }
            }
            if (numero>0) {
                int val = i;
            }
            resultado[i] = numero;
        }
        return resultado;
    }
    
    public Imagen imagenReducida() {
        int[][] pixels_2 = new int[pixels.length/2][pixels.length/2];
        
        int f=1;
        int c=1;
        for (int i=0; i<pixels_2.length; i++) {
            c = 1;
            for (int j=0; j<pixels_2.length; j++) {
                if (c==(pixels.length-1)) {
                    c--;
                }
                if (f==pixels.length-1)
                    f--;
                pixels_2[i][j] = (pixels[f][c-1]+pixels[f][c+1]+pixels[f-1][c]+pixels[f+1][c])/4;
                
                c+=2;
            }
            
            f+=2;
            
        }
        
        Imagen im = new Imagen(pixels_2);
        return im;
    }
    
}
