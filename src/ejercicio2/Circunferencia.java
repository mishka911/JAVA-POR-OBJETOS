/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    private double radio;
    Scanner leer = new Scanner (System.in);
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    Circunferencia() {
       
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia: ");
        this.radio= leer.nextDouble();
    }
    
    public double area(){
        return Math.PI*this.radio*this.radio;
    }     
    
    public double perimetro(){
        return 2*Math.PI*this.radio;
    }
}
