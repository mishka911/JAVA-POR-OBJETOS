/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_2;

/**
 *
 * @author Usuario
 */
public class Ejercicio3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Operacion op = new Operacion ();
       op.crearOperacion();
        System.out.println("la suma entre los dos numeros es: " +String.format("%.2f", op.sumar()));
        System.out.println("la resta entre los dos numeros es: " +String.format("%.2f", op.restar()));
        System.out.println("la multiplicacion entre los dos numeros es: " +String.format("%.2f", op.multiplicar()));
        System.out.println("la division entre dos numeros es: " +String.format("%.2f", op.dividir()));
    }
    
}
