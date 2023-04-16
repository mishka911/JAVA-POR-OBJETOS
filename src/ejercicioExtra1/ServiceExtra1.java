/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioExtra1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiceExtra1 {
    Clase c1 = new Clase ();
    Scanner leer = new Scanner (System.in);
    
    
    public void cancion(){
        System.out.print("Ingrese el nombre de la cancion: ");
        c1.setCancion(leer.nextLine());
        System.out.print("Ingrese el nombre del autor: ");
        c1.setAutor(leer.nextLine());
    }
    
    public void imprimir(){
        System.out.println(c1.toString());
    }
    
    
}
