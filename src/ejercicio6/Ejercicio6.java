/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
   Mediciones coffe = new Mediciones ();
   coffe.llenarCafetera();
   coffe.sevirTaza();
   coffe.vaciarCafetera();
   coffe.agregarCafe();
    }
    
}
