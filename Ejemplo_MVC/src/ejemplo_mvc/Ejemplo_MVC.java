
package ejemplo_mvc;

import vista.Aplicacion;
import modelo.Conexion;
import controlador.Controlador;

public class Ejemplo_MVC {

   
    public static void main(String[] args) {
        Aplicacion aplicacion = new Aplicacion();
        Conexion modelo = new Conexion();
        Controlador controlador = new Controlador(aplicacion, modelo);
        
        aplicacion.setVisible(true);
    }
    
}
