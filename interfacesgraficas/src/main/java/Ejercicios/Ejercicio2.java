
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marta
 */

/* Poner cuantas veces hacemos click en un botón */
public class Ejercicio2 extends JFrame {
    
    protected JPanel panel;
    JLabel etiqueta, etiqueta_imagen;
    
    JRadioButton radioboton1, radioboton2 , radioboton3;
    
    public Ejercicio2() {
        this.setSize(500, 500); // Tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Que hace la ventana cuando la cerramos.
        this.setTitle("Mi ventana"); // Le ponemos un título a la ventana
        this.setLocationRelativeTo(null); // Centramos la ventana en nuestra pantalla
               
        iniciarComponentes();
    }
    
    private void iniciarComponentes() {
        panel = new JPanel(); // Creamos un panel
        panel.setLayout(null); // Desactivamos el diseño del panel para poder cambiar la etiqueta_texto de lugar
        
        this.getContentPane().add(panel); // Añadimos el panel a la ventana
        
        ponerEtiqueta();    
        listaBotones();
        añadirImagenes();
    }
    public void ponerEtiqueta() {
        etiqueta = new JLabel(); // Creamos una etiqueta_texto
        etiqueta_imagen = new JLabel();
        
        
        etiqueta.setText("Escoja su deporte favorito.");
        etiqueta.setBounds(20, 30, 300, 50); // Posicion y tamaño de la etiqueta_texto
        etiqueta.setFont(new Font("Century", Font.BOLD, 18)); // Ponemos la fuente y el tamaño del texto
        panel.add(etiqueta); 
        
        etiqueta_imagen.setBounds(200, 100, 200, 200);
        panel.add(etiqueta_imagen);
       
    }
    
    public void listaBotones() {
        radioboton1 = new JRadioButton("Fútbol");
        radioboton1.setBounds(50, 100, 100, 30);
        radioboton2 = new JRadioButton("Baloncesto");
        radioboton2.setBounds(50, 150, 100, 30);
        radioboton3 = new JRadioButton("Tenis");
        radioboton3.setBounds(50, 200, 100, 30);
        
        ButtonGroup grupo = new ButtonGroup(); // Grupo de botones para que solo se pueda seleccionar 1
        grupo.add(radioboton1);
        grupo.add(radioboton2);
        grupo.add(radioboton3); 
        panel.add(radioboton1);
        panel.add(radioboton2);
        panel.add(radioboton3);
    }
    
    public void añadirImagenes() {
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("./images/futbol.png");
                ImageIcon image_scalated = new ImageIcon(image.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)); //Escalar una imagen
        
                etiqueta_imagen.setIcon(image_scalated);
            }
        };
        
        radioboton1.addActionListener(action);
        
        ActionListener action2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("./images/baloncesto.png");
                ImageIcon image_scalated = new ImageIcon(image.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)); //Escalar una imagen
        
                etiqueta_imagen.setIcon(image_scalated);
            }
        };
        
        radioboton2.addActionListener(action2);
        
        ActionListener action3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("./images/tenis.png");
                ImageIcon image_scalated = new ImageIcon(image.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)); //Escalar una imagen
        
                etiqueta_imagen.setIcon(image_scalated);
            }
        };
        
        radioboton3.addActionListener(action3);
        
        
    }
    
    
}
