/*
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número..
 */
package ejercicio9;

/**
 *
 * @author erik_
 */
public class ServiciosMatematicas {
    
// a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    
    public void devolverMayor(double num1,double num2){
        
        System.out.println("El mayor es:"+String.format("%.2f",Math.max(num1, num2)));
        
    }
//  b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.  
    
    public int calcularPotencia(double num1,double num2){
        System.out.println("La potencia del numero mayor elevado al numero menor es :");
        return (int)Math.pow(Math.max(num1, num2), Math.min(num1, num2));  
    }
    
// c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número..   
    
    
    public double calcularRaiz(double num1,double num2){
        
       return Math.sqrt(Math.abs(Math.min(num1, num2)));

    }
    
    
    
}
