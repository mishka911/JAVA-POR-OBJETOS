/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_2;

/**
 *
 * @author Usuario
 */
public class Servicio {
    
 // a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor(double num1, double num2){
        System.out.println("El numero mayor es: " + String.format("%.2f", Math.max(num1, num2)));
    }
    
    //  b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
    
    public int calcularPotencia(double num1, double num2){
        System.out.println("El valor del numero mayor elevado por el numero menor es: " );
        return (int) Math.pow(Math.max(num1, num2), Math.min(num1, num2));
    }
    
    // c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    
    public double calcularRaiz (double num1, double num2){
        System.out.println("La raiz cuadrada del numero menor es: ");
        return Math.sqrt(Math.abs(Math.min(num1, num2)));
    }
}
