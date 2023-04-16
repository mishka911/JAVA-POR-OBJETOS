/*
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
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class serviciosCadena {
    
// a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
 
    public int mostrarVocales(String Frase ,int longitud){
        int j = 0;
        for (int i = 0; i < longitud; i++) {
            
            
           switch(Frase.substring(i,i+1)){
               case "a":
                   j++;
                break;   
               case "e":
                   j++;
                   break;
               case "i":
                   j++;
                   break;
               case "o":
                   j++;
                   break;
               case "u":
                   j++;
                   break;       
           } 
        } 
        
        return j ;
    }
   
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void invertirFrase(String frase , int longitud){
        
        for (int i = longitud-1; i >= 0; i--) {
            
            System.out.print(frase.substring(i, i+1));    
        }
        
        System.out.println(" ");
                

    }
    
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. 
    
    public int vecesRepetido(String frase , int longitud,String letra){
        int o = 0;
        for (int i = 0; i < longitud; i++) {
            
            if(frase.substring(i,i+1).equalsIgnoreCase(letra) ){ 
                o++;
            } 
        }
        
        return o;
        
                

    }
    
    
//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
    
    public void compararLongitud(int longitud ,String frase){
        
        int a = frase.length();
        
        if(longitud == a){
            System.out.println("Las dos frases tiene la misma longitud");
        }else{
            System.out.println("Las dos frases tiene distinta longitud");
        }
        
        
    }
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante. 
    
    public void unirFrases(String frase){
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase:");
        
        String frase1 = leer.nextLine();
        
        System.out.println("La nueva frase es :"+frase+" "+frase1);
 
    }
  
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.
    
    public void reemplazar(String letra ,String frase){
        
        
        System.out.println(frase.replace("a",letra));
        
    }
    
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.  
    
    public boolean contiene(String frase){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la letra a buscar");
        String letra = leer.next();
        return frase.contains(letra);
        
    }
    
}
