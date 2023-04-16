/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_2;

/**
 *
 * @author Usuario
 */
public class Ejercicio4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Rectangulo rec = new Rectangulo ();
      rec.datos();
        System.out.println("La superficie del rectangulo es: " + rec.superficie());
        System.out.println("La altura del rectangulo es: " + rec.perimetro());
        System.out.println("El rectangulo dibujado es: ");
        rec.dibujar();
        
        
    }
    
}
