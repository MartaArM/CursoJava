/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos.Ejercicio12;

/**
 *
 * @author marta
 */
public class Principal {
    public static void main(String args[]) {
        Imagen im = new Imagen();
        int[][] pixels = im.getPixels();
        
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(pixels[i][j] + " ");
            }
            System.out.println("");
        }
        
        /*int[] histograma = im.histograma();
        for (int j=0; j<histograma.length; j++) {
            System.out.print(histograma[j] + " ");
        }*/
        
        Imagen im2 = im.imagenReducida();
        int[][] pixels2 = im2.getPixels();
        
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.print(pixels2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
