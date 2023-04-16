/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioExtra6;

/**
 *
 * @author Usuario
 */
public class Ahorcado {
    
    private String [] palabra = {"casa", "gatubela", "yodo", "metallica", "socrates"};
    private int letrasencontradas;
    private int maximas = 6;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasencontradas, int maximas) {
        this.palabra = palabra;
        this.letrasencontradas = letrasencontradas;
        this.maximas = maximas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasencontradas() {
        return letrasencontradas;
    }

    public void setLetrasencontradas(int letrasencontradas) {
        this.letrasencontradas = letrasencontradas;
    }

    public int getMaximas() {
        return maximas;
    }

    public void setMaximas(int maximas) {
        this.maximas = maximas;
    }


    
    
}
