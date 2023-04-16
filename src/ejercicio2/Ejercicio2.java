/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia ();
        
        circulo.crearCircunferencia();
        System.out.println("El area es: " + String.format("%.2f", circulo.area()));
        System.out.println("El perimetro es: " +String.format("%.2f", circulo.perimetro()) );
    }
    
}
