/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos.Ejercicio6;

/**
 *
 * @author marta
 */
public class Cuenta {
        private String titular;
        private double cantidad;

        public Cuenta(String titular) {
            this.titular = titular;
        }

        public Cuenta(String titular, double cantidad) {
            this.titular = titular;
            this.cantidad = cantidad;
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getCantidad() {
            return cantidad;
        }

        public void setCantidad(double cantidad) {
            this.cantidad = cantidad;
        }
        
        public String toString() {
            return titular + "-" + cantidad;
        }
        
        public boolean ingresar(double cant) {
            boolean ingresado = false;
            if (cant>0) {
                cantidad+=cant;
                ingresado = true;
            }
            
            return ingresado;
        }
        
        public boolean retirar(double cant) {
            double cantidad_restar = cantidad - cant;
            boolean retirado = false;
            
            if (cantidad_restar>0) {
                cantidad = cantidad_restar;
                retirado = true;
            }
            
            return retirado;
        }
    }
