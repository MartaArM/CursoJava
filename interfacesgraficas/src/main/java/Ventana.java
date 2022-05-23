
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author marta
 */

// Heredar de JFrame para abrir una ventana nueva.
public class Ventana extends JFrame{
    
  
    
    public Ventana() {
        this.setSize(500, 500); // Tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Que hace la ventana cuando la cerramos.
        this.setTitle("Mi ventana"); // Le ponemos un título a la ventana
        
        //this.setLocation(50, 50); // Donde se crea la ventana.
        this.setLocationRelativeTo(null); // Centramos la ventana en nuestra pantalla
        //this.setResizable(false); // La ventana no se puede cambiar de tamaño
        
        Dimension dim = new Dimension(400, 400);
        this.setMinimumSize(dim); //Tamaño minimo al que se puede redimensionar la ventana
        this.getContentPane().setBackground(Color.white); //cambiamos el color de fondo
        
    }
}
