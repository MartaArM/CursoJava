
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.lang.model.util.AbstractAnnotationValueVisitor14;
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
public class Ejercicio3 extends JFrame {
    
    protected JPanel panel;
    JLabel etiqueta;
    JButton boton, boton2, boton3;
    
    int rojo, verde, azul;
    boolean rojo_b, verde_b, azul_b;
    
    public Ejercicio3() {
        this.setSize(500, 500); // Tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Que hace la ventana cuando la cerramos.
        this.setTitle("Mi ventana"); // Le ponemos un título a la ventana
        this.setLocationRelativeTo(null); // Centramos la ventana en nuestra pantalla
        
        rojo=0;
        verde=0;
        azul=0;
        
        rojo_b=false;
        verde_b = false;
        azul_b=false;
               
        iniciarComponentes();
        eventosBotones();
    }
    
    private void iniciarComponentes() {
        panel = new JPanel(); // Creamos un panel
        panel.setLayout(null); // Desactivamos el diseño del panel para poder cambiar la etiqueta_texto de lugar
        
        this.getContentPane().add(panel); // Añadimos el panel a la ventana
        
        ponerEtiqueta();    
        ponerBotones();
    }
    public void ponerEtiqueta() {
        etiqueta = new JLabel(); // Creamos una etiqueta_texto
        
        
        etiqueta.setText("Color(Rojo =0, Verde=0, Azul=0)");
        etiqueta.setBounds(100, 30, 400, 50); // Posicion y tamaño de la etiqueta_texto
        etiqueta.setFont(new Font("Century", Font.BOLD, 18)); // Ponemos la fuente y el tamaño del texto
        panel.add(etiqueta); 
       
    }
    
    public void ponerBotones() {
        boton = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        
        boton.setBounds(100,100,80,30);
        boton2.setBounds(200,100,80,30);
        boton3.setBounds(300,100,80,30);
        
        boton.setText("Rojo");
        boton.setForeground(Color.red);
        
        boton2.setText("Verde");
        boton2.setForeground(Color.green);
        
        boton3.setText("Azul");
        boton3.setForeground(Color.BLUE);
        
        
        panel.add(boton);
        panel.add(boton2);
        panel.add(boton3);
        
    }
    
    private void eventosBotones() {
        ActionListener action1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rojo_b = true;
                verde_b = false;
                azul_b = false;
            }
        };
        boton.addActionListener(action1);
        
        ActionListener action2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rojo_b = false;
                verde_b = true;
                azul_b = false;
            }
        };
        boton2.addActionListener(action2);
        
        ActionListener action3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rojo_b = false;
                verde_b = false;
                azul_b = true;
            }
        };
        boton3.addActionListener(action3);
        
       eventoRueda();
    }
    
    private void eventoRueda() {
        MouseWheelListener mousewheel = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (rojo_b) {
                    if (e.getPreciseWheelRotation()<0)
                        rojo+=2;
                    else 
                        rojo-=2;
                    
                }
                else if (verde_b) {
                    if (e.getPreciseWheelRotation()<0)
                        verde+=2;
                    else 
                        verde-=2;
                    
                }
                else if (azul_b) {
                    if (e.getPreciseWheelRotation()<0)
                        azul+=2;
                    else 
                        azul-=2;
                    
                }
                
                if (rojo_b || verde_b || azul_b) {
                    if (rojo>255) {
                        rojo=255;
                    }
                    if (rojo<2) {
                        rojo=0;
                    }
                    if (verde>255) {
                        verde=255;
                    }
                    if (verde<2) {
                        verde=0;
                    }
                    if (azul>255) {
                        azul=255;
                    }
                    if (azul<2) {
                        azul=0;
                    }
                    Color newcolor = new Color(rojo, verde, azul);
                    panel.setBackground(newcolor);
                    etiqueta.setText("Color(Rojo ="+rojo+", Verde="+verde+", Azul="+azul+")");
                }
                
            }
        };
        
        panel.addMouseWheelListener(mousewheel);
    }
    
    
}
