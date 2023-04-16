/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_2;

/**
 *
 * @author Usuario
 */
public class Ejercicio9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Matematica m1 = new Matematica ();
       Servicio s1 = new Servicio ();
       
       m1.setNum1(Math.random()*10);
        System.out.println("El primer numero es: " + String.format("%.2f", m1.getNum1()));
       m1.setNum2(Math.random()*10);
       System.out.println("El segundo numero es: " + String.format("%.2f", m1.getNum2()));
       s1.devolverMayor(m1.getNum1(), m1.getNum2());
        System.out.println(s1.calcularPotencia(m1.getNum1(), m1.getNum2()));
        System.out.println(s1.calcularRaiz(m1.getNum1(), m1.getNum2()));
       
    }
    
}
