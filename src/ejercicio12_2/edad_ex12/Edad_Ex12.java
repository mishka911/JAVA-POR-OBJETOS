/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12_2.edad_ex12;


import ejercicio12_2.Entidad.PersonaVanesa;
import java.util.Scanner;

/**
 *
 * @author David Z
 */
public class Edad_Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        PersonaVanesa p1 = new PersonaVanesa ();
        
       
       
        p1.crearPersona();
 //        p1.calcularEdad(LocalDate.now());  //siempre devuelve 0
 //       System.out.println("localDate.MIN" + p1.calcularEdad(LocalDate.MIN));  //no devuelve la edad
 //       p1.menorQue(p1.calcularEdad());
        p1.menorQue();
    //p1.mostrarPersona();
        
        
    }
    
}
