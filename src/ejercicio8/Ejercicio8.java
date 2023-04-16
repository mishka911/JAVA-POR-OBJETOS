/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servicio8 s1 = new Servicio8();
       Cadena c1 = new Cadena();
       Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese una frase:");
        c1.setFrase(leer.nextLine());
        
        c1.setLongitud(c1.getFrase().length());
        System.out.println("La frase tiene de vocales: "+ s1.mostrarVocales(c1.getFrase(), c1.getLongitud()));
        s1.invertirFrase(c1.getFrase(), c1.getLongitud());
        System.out.println("ingrese una vocal que este contenida en la frase:");
       s1.vecesRepetido(c1.getFrase(), c1.getLongitud(),leer.next());
       leer.nextLine();
        System.out.println("Ingrese una nueva frase: ");
        s1.compararLongitud(c1.getLongitud(), leer.nextLine());
        s1.unirFrases(c1.getFrase());
        System.out.println("Ingrese el caracter que desea reemplazar la letra a: ");
        s1.reemplazar(leer.next(),c1.getFrase());
        System.out.println(s1.contiene(c1.getFrase()));
    }
    
}
