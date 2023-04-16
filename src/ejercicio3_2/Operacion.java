/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operacion {
    Scanner leer = new Scanner (System.in);
    
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion (){
        
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        System.out.print("Ingrese un numero: ");
        this.numero1= leer.nextDouble();
        System.out.print("Ingrese otro numero: ");
        this.numero2=leer.nextDouble();
    }
    
    public double sumar(){
        return this.numero1 + this.numero2;
    }
    
    public double restar (){
        return numero1 - numero2;
        
    }
    
    public double multiplicar (){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error, la multiplicacion se esta haciendo por cero");
        } else {
            return numero1* numero2;
            
        }
        return 0;
    }
    
        public double dividir (){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error, la division se esta haciendo por cero");
        } else {
            return numero1/ numero2;
            
        }
        return 0;
    }
}
