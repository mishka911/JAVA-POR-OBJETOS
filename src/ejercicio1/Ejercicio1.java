/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
    
    private String ISBN;
    private String titulo;
    private String autor;
    private int paginas;

    public Ejercicio1(String ISBN, String autor, int paginas) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public Ejercicio1(){
        
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void datos (){
      Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el ISBN del libro: ");
        this.ISBN= leer.next();
        System.out.println("Ingrese el titulo del libro: ");
        this.titulo= leer.next();
        System.out.println("Ingrese el autor del libro: ");
        this.autor= leer.next();
        System.out.println("Ingrese el numero de paginas del libro: ");
        this.paginas= leer.nextInt();
        
    }
    
    public void imprimir (){
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Paginas: " + this.paginas);
    }
            
}
