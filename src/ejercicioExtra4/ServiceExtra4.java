/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioExtra4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiceExtra4 {
    
    NIF n1 = new NIF ();
    Scanner leer = new Scanner (System.in);
    
    
//    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
    
    public final char[] CARACTERES = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N',
        'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };
            
    public char calcularLetra(long dni){
        int division = (int) (dni%23);
        
       return CARACTERES[division];   
    } 
    
    
    public void creaNif(){
        System.out.print("ingrese su numero de DNI: ");
        n1.setDni(leer.nextLong());
       n1.setLetra(calcularLetra(n1.getDni()));
      
            
        }
    
    public void mostrar() {
        System.out.printf("%08d-%c", n1.getDni(), n1.getLetra());
        System.out.println(" ");
        
    }
}
    

