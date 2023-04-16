/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioExtra2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiceExtra2 {
    Puntos p1 = new Puntos ();
    Scanner leer = new Scanner (System.in);
    
    
    public void coordenadas(){
        System.out.println("Vamos a calcular la distancia entre los dos puntos mediante el teorema de Pitagoras!!");
        System.out.println("Ingrese las coordenadas del primer punto: ");
        System.out.print("x1: ");
        p1.setX1(leer.nextDouble());
        System.out.print("y1: ");
        p1.setY1(leer.nextDouble());
           System.out.println("Ingrese las coordenadas del segunto punto: ");
        System.out.print("x2: ");
        p1.setX2(leer.nextDouble());
        System.out.print("y2: ");
        p1.setY2(leer.nextDouble());
        
    }
    
    public void pitagoras(){
      double x = p1.getX2()-p1.getX2();
      double y = p1.getY2()-p1.getY1();
      double distancia = Math.sqrt(x*x+ y*y);
      
        System.out.println("la distancia entre los dos puntos es:  " + String.format("%.2f", distancia) );
    }
}
