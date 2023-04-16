/*
 8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio8_2;

import ejercicio8_2.Cadena1;
import ejercicio8_2.serviciosCadena;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class POO_Ejercicios_De_Aprendizaje_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cadena1 C1 = new Cadena1();
        serviciosCadena s1 = new serviciosCadena();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:.");
        
        C1.setFrase(leer.nextLine());
   
        C1.setLongitud(C1.getFrase().length());
        
        System.out.println("La cantidad de vocales encontradas son :"+s1.mostrarVocales(C1.getFrase(),C1.getLongitud()));
        
        s1.invertirFrase(C1.getFrase(),C1.getLongitud());
       
        System.out.println("La letra ingresada se repite "+s1.vecesRepetido(C1.getFrase(),C1.getLongitud(),leer.next())+" veces");
        leer.nextLine();
        System.out.println("Ingrese una nueva frase ");
        s1.compararLongitud(C1.getLongitud(), leer.nextLine());
        s1.unirFrases(C1.getFrase());
        System.out.println("Ingrese el caracter a reemplazar");
        s1.reemplazar(leer.next(), C1.getFrase());
        System.out.println(s1.contiene(C1.getFrase()));
        
    }
    
}
