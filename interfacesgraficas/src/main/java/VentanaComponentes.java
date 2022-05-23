
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
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
public class VentanaComponentes extends JFrame {
    
    protected JPanel panel;
    
    public VentanaComponentes() {
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
        
        //iniciarEtiquetas();
        //iniciarBotones();
        //iniciarRadioBotones();
        //iniciarBotonesActivacion();
        //iniciarCajaTexto();
        //iniciarAreaTexto();
        //iniciarListaDesplegable();
        //iniciarListaDesplegableConModelo();
        //iniciarCampoContraseña();
        iniciarTablas();
        
    }
    public void iniciarEtiquetas() {
        JLabel etiqueta_texto = new JLabel(); // Creamos una etiqueta_texto
        JLabel etiqueta_imagen = new JLabel();
        
        // ----------- ETIQUETA TEXTO ----------------------
        etiqueta_texto.setText("hola");
        etiqueta_texto.setBounds(20, 30, 50, 50); // Posicion y tamaño de la etiqueta_texto
        etiqueta_texto.setForeground(Color.red); // Cambiar el color del texto
        etiqueta_texto.setOpaque(true); //Ponemos fondo a la etiqueta_texto
        etiqueta_texto.setBackground(Color.yellow); // Cambiamos el color de fondo de la etiqueta_texto
        etiqueta_texto.setHorizontalAlignment(JLabel.CENTER); // Cambiar el lugar del texto
        etiqueta_texto.setFont(new Font("Century", Font.BOLD, 18)); // Ponemos la fuente y el tamaño del texto
        panel.add(etiqueta_texto); // Añadimos la etiqueta_texto al panel
        
        // ----------------------------------------
        
        // ------------ ETIQUETA IMAGEN ---------------
        ImageIcon image = new ImageIcon("./images/flores.jpg");
        ImageIcon image_scalated = new ImageIcon(image.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH)); //Escalar una imagen
        
        etiqueta_imagen.setIcon(image_scalated);
        etiqueta_imagen.setBounds(100, 100, 300, 200);
        panel.add(etiqueta_imagen);
        // --------------------------------------------
    }
    
    public void iniciarBotones() {
        JButton boton = new JButton();
        JButton boton2 = new JButton();
        boton.setBounds(100,100,100,50);
        boton2.setBounds(100,200,100,50);
        //boton.setEnabled(false); // El botón no se puede clickear
        
        
        Border borde1;
        borde1 = BorderFactory.createLineBorder(Color.red, 2, false); // Crear bordes para el boton
        
        boton.setBackground(Color.CYAN);
        boton.setBorder(borde1);
        
        // ----------- AÑADIR TEXTO ----------------
        boton.setText("Boton");
        boton.setFont(new Font("Century", Font.BOLD, 18));
        boton.setForeground(Color.red);
        // -----------------------------------------
        
        // ----------- AÑADIR IMAGEN ---------------
        ImageIcon image = new ImageIcon("./images/flores.jpg");
        ImageIcon image_scalated = new ImageIcon(image.getImage().getScaledInstance(
                boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)); //Escalar una imagen
        boton2.setIcon(image_scalated);
        // -----------------------------------------
        
        
        panel.add(boton);
        panel.add(boton2);
    }
    
    public void iniciarRadioBotones() {        
        JRadioButton radioboton2 = new JRadioButton("Boton 1");
        radioboton2.setBounds(50, 100, 50, 50);
        JRadioButton radioboton3 = new JRadioButton("Boton 2");
        radioboton3.setBounds(50, 150, 50, 50);
        
        ButtonGroup grupo = new ButtonGroup(); // Grupo de botones para que solo se pueda seleccionar 1
        grupo.add(radioboton2);
        grupo.add(radioboton3); 
        panel.add(radioboton2);
        panel.add(radioboton3);
    }
    
    // Botones que se quedan marcados.
    public void iniciarBotonesActivacion() {
        JToggleButton boton1 = new JToggleButton("hola");
        boton1.setBounds(50, 50, 100, 50);
        
        panel.add(boton1);
    }
    
    public void iniciarCajaTexto(){
        JTextField caja = new JTextField();
        caja.setText("hola");
        caja.setBounds(20, 20, 300, 30);
        System.out.println(caja.getText()); // Coger el valor escrito.
        panel.add(caja);
    }
    
    public void iniciarAreaTexto() {
        JTextArea area = new JTextArea();
        area.setBounds(30,30,200,100);
        panel.add(area);
        
        area.setLineWrap(true); // Hace un salto de linea cuando metes mas caracteres de la cuenta
        
        // Barras de desplazamiento
        /*JScrollPane barra = new JScrollPane(area);
        barra.setBounds(30, 30, area.getWidth(), area.getHeight());
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        panel.add(barra);*/
    }
    
    public void iniciarListaDesplegable() {
        JComboBox lista = new JComboBox();
        lista.addItem("hola"); // Añadir elementos a la lista
        lista.addItem("adios");
        
        lista.setSelectedItem("adios"); // Seleccionar un elemento de la lista por defecto
        
        lista.setBounds(30,30,200,50);
        panel.add(lista);
    }
    
    public void iniciarListaDesplegableConModelo() {
        // Un modelo sirve para inicializar la lista con objetos propios nuestros.

        DefaultComboBoxModel modelo = new DefaultComboBoxModel(); // Modelo para añadir objetos de tipo persona
        JComboBox lista = new JComboBox(modelo); // Se tiene que añadir en el constructor
        
        modelo.addElement(new Persona("pepe", 7));
        modelo.addElement(new Persona("pepito", 9));
        
        // Para que se vea lo que queramos del objeto, en la clase Persona hay que sobreescribir el método toString().
        
        
        lista.setBounds(30, 30, 200, 50);
        
        panel.add(lista);
    }
    
    public void iniciarCampoContraseña() {
        JPasswordField clave = new JPasswordField();
        clave.setBounds(30, 30, 100, 30);
        
        clave.setText("hola");
        
        String clave_s = "";
        
        for (int i=0; i<clave.getPassword().length; i++) {
            clave_s+=clave.getPassword()[i]; // Coger valores de la contraseña.
        }
        System.out.println(clave_s);
        panel.add(clave);
    }
    
    public void iniciarTablas() {
        DefaultTableModel modelo = new DefaultTableModel(); // Hay que utilizar modelos.
        
        // Añadimos columnas (con titulo)
        modelo.addColumn("Primera columna");
        modelo.addColumn("Segunda columna");
        
        // Añadimos filas
        String[] valores = {"uno", "dos"};
        modelo.addRow(valores);
        
        JTable tabla = new JTable(modelo);
        tabla.setBounds(20, 20, 300, 300);
        panel.add(tabla);
        
        // Le ponemos una barra de desplazamiento porque si no no se ven los nombres de las columnas
        JScrollPane barra = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(20, 20, 300, 300);
        
        panel.add(barra);
        
        
    }
    
}
