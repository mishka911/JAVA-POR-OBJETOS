/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioExtra6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiceExtra6 {

    Ahorcado ps = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    String palabra;
    String oculta;
    int intentos;
    boolean finish;

    public ServiceExtra6() {

        Random r = new Random();
        int n = r.nextInt(ps.getPalabra().length);
        palabra = ps.getPalabra()[n];
        oculta = generarOculta(palabra.length());
    }

    public void juego() {

        while (!finish) {
            System.out.println("Palabra Oculta: " + oculta);
            System.out.println("Intentos restantes: " + (ps.getMaximas() - intentos));
            System.out.print("Ingrese una letra: ");
            String letra = leer.nextLine().toLowerCase();

            if (letra.length() != 1) {
                System.out.println("Ingrese una letra por favor");
                continue;

            }
            revisarletra(letra);
            if (intentos == ps.getMaximas()) {
                System.out.println("PERDISTE!! La palabra era: " + palabra);
                finish = true;

            } else if (oculta.equals(palabra)) {
                System.out.println("GANASTEEE!! La palaba era: " + palabra);
                finish = true;
            }
        }

        leer.close();
    }

    public String generarOculta(int longitud) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            sb.append("_");

        }

        return sb.toString();
    }

    public void revisarletra(String letra) {
        boolean encontrada = false;
        StringBuilder oculta2 = new StringBuilder(oculta);
        for (int i = 0; i < palabra.length(); i++) {
            if (Character.toString(palabra.charAt(i)).equals(letra)) {
                oculta2.setCharAt(i, letra.charAt(0));
                encontrada = true;

            }
        }

        oculta = oculta2.toString();
        if (!encontrada) {
            intentos++;
            System.out.println("Letra Incorrecta");

        }
    }
}
