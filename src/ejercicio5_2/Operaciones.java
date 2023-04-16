/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operaciones {

    Cuenta op1 = new Cuenta();
    Scanner leer = new Scanner(System.in);
    
    public void cuenta() {
        System.out.println("Ingrese su numero de cuenta: ");
        op1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su numero de DNI: ");
        op1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese su saldo actual: ");
        op1.setSaldoActual(leer.nextInt());
    }
    
    public void ingresar() {
        System.out.println("Ingrese el monto que quiere ingresar: ");
        op1.setSaldoActual((int) (op1.getSaldoActual()+leer.nextDouble()));
        System.out.println("Su actual es de: " + op1.getSaldoActual());
    }
    
    public void retirar() {
        System.out.println("Ingrese el monto que va a retirar: ");
        double retiro = leer.nextDouble();
        if (retiro <= op1.getSaldoActual()) {
        op1.setSaldoActual((int) (op1.getSaldoActual() - retiro));
            System.out.println("Su saldo actual es de: " +op1.getSaldoActual());
   
        } else {
            op1.setSaldoActual(0);
        }
    }
    
        public void extraccionRapido(){
            System.out.println("Recuerde que solo puede retirar maximo el 20%");
            System.out.println("Saldo a retirar: ");
            double retiro1 = leer.nextDouble();
            if (retiro1 <= op1.getSaldoActual()*0.2) {
                op1.setSaldoActual((int) (op1.getSaldoActual()-retiro1));
   
            } else {
                System.out.println("Su retiro supera el 20%");
            }
               System.out.println("Su saldo actual es de: " +op1.getSaldoActual());  
            }
        
        public void consultarSaldo(){
           System.out.println("Su saldo actual es de: " +op1.getSaldoActual()); 
        }
        public void consultarDatos(){
            System.out.println("Su numero de cuenta es: " + op1.getNumeroCuenta());
            System.out.println("Su numero de DNI es: " +op1.getDniCliente());
            
        }
        }
            
        
    



