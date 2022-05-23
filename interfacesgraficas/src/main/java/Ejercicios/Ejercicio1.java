
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marta
 */

/* Poner cuantas veces hacemos click en un botón */
public class Ejercicio1 extends JFrame {
    
    protected JPanel panel;
    JLabel etiqueta;
    int veces;
    
    public Ejercicio1() {
        this.setSize(500, 500); // Tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Que hace la ventana cuando la cerramos.
        this.setTitle("Mi ventana"); // Le ponemos un título a la ventana
        this.setLocationRelativeTo(null); // Centramos la ventana en nuestra pantalla
               
        veces = 0;
        iniciarComponentes();
    }
    
    private void iniciarComponentes() {
        panel = new JPanel(); // Creamos un panel
        panel.setLayout(null); // Desactivamos el diseño del panel para poder cambiar la etiqueta_texto de lugar
        
        this.getContentPane().add(panel); // Añadimos el panel a la ventana
        
        ponerEtiqueta();    
        ponerBoton();
    }
    public void ponerEtiqueta() {
        etiqueta = new JLabel(); // Creamos una etiqueta_texto
        
        
        etiqueta.setText("¿Cuantos click haces?");
        etiqueta.setBounds(20, 30, 300, 50); // Posicion y tamaño de la etiqueta_texto
        etiqueta.setFont(new Font("Century", Font.BOLD, 18)); // Ponemos la fuente y el tamaño del texto
        panel.add(etiqueta); // Añadimos la etiqueta_texto al et
       
    }
    
    public void ponerBoton() {
        JButton boton = new JButton();
        boton.setBounds(100,100,100,50);
        boton.setText("Haz click.");
        
        
        ActionListener actionlistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                veces += 1;
                etiqueta.setText("Veces: " + veces);
            }
        };   
        boton.addActionListener(actionlistener);
        
        panel.add(boton);
    }
    
    
}
