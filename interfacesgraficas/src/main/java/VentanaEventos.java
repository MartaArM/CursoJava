/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marta
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marta
 */
public class VentanaEventos extends JFrame {
    
    protected JPanel panel;
    protected JLabel etiqueta_texto, etiqueta_nueva;
    protected JButton boton; 
    protected JTextField caja;
    protected int tamañoX, tamañoY;
    
    public VentanaEventos() {
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
        
        iniciarEtiqueta();
        iniciarCajaTexto();
        iniciarBoton();
        
        
    }
    public void iniciarEtiqueta() {
        etiqueta_texto = new JLabel(); // Creamos una etiqueta_texto
                
        // ----------- ETIQUETA TEXTO ----------------------
        etiqueta_texto.setText("Ingrese texto");
        etiqueta_texto.setBounds(30, 20, 150, 30); // Posicion y tamaño de la etiqueta_texto
        etiqueta_texto.setFont(new Font("Century", Font.BOLD, 18)); // Ponemos la fuente y el tamaño del texto
        panel.add(etiqueta_texto); // Añadimos la etiqueta_texto al panel
        
        etiqueta_nueva = new JLabel(); // Creamos una etiqueta_texto
        
        
        etiqueta_nueva.setBounds(30, 200, 150, 30); // Posicion y tamaño de la etiqueta_texto
        panel.add(etiqueta_nueva);
        
    }
    
    public void iniciarBoton() {
        boton = new JButton();
        boton.setBounds(90,130,100,50);
        //boton.setEnabled(false); // El botón no se puede clickear
               
        // ----------- AÑADIR TEXTO ----------------
        boton.setText("Insertar.");
        
        panel.add(boton);
        
        // Evento de acción
        ActionListener actionlistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta_nueva.setText("hola " + caja.getText());
            }
        };
        boton.addActionListener(actionlistener);
    }
    
    public void iniciarCajaTexto(){
        caja = new JTextField();
        caja.setBounds(30, 70, 300, 30);
        panel.add(caja);  
        
        
        // Evento de pulsar el teclado.
        KeyListener keylistener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                etiqueta_nueva.setText("hola " + caja.getText() + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        
        // Evento de raton
        MouseListener mouselistener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                tamañoX = e.getX() - caja.getX();
                tamañoY = caja.getY() - e.getY();
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        
        MouseMotionListener mousemotion = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) { // Se ejecuta cuando se pulsa y se arrastra con el ratón
                caja.setLocation(e.getX(), 70);
                //System.out.println(e.getPoint().x + "\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) { // Se ejecuta cuando se mueve el ratón dentro de la caja
                
            }
        };
        
        MouseWheelListener mousewheel = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                caja.setBounds(caja.getX()+(int) e.getPreciseWheelRotation(), caja.getY(), 300,30);
            }
        };
        
        //caja.addKeyListener(keylistener);
        caja.addMouseListener(mouselistener);
        caja.addMouseMotionListener(mousemotion);
        //panel.addMouseWheelListener(mousewheel);
    }
    
}

