/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioExtra1;

/**
 *
 * @author Usuario
 */
public class Clase {
    private String autor;
    private String cancion;

    public Clase() {
    }

    public Clase(String autor, String cancion) {
        this.autor = autor;
        this.cancion = cancion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
    

    @Override
    public String toString() {
        return "{" + "autor: " + autor + ", cancion: " + cancion + '}';
    }
    
    
    
}
