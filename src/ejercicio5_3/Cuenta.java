package models;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Cuenta {

   /* Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
    Las operaciones asociadas a dicha clase son:
    a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
            b) Agregar los métodos getters y setters correspondientes
    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    y se la sumara a saldo actual.
            e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    usuario no saque más del 20%.
    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/

    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual = 0;

    public Cuenta(int numeroCuenta, long dniCliente) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
    }

    public Cuenta() {
    }


    public Cuenta(int numeroCuenta, long dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dni) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", dniCliente=" + dniCliente +
                ", saldoActual=" + saldoActual +
                '}';
    }
}
