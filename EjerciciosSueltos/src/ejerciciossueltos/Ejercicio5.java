/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

import java.util.Scanner;

/*
Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
Al terminar, mostrará lo siguiente:
– mayor numero introducido
– menor numero introducido
– suma de todos los numeros
– suma de los numeros positivos
– suma de los numeros negativos
– media de la suma (la primera que pido)
*/
public class Ejercicio5 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int numero = 0;
        
        int max, min, suma, suma_pos, suma_neg, media;
        int cantidad;
        max = 0;
        min=0;
        suma = 0;
        suma_pos = 0;
        suma_neg = 0;
        media = 0;
        cantidad = 0;
        
        numero = reader.nextInt();
        
        while (numero!=-1) {
            if (numero!=1)
            if (numero>max) {
                max = numero;
            }
            if (numero<min) {
                min = numero;
            }
            suma+=numero;
            
            if (numero>0) {
                suma_pos+=numero;
            }
            else {
                suma_neg+=numero;
            }
            
            cantidad++;
            
            numero = reader.nextInt();
        }
        
        media = suma/cantidad;
        
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
        System.out.println("Suma: " + suma);
        System.out.println("Suma positivos: " + suma_pos);
        System.out.println("Suma negativos: " + suma_neg);
        System.out.println("Media: " + media);
    }
}
