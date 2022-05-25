/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos.Ejercicio6;

/**
 *
 * @author marta
 */
public class Ejercicio6 {
    public static void main(String args[]) {
        Cuenta cuenta = new Cuenta("Marta", 200);
        System.out.println(cuenta.toString());
        
        if (cuenta.ingresar(100)) {
            System.out.println("Ingresado" + cuenta.toString());
        }
        if (cuenta.ingresar(-100)) {
            System.out.println("Ingresado" + cuenta.toString());
        }
        else {
            System.out.println("No ingresado");
        }
        
        if (cuenta.retirar(100)) {
            System.out.println("Retirado" + cuenta.toString());
        }
        if (cuenta.retirar(300)) {
            System.out.println("Retirado" + cuenta.toString());
        }
        else {
            System.out.println("No retirado");
        }
        
    }
    
    
}

