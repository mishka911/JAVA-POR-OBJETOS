/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author Usuario
 */
public class Curso {
    
    private String curso;
    private double horas;
    private int semanas;
    private String turno;
    private double precioPorhora;
    private String[] alumnos= new String [5];

    public Curso() {
    }

    public Curso(String curso, double horas, int semanas, String turno, double precioPorhora) {
        this.curso = curso;
        this.horas = horas;
        this.semanas = semanas;
        this.turno = turno;
        this.precioPorhora = precioPorhora;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorhora() {
        return precioPorhora;
    }

    public void setPrecioPorhora(double precioPorhora) {
        this.precioPorhora = precioPorhora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
}
