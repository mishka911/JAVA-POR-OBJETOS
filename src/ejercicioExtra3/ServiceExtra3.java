/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioExtra3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiceExtra3 {

    Raices r1 = new Raices();
    Scanner leer = new Scanner(System.in);
    double discriminante, x1, x2, x;

//    Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public void getDiscriminante() {
        System.out.println("ingrese los valores de a, b y c");
        System.out.print("a: ");
        r1.setA(leer.nextDouble());
        System.out.print("b: ");
        r1.setB(leer.nextDouble());
        System.out.print("c: ");
        r1.setC(leer.nextDouble());
        discriminante = Math.pow(r1.getB(), 2) - 4 * (r1.getA() * r1.getC());
        System.out.println("el valor del discriminante es " + discriminante);
    }

//    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices() {
        if (discriminante > 0) {
            System.out.println("tiene dos soluciones");
           
            x1 = (-r1.getB() + (Math.sqrt(discriminante)) / (2 * r1.getA()));
                x2 = (-r1.getB() - (Math.sqrt(discriminante)) / (2 * r1.getA()));
                System.out.println("la soluciones son: " + String.format("%.2f", x1) + " y " + String.format("%.2f", x2));
            } else {
              if (discriminante < 0) {
               System.out.println("tiene dos soluciones complejas o imaginarias");  
            }
   
        }

        return false;
    }
//    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.

    public boolean tieneRaiz() {
        if (discriminante == 0) {
            System.out.println("tiene una solucion");
            x = -r1.getB() / (2 * r1.getA());
            System.out.println("la unica solucion es: " + String.format("%.2f", x));
        }

        return false;
    }

// Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//posibles soluciones. 
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.  
}
