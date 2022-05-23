
package programa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import java.awt.image.*;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;


public class Ventana extends javax.swing.JFrame {

    
    // Pintar una imagen en un panel
    // Elegir archivos del ordenador
    // Guardar imagen en base de datos
    // Mostrar imagen de base de datos
    public Ventana() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        bt_cargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        bt_cargar.setText("Elegir imagen");
        bt_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_cargar)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(bt_cargar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cargarActionPerformed
        // TODO add your handling code here:
        JFileChooser archivo_esc = new JFileChooser();
        String ruta = "";
        
        archivo_esc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // Establecemos el modelo
        
        // Podemos añadir un filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.jpg", "jpg");
        archivo_esc.setFileFilter(filtro);
        
        // Si el usuario ha dado aceptar o cancelar
        int seleccion = archivo_esc.showOpenDialog(this);
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion con = new Conexion();
        
        
        if (seleccion == JFileChooser.APPROVE_OPTION) { // Aceptar
            try {
                
                Connection conexion = con.getConnection();
                
                ps = conexion.prepareStatement("select img from imagenes where idimagenes=1");
                rs = ps.executeQuery();
                
                BufferedImage buffimg = null;
                
                while (rs.next()) {
                    InputStream img = rs.getBinaryStream(1);
                    buffimg = ImageIO.read(img);
                    
                    int ancho = panel.getWidth();
                    int alto = panel.getHeight();
                    Imagen imagen = new Imagen(ancho, alto, buffimg);
                    panel.add(imagen);
                    panel.repaint();
                }
                
                rs.close();
            } catch ( SQLException ex) {
                System.err.println("Error " + ex);
            } catch (IOException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            /*File archivo = archivo_esc.getSelectedFile(); // Guardar imagen en BD
            try {
                FileInputStream archivo_ent = new FileInputStream(archivo);
                Connection conexion = con.getConnection();
                
                ps = conexion.prepareStatement("insert into imagenes (img) values (?)");
                ps.setBinaryStream(1, archivo_ent, (int)archivo.length());
                ps.executeUpdate();
            } catch (FileNotFoundException | SQLException ex) {
                System.err.println("Error " + ex);
            }*/
            
            
            
            /*File archivo = archivo_esc.getSelectedFile(); // Obtener archivo seleccionado
            ruta = archivo.getAbsolutePath();
            int ancho = panel.getWidth();
            int alto = panel.getHeight();
            Imagen imagen = new Imagen(ancho, alto, ruta);
            panel.add(imagen);
            panel.repaint();*/    
                
                
                /*File archivo = archivo_esc.getSelectedFile(); // Obtener archivo seleccionado
                ruta = archivo.getAbsolutePath();
                
                int ancho = panel.getWidth();
                int alto = panel.getHeight();
                
                
                Imagen imagen = new Imagen(ancho, alto, ruta);
                panel.add(imagen);
                panel.repaint();*/
            
        }
        
        
        
    }//GEN-LAST:event_bt_cargarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cargar;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
