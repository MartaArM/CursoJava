/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos.Ejercicio10;

/**
 *
 * @author marta
 */
public class Principal {
    public static void main(String args[]) {
        
        double d[] = {4,1,-4,2,-1};
        
        Vector v = new Vector(d);
        //double d2[] = v.eliminarRepetidos();
        double d2[] = v.ordenado();
        
        for (double db : d2) {
            System.out.print(db + " ");
        }
        
        System.out.println("");
    }
}
