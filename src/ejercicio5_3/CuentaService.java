package service;

import models.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class CuentaService {
    private List<Cuenta> cuentas = new ArrayList<>();

    public CuentaService() {
        cuentas.add(new Cuenta(1, 301971495, 1000));
        cuentas.add(new Cuenta(2, 401749817, 2000));
    }

    public void crearCuenta(int numeroCuenta, long dniCliente) {
        Cuenta cuenta = new Cuenta(numeroCuenta, dniCliente);
        cuentas.add(cuenta);
        System.out.println("cuenta: " + numeroCuenta + " creada con exito...");
    }

    public void ingresarSaldo(int numeroCuentaVerificar, double deposito) {
        Cuenta cuenta = verificarCuenta(numeroCuentaVerificar);
        if (cuenta == null) {
            System.out.println("cuenta no encontrada: ");
            return;
        }
        cuenta.setSaldoActual((int) (cuenta.getSaldoActual() + deposito));
        System.out.println("saldo actualizado");
    }

    public void retirarDinero(int numeroCuentaVerificar, int retiro) {
        Cuenta cuenta = verificarCuenta(numeroCuentaVerificar);
        if (cuenta == null) {
            System.out.println("cuenta no encontrada: ");
            return;
        }
        if (retiro < cuenta.getSaldoActual()) {
            System.out.println("retire su dinero por favor: ");
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        } else {
            System.out.println("saldo insuficiente se le entregara todo el dinero disponible en su cuenta");
            cuenta.setSaldoActual(0);
        }

    }

    public void retirarRapido(int numeroCuentaVerificar, int retiroRapido) {
        Cuenta cuenta = verificarCuenta(numeroCuentaVerificar);
        double porcentajeMinimo = 0.20;
        if (cuenta == null) {
            System.out.println("cuenta no encontrada: ");
            return;
        }
        if (retiroRapido < (cuenta.getSaldoActual() * porcentajeMinimo)) {
            System.out.println("retire su dinero por favor: ");
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiroRapido);
        } else {
            System.out.println("No se puede retirar mas del 20% del total de su saldo...");
        }


    }

    public void consultarSaldo(int numeroCuentaVerificar) {
        Cuenta cuenta = verificarCuenta(numeroCuentaVerificar);
        if (cuenta == null) {
            System.out.println("cuenta no encontrada");
            return;
        }
        System.out.println("su saldo Actual es: " + cuenta.getSaldoActual());
    }

    public void consultarDatos(int numeroCuentaVerificar) {
        for (Cuenta cuenta : this.cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuentaVerificar) {
                System.out.println(cuenta);
            }
        }
    }

    public Cuenta verificarCuenta(int numeroCuentaVerificar) {
        Cuenta cuentaEncontrada = null;
        for (Cuenta cuenta : this.cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuentaVerificar) {
                System.out.println("cuenta encontrada...");
                cuentaEncontrada = cuenta;
                break;
            }
        }
        return cuentaEncontrada;
    }

    public void listarCuentas() {
        System.out.println("Aqui estan todas las cuentas del banco...");
        for (Cuenta cuenta : this.cuentas) {
            System.out.println(cuenta.toString());
        }
    }

}
