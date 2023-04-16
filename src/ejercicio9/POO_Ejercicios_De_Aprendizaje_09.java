/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio9;


/**
 *
 * @author erik_
 */
public class POO_Ejercicios_De_Aprendizaje_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematica M1 = new Matematica();
        ServiciosMatematicas S1 = new ServiciosMatematicas();
        
        M1.setNum1(Math.random()*10);
        System.out.println("El numero 1 es : "+String.format("%.2f", M1.getNum1()));
        M1.setNum2(Math.random()*10);
        System.out.println("El numero 2 es : "+String.format("%.2f", M1.getNum2()));
        S1.devolverMayor(M1.getNum1(),M1.getNum2());
        System.out.println(S1.calcularPotencia(M1.getNum1(), M1.getNum2()));
        System.out.println("La raiz del numero menor es: ");
        System.out.println(S1.calcularRaiz(M1.getNum1(), M1.getNum2()));
        

    }
    
}
