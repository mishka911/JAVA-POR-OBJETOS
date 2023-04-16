/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import ejercicio11.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
        public void crearPersona () {
       Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento en formato AAA-MM-DD: ");
        String fechaNacimiento1 = leer.nextLine();
        LocalDate fecha = LocalDate.parse(fechaNacimiento1);
        long Edad= calcularEdad(fecha);
        System.out.println("su edad es de " + Edad + " años.");
        }
        
  
    public long calcularEdad (LocalDate fecha) {
        LocalDate fechaActual = LocalDate.now();
     
        return ChronoUnit.YEARS.between(fecha, fechaActual);
    }
    
    public boolean menorQue (long Edad){
        int menor = 18;
        if (menor <= Edad) {
            
            System.out.println("es menor de edad");  
        } else{
            System.out.println("es mayor de edad");
        }
      return  false;  
    } 

    public void imprimirPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
    
   

