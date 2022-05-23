/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BusquedaComboBoxBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marta
 */
public class BusquedaComboBox extends javax.swing.JFrame {

    Conexion conn;
    DefaultComboBoxModel modelo_pais, modelo_comunidad, modelo_ciudad;
    String pais_cb, comunidad_cb, ciudad_cb;
    
    /**
     * Creates new form BusquedaComboBox
     */
    public BusquedaComboBox() {
        modelo_pais = new DefaultComboBoxModel();
        modelo_comunidad = new DefaultComboBoxModel();
        modelo_ciudad = new DefaultComboBoxModel();
        pais_cb = "";
        comunidad_cb = "";
        ciudad_cb = "";
        conn = new Conexion();
        initComponents();
        llenarPais();
    }
    
    private void llenarPais() {
        PreparedStatement ps;
        ResultSet rs = null;
        
        Connection conexion = conn.getConnection();
        String consulta = "select distinct pais from pueblos";
        
        try {
            ps = conexion.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            modelo_pais.addElement("");
            
            while(rs.next()) {
                modelo_pais.addElement(rs.getString("pais"));
            }

            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }
    }
    
    private void llenarComunidad() {
        PreparedStatement ps;
        ResultSet rs = null;
        
        Connection conexion = conn.getConnection();
        String consulta = "";
        
        modelo_comunidad.removeAllElements();
        
        if (cb_pais.getSelectedItem().toString().isEmpty()) {
            consulta = "select distinct comunidad_autonoma from pueblos";
        }
        else {
            consulta = "select distinct comunidad_autonoma from pueblos where pais='" + cb_pais.getSelectedItem().toString() + "'";
        }
        try {
            ps = conexion.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            modelo_comunidad.addElement("");
            
            while(rs.next()) {
                modelo_comunidad.addElement(rs.getString("comunidad_autonoma"));
            }

            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }
    }
    
    
    private void llenarCiudad() {
        PreparedStatement ps;
        ResultSet rs = null;
        
        Connection conexion = conn.getConnection();
        
        String consulta = "";
        String pais, comunidad;
        
        pais = "";
        comunidad = "";
        
        
        if (cb_pais.getSelectedItem() != null)
            pais = cb_pais.getSelectedItem().toString();
        
        if (cb_comunidad.getSelectedItem() != null)
            comunidad = cb_comunidad.getSelectedItem().toString();
        
        if (pais.isEmpty() && comunidad.isEmpty()) {
            consulta = "select distinct ciudad from pueblos";
        }
        else if (pais.isEmpty()) {
            consulta = "select distinct ciudad from pueblos where comunidad_autonoma='" + comunidad + "'";
        }
        else if (comunidad.isEmpty()) {
            consulta = "select distinct ciudad from pueblos where pais='" + pais + "'";
        }
        else {
            consulta = "select distinct ciudad from pueblos where comunidad_autonoma='" + comunidad + "' and pais='" + pais + "'";
        }
        modelo_ciudad.removeAllElements();
        
        try {
            ps = conexion.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            modelo_ciudad.addElement("");
            while(rs.next()) {
                modelo_ciudad.addElement(rs.getString("ciudad"));
            }

            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }
    }
    
    private void llenarTabla(String pais, String comunidad, String ciudad) {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] datos = new String[4];
        modelo.addColumn("Nombre");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Comunidad Autónoma");
        modelo.addColumn("País");
        
        tabla.setModel(modelo);
        
        PreparedStatement ps;
        ResultSet rs = null;
        
        Connection conexion = conn.getConnection();
        String consulta = "";
        
        if (pais.isEmpty() && comunidad.isEmpty() && ciudad.isEmpty()) {
            consulta = "select * from pueblos";
        }
        else if (pais.isEmpty() && comunidad.isEmpty() && !ciudad.isEmpty()) {
            consulta = "select * from pueblos where ciudad='" + ciudad + "'";
        }
        else if (pais.isEmpty() && !comunidad.isEmpty() && ciudad.isEmpty()) {
            consulta = "select * from pueblos where comunidad_autonoma='" + comunidad + "'";
        }
        else if (!pais.isEmpty() && comunidad.isEmpty() && ciudad.isEmpty()) {
            consulta = "select * from pueblos where pais='" + pais + "'";
        }
        else if (!pais.isEmpty() && !comunidad.isEmpty() && ciudad.isEmpty()) {
            consulta = "select * from pueblos where pais='" + pais + "' and comunidad_autonoma='" + comunidad + "'";
        }
        else if (!pais.isEmpty() && comunidad.isEmpty() && !ciudad.isEmpty()) {
            consulta = "select * from pueblos where pais='" + pais + "' and ciudad='" + ciudad + "'";
        }
        else if (pais.isEmpty() && !comunidad.isEmpty() && !ciudad.isEmpty()) {
            consulta = "select * from pueblos where ciudad='" + ciudad + "' and comunidad_autonoma='" + comunidad + "'";
        }
        else {
            consulta = "select * from pueblos where ciudad='" + ciudad + "' and comunidad_autonoma='" + comunidad + "' and pais='" + pais + "'";
        }
    
        try {
            ps = conexion.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            String st = "";
            while(rs.next()) {
                for (int i=0; i<4; i++) {
                    st = rs.getString(i+2);
                    datos[i] = st;
                }
                modelo.addRow(datos);
            }

            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cb_pais = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cb_comunidad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cb_ciudad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb_pais.setModel(modelo_pais);
        cb_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_paisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Pais");

        cb_comunidad.setModel(modelo_comunidad);
        cb_comunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_comunidadActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ciudad");

        cb_ciudad.setModel(modelo_ciudad);
        cb_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ciudadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Comunidad");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Ciudad", "Comunidad Autónoma", "País"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(cb_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cb_pais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cb_comunidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_comunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_paisActionPerformed
        // TODO add your handling code here:
        llenarComunidad();
        llenarCiudad();
        
        if (cb_pais.getSelectedItem() != null)
            pais_cb = cb_pais.getSelectedItem().toString();
        
        llenarTabla(pais_cb, comunidad_cb, ciudad_cb);
    }//GEN-LAST:event_cb_paisActionPerformed

    private void cb_comunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_comunidadActionPerformed
        // TODO add your handling code here:
        llenarCiudad();
        if (cb_comunidad.getSelectedItem() != null)
            comunidad_cb = cb_comunidad.getSelectedItem().toString();
        llenarTabla(pais_cb, comunidad_cb, ciudad_cb);
    }//GEN-LAST:event_cb_comunidadActionPerformed

    private void cb_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ciudadActionPerformed
        // TODO add your handling code here:
        if (cb_ciudad.getSelectedItem() != null)
            ciudad_cb = cb_ciudad.getSelectedItem().toString();
        llenarTabla(pais_cb, comunidad_cb, ciudad_cb);
    }//GEN-LAST:event_cb_ciudadActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_ciudad;
    private javax.swing.JComboBox<String> cb_comunidad;
    private javax.swing.JComboBox<String> cb_pais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
