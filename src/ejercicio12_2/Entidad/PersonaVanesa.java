/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12_2.Entidad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author David Z
 */
public class PersonaVanesa {
    private String nombre;
    private Date fechaNacimiento;
    private int edad;
    public PersonaVanesa() {
    }

    public PersonaVanesa(String nombre, Date fechaNacimiento) {
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
        edad = (int)calcularEdad(this.fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
    }
    
        public void crearPersona () {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese su nombre");
         nombre= leer.nextLine();
        System.out.print("Ingrese su fecha de nacimiento en formato AAA-MM-DD: ");
        String fechaNacimiento1 = leer.nextLine();               
        LocalDate fecha = LocalDate.parse(fechaNacimiento1);
        long Edad= calcularEdad(fecha);
        System.out.println("su edad es de " + Edad + " años.");
        this.edad = (int)Edad;
        LocalDate fechaNacimiento = null;
        
        }
        
  
    private long calcularEdad (LocalDate fecha) {       //metodo privado
        LocalDate fechaActual = LocalDate.now();
       // System.out.println("calcular edad " + ChronoUnit.YEARS.between(fecha, fechaActual));
        return ChronoUnit.YEARS.between(fecha, fechaActual);
    }
    
    public boolean menorQue (){
        if (this.edad < 18) {  
            System.out.println("es menor de edad");  
        } else{
            System.out.println("es mayor de edad");
           
        }
      return  false;  
    }

public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
}
    
    
    
}