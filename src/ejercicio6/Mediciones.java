/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mediciones {

    Cafetera cafe = new Cafetera();
    Scanner leer = new Scanner(System.in);

    public int llenarCafetera() {
        System.out.print("Ingrese la capacidad de la cafetera actualmente en ml: ");
        cafe.setCapacidadActual(leer.nextInt());
        return cafe.getCapacidadMaxima();
    }

    public void sevirTaza() throws InterruptedException {
        System.out.print("Ingrese el tamaño de la taza a servir en cm: ");
        int taza = leer.nextInt();
        Thread.sleep(3000);
        if (taza <= cafe.getCapacidadActual()) {
            cafe.setCapacidadActual((int) (cafe.getCapacidadActual()-taza));
            System.out.println("su taza esta llena");
            System.out.println("lo que queda en la cafetera es: " + cafe.getCapacidadActual()+"ml");
        } else {
                System.out.println("no hay suficiente cafe para llenar su taza");
                System.out.println("en su cafe se le ha servido " + taza + " ml de cafe");
            }

        }
    public void vaciarCafetera() throws InterruptedException{
        System.out.println("vamos a vaciar la cafetera");
        Thread.sleep(3000);
        cafe.setCapacidadActual(0);
        System.out.println("lo que queda en la cafetera es " + cafe.getCapacidadActual() + " ml");
        
    }
    
    public void agregarCafe() throws InterruptedException{
        System.out.print("Ingrese la cantidad de cafe que desea agregar: ");
        int nuevo = leer.nextInt();
        Thread.sleep(3000);
        cafe.setCapacidadActual((int) (cafe.getCapacidadActual()+ nuevo));
        System.out.println("Lo que hay de cafe en la cafetera ahora es " + cafe.getCapacidadActual()+ "ml");
    }

    }


