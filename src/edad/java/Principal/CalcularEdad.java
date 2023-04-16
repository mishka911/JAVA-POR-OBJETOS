/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edad.java.Principal;

import ejercicio12.Persona;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author dzper
 */
public class CalcularEdad {
    public static void main (String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        Persona dude = new Persona();
        dude.crearPersona();
        dude.imprimirPersona();
        System.out.println("ingrese la edad a comparar :");
        int compEdad = sc.nextInt();
        if (dude.menorQue(compEdad))
            System.out.println(dude.getNombre() + " es menor");
        else
            System.out.println(dude.getNombre() + " es por lo menos de igual edad");
    }
}
