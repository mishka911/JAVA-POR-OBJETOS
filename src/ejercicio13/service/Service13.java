/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13.service;

import ejercicio13.Curso;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Service13 {

    Curso c1 = new Curso();
    Scanner leer = new Scanner(System.in);

//    método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.
    
    public void cargarAlumnos() {
        System.out.println("Ingrese los nombres de los alumnos");

        for (int i = 0; i < c1.getAlumnos().length; i++) {
            System.out.println("Ingrese Alumno" + (i + 1) + ": ");

            c1.getAlumnos()[i] = leer.next();
        }
    }
    
//    Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos
    
    public void crearCurso(){
        System.out.println("Ingrese el nombre del curso: ");
        c1.setCurso(leer.nextLine());
        System.out.println("Ingrese la cantidad horas por dia: ");
        c1.setHoras(leer.nextDouble());
        System.out.println("Ingrese la cantidad de dias por semana: ");
        c1.setSemanas(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el turno: ");
        c1.setTurno(leer.nextLine());
        System.out.println("Ingrese el precio por hora: ");
        c1.setPrecioPorhora(leer.nextDouble());
        cargarAlumnos();
    }
    
//    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.
    
    public void calcularGananciaSemanal(){
        System.out.println("el valor total es: "+String.format("%.2f",c1.getHoras()*c1.getPrecioPorhora()*c1.getSemanas()*5)+" dolares");
    }
}
