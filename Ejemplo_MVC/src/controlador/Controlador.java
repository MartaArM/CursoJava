/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Aplicacion;
import modelo.Conexion;
/**
 *
 * @author marta
 */
public class Controlador implements ActionListener{
    private Aplicacion aplicacion;
    private Conexion modelo;

    public Controlador(Aplicacion aplicacion, Conexion modelo) {
        this.aplicacion = aplicacion;
        this.modelo = modelo;
        aplicacion.bt_sumar.addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(aplicacion.num1.getText());
        int num2 = Integer.parseInt(aplicacion.num2.getText());
        
        modelo.setNum1(num1);
        modelo.setNum2(num2);
        
        int resultado = modelo.add();
        
        aplicacion.resultado.setText(Integer.toString(resultado));
    }
    
    
}
