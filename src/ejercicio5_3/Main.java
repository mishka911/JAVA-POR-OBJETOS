
import service.CuentaService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CuentaService cuentaService = new CuentaService();
        int opcion;

        do {
            int numeroCuentaVerifcar;
            opcion = imprimirmenu();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero de cuenta: ");
                    int numeroCuenta = read.nextInt();
                    System.out.println("Ingrese el dni...");
                    long dniCliente = read.nextLong();
                    cuentaService.crearCuenta(numeroCuenta, dniCliente);
                    break;
                case 2:
                    System.out.println("Ingrese el numero de cuenta al que desea depositar: ");
                    numeroCuentaVerifcar = read.nextInt();
                    System.out.println("Ingrese el valor del deposito: ");
                    double deposito = read.nextDouble();
                    cuentaService.ingresarSaldo(numeroCuentaVerifcar, deposito);
                    break;
                case 3:
                    System.out.println("Ingrese el numero de cuenta de la cual desea retirar: ");
                    numeroCuentaVerifcar = read.nextInt();
                    System.out.println("Ingrese el valor del retiro: ");
                    int retiro = read.nextInt();
                    cuentaService.retirarDinero(numeroCuentaVerifcar, retiro);
                    break;
                case 4:
                    System.out.println("Ingrese el numero de cuenta de la cual desea hacer un retiro rápido: ");
                    numeroCuentaVerifcar = read.nextInt();
                    System.out.println("Ingrese el valor del retiro: ");
                    int retiroRapido = read.nextInt();
                    cuentaService.retirarRapido(numeroCuentaVerifcar, retiroRapido);
                    break;
                case 5:
                    System.out.println("Ingrese el numero de cuenta de la cual desea saber el saldo Actual: ");
                    numeroCuentaVerifcar = read.nextInt();
                    cuentaService.consultarSaldo(numeroCuentaVerifcar);
                    break;
                case 6:
                    System.out.println("Ingrese el numero de cuenta para informarle sus datos: ");
                    numeroCuentaVerifcar = read.nextInt();
                    cuentaService.consultarDatos(numeroCuentaVerifcar);
                    break;
                case 7:
                    cuentaService.listarCuentas();
                    break;
                case 8:
                    System.out.println("gracias por usar nuestros servicios...");
                    break;
                default:
                    System.out.println("opcion incorrecta...");

            }

        } while (opcion != 8);


    }

    public static int imprimirmenu() {
        System.out.println("1.- Crear cuenta...");
        System.out.println("2.- Depositar...");
        System.out.println("3.- Retirar...");
        System.out.println("4.- Retiro Rápido...");
        System.out.println("5.- Consultar Saldo...");
        System.out.println("6.- Consultar Datos de Cuenta...");
        System.out.println("7.- Mostrar todas las cuentas...");
        System.out.println("8. Salir...");
        System.out.println("Por favor ingrese una opción...");
        Scanner read = new Scanner(System.in);
        return read.nextInt();
    }
}