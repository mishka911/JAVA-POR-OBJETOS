/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14.service;

import ejercicio14.Movil;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Service14 {
    Movil m1 = new Movil ();
    Scanner leer = new Scanner (System.in);
    
    
//    Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//instanciar un objeto Celular y poder cargarlo en nuestro programa.
    
    public void cargarCelular (){
        System.out.print("Ingrese la marca del celular: ");
        m1.setMarca(leer.nextLine());
        System.out.print("Ingrese el precio del celular: ");
        m1.setPrecio(leer.nextDouble());
        leer.nextLine();
        System.out.print("Ingrese el modelo del celular: ");
        m1.setModelo(leer.nextLine());
        System.out.print("Ingrese la memoria ram del celular: ");
        m1.setMemoriaRam(leer.nextInt());
        System.out.print("Ingrese el almacenamiento del celular: ");
        m1.setAlmacenamiento(leer.nextInt());
        ingresarCodigo ();
       
    }
    
//    Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo
    
    public void ingresarCodigo (){
        System.out.print("Ingrese el codigo del celular: ");
       
       String cadena = leer.next();
               
        for (int i = 0; i < m1.getCodigo().length; i++) {
          m1.getCodigo()[i] =  Integer.parseInt(cadena.substring(i, i + 1)); 
            
        }
    }
    
    public void imprimirCelular(){
       
        System.out.println( m1.toString());
    }
    
}
