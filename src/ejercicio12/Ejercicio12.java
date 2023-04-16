/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Persona p1 = new Persona ();
       
        
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.next());
       p1.crearPersona();
       p1.calcularEdad(LocalDate.now());
       p1.menorQue(p1.calcularEdad(LocalDate.MIN));
        
    }
    
}
