/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Persona {

    Scanner leer = new Scanner(System.in);

    private String nombre;
    private int edad;
    private char sexo;
    private int peso;
    private double altura;

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double Altura() {
        return altura;
    }

    public void setAltura( double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        System.out.print("Ingrese su nombre: ");
        this.nombre = leer.next();
        System.out.print("Ingrese su edad: ");
        this.edad = leer.nextInt();
        System.out.print("Ingrese su peso en kg: ");
        peso = leer.nextInt();
        System.out.print("Ingrese su sexo ('H' hombre, 'M' mujer, 'O' otro): ");
        sexo = leer.next().toLowerCase().charAt(0);
        while (sexo != 'h' && sexo != 'm' && sexo != 'o') {
            System.out.println("Error. Ingrese nuevamente el sexo");
            sexo = leer.next().toLowerCase().charAt(0);
        }
        System.out.print("Ingrese su altura en mt: ");
        this.altura = leer.nextDouble();
        System.out.println("__________________________________");

    }
    
    public int calcularIMC (){
        double ideal = (double)peso / (Math.pow(altura,2));
        if (ideal < 20) {
           // System.out.println(nombre+ " esta por debajo del peso ideal");
            return -1;
            
        } else if (ideal >=20 && ideal <= 25 ) {
            //System.out.println(nombre+ " se encuentra en el peso ideal");
            return 0;
        } else {
            //System.out.println(nombre+ " tiene sobrepeso");
            return 1;
            
        }
    }
    
    public boolean MayorDeEdad (){
      
        return  edad >= 18;
    }
}
