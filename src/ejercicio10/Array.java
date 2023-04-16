/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Array {

    public static void main(String[] args) {

        double[] num1 = new double[50];
        double[] num2 = new double[20];
        
        System.out.println("numeros del primer vector:");
        for (int i = 0; i < 50; i++) {
        num1[i]= (Math.random()*50);
        System.out.print("["+String.format("%.1f", num1[i])+"]");  
        }
        System.out.println(" ");
        
        System.out.println("ordenados: ");
        
        for (int i = 0; i < 50; i++) {
          Arrays.sort(num1);
           System.out.print("["+String.format("%.1f", num1[i])+"]");  
        }
        System.out.println(" ");
        
        System.out.println("los 10 primeros numeros del vector A en vector B:");
        for (int i = 0; i < 10; i++) {
            num2[i]= num1[i]; 
            System.out.print("["+String.format("%.1f", num2[i])+"]");
        }
            for (int i = 0; i < num2.length; i++) {
                num2[i]=0.5;
                 System.out.print("["+String.format("%.1f", num2[i])+"]"); 
            
        }
   
            
        }

        }

    
    


