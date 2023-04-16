/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import ejercicio13.service.Service13;

/**
 *
 * @author Usuario
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Service13 s1 = new Service13 ();
        
        s1.crearCurso();
        s1.calcularGananciaSemanal();
    }
    
}
