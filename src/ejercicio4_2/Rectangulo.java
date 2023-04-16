/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    Scanner leer = new Scanner (System.in);
    private int altura;
    private int base;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    
    public Rectangulo (){
        
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public void datos (){
        System.out.println("Ingrese la base del rectangulo: ");
        this.base= leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura= leer.nextInt();
    }
    
    public int superficie (){
        return base * altura;
    }
    
    public int perimetro (){
        return (base + altura) * 2;
    }
    
    public void dibujar(){
           for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura - 1 || j == 0 || j == this.base -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
        
}
