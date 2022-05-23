/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.image.*;


public class Imagen extends JPanel{
    
    private String ruta;
    private BufferedImage img_bf;
    
    
    public Imagen(int ancho, int alto, String ruta){
        this.setSize(ancho, alto);
        this.ruta = ruta;
    }
    
    public Imagen(int ancho, int alto, BufferedImage img) {
        this.setSize(ancho, alto);
        this.img_bf = img;
    }
    
    @Override
    public void paint(Graphics g) {
        Dimension tam = getSize();
        
        //ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        if (ruta == null) {
            g.drawImage(img_bf, 0, 0, (int)tam.getWidth(), (int)tam.getHeight(), this);
        }
        else {
            Image img = new ImageIcon(ruta).getImage();
            ImageIcon image_scalated = new ImageIcon(img.getScaledInstance((int)tam.getWidth(), (int)tam.getHeight(), Image.SCALE_SMOOTH));
        
            g.drawImage(image_scalated.getImage(), 0, 0, (int)tam.getWidth(), (int)tam.getHeight(), this);
        }
        
        
        setOpaque(false);
        super.paintComponent(g);
    }
    
}
