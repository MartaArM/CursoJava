
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author marta
 */
public class Ventana extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    public Ventana() {
        initComponents();
        modeloTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Cargar en tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cargar en BBDD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cargar BBDD en excel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)
                        .addGap(31, 31, 31)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        leerExcelTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        leerExcelBBDD();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        leerBBDDExcel();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    public void modeloTabla() {
        modelo = new DefaultTableModel(); // Hay que utilizar modelos.
        
        // A??adimos columnas (con titulo)
        modelo.addColumn("C??digo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        
        tabla.setModel(modelo);
    }
    
    public void leerExcelTabla() {
        
        String[] valores; 
        
        try {
            FileInputStream archivo = new FileInputStream(new File ("./files/leer_datos.xlsx"));
            XSSFWorkbook libro = new XSSFWorkbook(archivo);
            XSSFSheet hoja = libro.getSheetAt(0);
            
            int numFilas = hoja.getLastRowNum();
            
            for (int i=1;i<=numFilas;i++) {
                Row fila = hoja.getRow(i);
                valores = new String[fila.getLastCellNum()];
                for (int j=0; j<fila.getLastCellNum(); j++) {
                    Cell celda = fila.getCell(j);
                    
                    String tipo = celda.getCellTypeEnum().toString();
                    
                    if (tipo.equals("NUMERIC")) {
                        valores[j] = Double.toString(celda.getNumericCellValue());
                    }
                    else if (tipo.equals("STRING")) {
                        valores[j] = celda.getStringCellValue();
                    }
                }
                modelo.addRow(valores);
                System.out.println("");
                
            }
            
        }catch(Exception ex) {
            System.err.println("Error - " + ex);
        }
    }
    
    public void leerExcelBBDD() {
        
        Conexion conn = new Conexion();
        
        Connection conexion = conn.getConnection();
        PreparedStatement ps;
                
        try {
            FileInputStream archivo = new FileInputStream(new File ("./files/leer_datos.xlsx"));
            XSSFWorkbook libro = new XSSFWorkbook(archivo);
            XSSFSheet hoja = libro.getSheetAt(0);
            
            int numFilas = hoja.getLastRowNum();
            
            for (int i=1;i<=numFilas;i++) {
                Row fila = hoja.getRow(i);
                ps = conexion.prepareStatement("INSERT INTO comidas values ('" +
                    fila.getCell(0).getStringCellValue()+ "', '" + fila.getCell(1).getStringCellValue()
                        + "'," + fila.getCell(2).getNumericCellValue()+ "," + fila.getCell(3).getNumericCellValue() + 
                        ")");
                int resultado = ps.executeUpdate();
            
                if (resultado >0) {
                    JOptionPane.showMessageDialog(null, "Registro insertado.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Registro no insertado.");
                }

            }
            conexion.close();
        }catch(Exception ex) {
            System.err.println("Error - " + ex);
        }
    }
    
    public void leerBBDDExcel() {
        Conexion conn = new Conexion();
        
        Connection conexion = conn.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        Workbook libro = new XSSFWorkbook();
        Sheet hoja = libro.createSheet("Hoja1");
        int contador = 1;
        
        String consulta = "SELECT * FROM comidas";
        Row fila = hoja.createRow(0);
        fila.createCell(0).setCellValue("C??digo");
        fila.createCell(1).setCellValue("Nombre");
        fila.createCell(2).setCellValue("Precio");
        fila.createCell(3).setCellValue("Cantidad");
        
        try {
            ps = conexion.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                fila = hoja.createRow(contador);
                fila.createCell(0).setCellValue(rs.getString("codigo"));
                fila.createCell(1).setCellValue(rs.getString("nombre"));
                fila.createCell(2).setCellValue(rs.getDouble("precio"));
                fila.createCell(3).setCellValue(rs.getInt("cantidad"));
                contador++;
            }
            
            FileOutputStream archivo = new FileOutputStream("./files/debbddaexcel.xlsx");
            libro.write(archivo);
            archivo.close();
            JOptionPane.showMessageDialog(null, "Excel creado.");
        } catch(Exception ex) {
            System.err.println("Error - " + ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
