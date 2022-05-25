/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicacion;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author marta
 */
public class Aplicacion extends javax.swing.JFrame {

    int[][] matriz;
    boolean pulsado;
    int numero;
    int aciertos;
    String ultimo_boton;
    JButton ultimo_btn;
    int intentos;
    /**
     * Creates new form Ejercicio10
     */
    public Aplicacion() {
        
        pulsado = false;
        aciertos = 0;
        ultimo_boton = "";
        ultimo_btn = null;
        intentos = 10;
        initComponents();
        iniciarMatriz();
        nombreBotones();
        listenerBotones();
        etiqueta_intentos.setText(Integer.toString(intentos));
    }
    
    private void nombreBotones() {
        boton00.setName("boton00");
        boton01.setName("boton01");
        boton02.setName("boton02");
        boton03.setName("boton03");
        boton10.setName("boton10");
        boton11.setName("boton11");
        boton12.setName("boton12");
        boton13.setName("boton13");
        boton20.setName("boton20");
        boton21.setName("boton21");
        boton22.setName("boton22");
        boton23.setName("boton23");
        boton30.setName("boton30");
        boton31.setName("boton31");
        boton32.setName("boton32");
        boton33.setName("boton33");

    }
    
    private void iniciarMatriz() {
        matriz = new int[4][4];
        Random r = new Random();
        String valores = "1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8";
        List<String> array_valores = new ArrayList<String>(Arrays.asList(valores.split(",")));
        
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                int index = r.nextInt((array_valores.size()-1) + 1);
                matriz[i][j] = Integer.parseInt(array_valores.get(index));
                array_valores.remove(index);
             }
        }
               
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        boton00 = new javax.swing.JButton();
        boton01 = new javax.swing.JButton();
        boton02 = new javax.swing.JButton();
        boton03 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton20 = new javax.swing.JButton();
        boton21 = new javax.swing.JButton();
        boton22 = new javax.swing.JButton();
        boton23 = new javax.swing.JButton();
        boton30 = new javax.swing.JButton();
        boton31 = new javax.swing.JButton();
        boton32 = new javax.swing.JButton();
        boton33 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        etiqueta_intentos = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        boton00.setForeground(new java.awt.Color(240, 240, 240));
        boton00.setAlignmentY(0.0F);
        jPanel1.add(boton00);

        boton01.setAlignmentY(0.0F);
        jPanel1.add(boton01);
        jPanel1.add(boton02);
        jPanel1.add(boton03);
        jPanel1.add(boton10);
        jPanel1.add(boton11);
        jPanel1.add(boton12);
        jPanel1.add(boton13);
        jPanel1.add(boton20);
        jPanel1.add(boton21);
        jPanel1.add(boton22);
        jPanel1.add(boton23);
        jPanel1.add(boton30);
        jPanel1.add(boton31);
        jPanel1.add(boton32);
        jPanel1.add(boton33);

        jLabel1.setText("Intentos:");

        jMenu1.setText("Menú");

        jMenuItem1.setText("Reiniciar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(etiqueta_intentos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etiqueta_intentos, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        reiniciar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void reiniciar() {
        boton00.setIcon(null);
        boton01.setIcon(null);
        boton02.setIcon(null);
        boton03.setIcon(null);
        boton10.setIcon(null);
        boton11.setIcon(null);
        boton12.setIcon(null);
        boton13.setIcon(null);
        boton20.setIcon(null);
        boton21.setIcon(null);
        boton22.setIcon(null);
        boton23.setIcon(null);
        boton30.setIcon(null);
        boton31.setIcon(null);
        boton32.setIcon(null);
        boton33.setIcon(null);
        
        boton00.setEnabled(true);
        boton01.setEnabled(true);
        boton02.setEnabled(true);
        boton03.setEnabled(true);
        boton10.setEnabled(true);
        boton11.setEnabled(true);
        boton12.setEnabled(true);
        boton13.setEnabled(true);
        boton20.setEnabled(true);
        boton21.setEnabled(true);
        boton22.setEnabled(true);
        boton23.setEnabled(true);
        boton30.setEnabled(true);
        boton31.setEnabled(true);
        boton32.setEnabled(true);
        boton33.setEnabled(true);

        iniciarMatriz();
        pulsado = false;
        numero = 0;
        aciertos = 0;
        ultimo_btn = null;
        intentos = 10;
        etiqueta_intentos.setText(Integer.toString(intentos));
    }
    
    private void listenerBotones() {
        MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                String nombre = ((JButton)e.getSource()).getName();
                char char1 = nombre.charAt(nombre.length()-2);
                int num1 = Character.getNumericValue(char1);
                char char2 = nombre.charAt(nombre.length()-1);
                int num2 = Character.getNumericValue(char2);
                int valor = matriz[num1][num2];
                ImageIcon image = new ImageIcon("./src/imagenes/" + Integer.toString(valor) + ".png");
                
                JButton actual = (JButton)e.getSource();
                
                actual.setIcon(image);
                actual.setEnabled(false);                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                String nombre = ((JButton)e.getSource()).getName();
                char char1 = nombre.charAt(nombre.length()-2);
                int num1 = Character.getNumericValue(char1);
                char char2 = nombre.charAt(nombre.length()-1);
                int num2 = Character.getNumericValue(char2);
                int valor = matriz[num1][num2];
                
                JButton actual = (JButton)e.getSource();
        
                if (pulsado) {
                    if (valor == numero) {
                        aciertos++;
                        if (aciertos == 8) {
                            JOptionPane.showMessageDialog(null,"Ha ganado.");
                        }
                    }
                    else {
                        if (intentos == 0) {
                            JOptionPane.showMessageDialog(null, "Ha acabado con los intentos");
                            reiniciar();
                            return;
                        }
                        else {
                            try {
                                TimeUnit.MILLISECONDS.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            ultimo_btn.setEnabled(true);
                            ultimo_btn.setIcon(null);
                            actual.setEnabled(true);
                            actual.setIcon(null);
                            ultimo_btn = null;
                            intentos--;
                            etiqueta_intentos.setText(Integer.toString(intentos));
                        }
                    }
                }
                else {
                    numero = valor;
                    ultimo_btn = (JButton) e.getSource();    
                }


                pulsado = !pulsado;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        
        boton00.addMouseListener(listener);
        boton01.addMouseListener(listener);
        boton02.addMouseListener(listener);
        boton03.addMouseListener(listener);
        boton10.addMouseListener(listener);
        boton11.addMouseListener(listener);
        boton12.addMouseListener(listener);
        boton13.addMouseListener(listener);
        boton20.addMouseListener(listener);
        boton21.addMouseListener(listener);
        boton22.addMouseListener(listener);
        boton23.addMouseListener(listener);
        boton30.addMouseListener(listener);
        boton31.addMouseListener(listener);
        boton32.addMouseListener(listener);
        boton33.addMouseListener(listener);

    }
    
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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton00;
    private javax.swing.JButton boton01;
    private javax.swing.JButton boton02;
    private javax.swing.JButton boton03;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton20;
    private javax.swing.JButton boton21;
    private javax.swing.JButton boton22;
    private javax.swing.JButton boton23;
    private javax.swing.JButton boton30;
    private javax.swing.JButton boton31;
    private javax.swing.JButton boton32;
    private javax.swing.JButton boton33;
    private javax.swing.JLabel etiqueta_intentos;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
