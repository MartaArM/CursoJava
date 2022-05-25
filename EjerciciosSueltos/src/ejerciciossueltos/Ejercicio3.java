/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

/*
Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas 
vocales hay en total
*/
public class Ejercicio3 {
    
    /* Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas 
vocales hay en total */
    public static int numeroVocales(String frase) {
        int contador = 0;
        for (int i=0; i<frase.length(); i++) {
            frase = frase.toLowerCase();
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' ||
                    frase.charAt(i) == 'i' || frase.charAt(i) == 'o' ||
                    frase.charAt(i) == 'u'){
                contador++;
            }
        }
        
        return contador;
    }
    
    public static String reemplazarA(String frase) {
        String cambiado = "";
        for (int i=0; i<frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                cambiado+='e';
            }
            else if (frase.charAt(i) == 'A') {
                cambiado+='E';
            }
            else {
                cambiado+=frase.charAt(i);
            }
        }
        
        return cambiado;
    }
    
    public static void main(String args[]) {
        String frase = "La lluvia en Sevilla es una maravilla";
        System.out.println("Numero vocales: " + numeroVocales(frase));
        System.out.println("String cambiado: " + reemplazarA(frase));
    }
}
