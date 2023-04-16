/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad.java.Entidad;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
// import org.joda.time.*;

/**
 *
 * @author dzper
 * @date 30-03-2023
 */


public class Persona {
    private String nombre;
    private Date fecNacimiento;
    private int edad;
    
    public Persona() {
    }
    
    public Persona(String nombre, Date fecNacimiento) {
        this.nombre = nombre;
        this.fecNacimiento = fecNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
        this.edad = calcularEdad();
    }

    public int getEdad() {
        return edad;
    }

    public void crearPersona() throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenas tardes");
        System.out.println("Escriba el nombre de la persona");
        this.nombre = sc.nextLine();
        // this.nombre = "Dudecito Perez";
        System.out.println("Escriba su fecha de nacimiento (AAAA-MM-DD)");
        String fechaString = sc.next();
        // String fechaString = "1999-04-05";
        this.fecNacimiento = convertirFecha(fechaString);
        this.edad = calcularEdad();
    }
    
    private Date convertirFecha(String fechaString) throws ParseException{
        LocalDate fecha = LocalDate.parse(fechaString);
        return toDate(fecha);
    }
    
    public void imprimirPersona(){
        System.out.println("******** Imprimiendo datos *********");
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Fecha de Nacimiento : " + toLocalDate(this.fecNacimiento));
        System.out.println("Edad : " + this.edad);
        System.out.println("********* fin de Impresión *********");
    }
    
    private LocalDate toLocalDate (Date fecha){
        return fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    private Date toDate (LocalDate fecha){
        return Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
    private int calcularEdad(){
//      Years.yearsBetween(LocalDate.now(), toLocalDate(this.fecNacimiento)).getYears();
        return Period.between(toLocalDate(this.fecNacimiento), LocalDate.now()).getYears();
    }
    
    public boolean menorQue(int compEdad){
        edad = calcularEdad();
        if (edad < compEdad)
            return true;
        else
            return false;
    }
}
