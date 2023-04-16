/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mes {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] mes = {"enero", "febrero", "marzo",
            "abril", "mayo", "junio", "julio", "agosto", "septiembre",
            "octubre", "noviembre", "diciembre"};

        int secreto = (int) (Math.random() * mes.length);
        String mesSecreto = mes[secreto];

        do {
            System.out.println("Adivine el mes secreto. Escriba el mes que crea que sea el correcto");
            String correcto = leer.next();
            if (correcto.equals(mesSecreto)) {
                System.out.println("Es correcto!! :)");

                break;
            } else {
                System.out.println("Incorrecto. Intente nuevamente :(");
            }
        } while (true);

    }
}
