/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;


/**
 *
 * @author Usuario
 */
public class Version2 {

    public static void main(String[] args) {
        Persona[] humano = new Persona[4];
        Persona humano1 = new Persona();
        int mayores = 0, menores = 0, pordebajo = 0, ideal = 0, sobrepeso = 0;

        for (int i = 0; i < 4; i++) {
            humano[i] = new Persona();
            humano[i].crearPersona();

        }
        for (int i = 0; i < 4; i++) {
          
            if (humano[i].calcularIMC() == -1) {
                pordebajo++;
            } else if (humano[i].calcularIMC() == 0) {
                ideal++;
            } else {
                sobrepeso++;
            }

        }
        for (int i = 0; i < 4; i++) {
            if (humano[i].MayorDeEdad() == true) {
                mayores++;
                // System.out.println("es mayor de edad");

            } else {
                menores++;
                //System.out.println("es menor de edad");
            }

        }
        
        System.out.println("__________________________________");
        
        System.out.println(pordebajo + " por debajo");
        System.out.println(ideal + " ideal");
        System.out.println(sobrepeso + " sobrepeso");
        System.out.println(mayores + " son mayores de edad");
        System.out.println(menores + " son menores de edad");

        System.out.println("__________________________________");
        
        System.out.println((pordebajo*25) + " % estan por debajo");
        System.out.println((ideal*25) + " % estan en el ideal");
        System.out.println((sobrepeso*25) + " % estan con sobrepeso");
        System.out.println((mayores*25) + " % son mayores de edad");
        System.out.println((menores*25) + " % son menores de edad");
    }
}
