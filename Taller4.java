package com.mycompany.taller4;

import java.util.Scanner;

public class Taller4 {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el día: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año: ");
        int año = sc.nextInt();

        boolean fechaValida = validarFecha(dia, mes);

        if (fechaValida) {
            System.out.println("La fecha ingresada es correcta.");
        } else {
            System.out.println("La fecha ingresada es incorrecta.");
        }
    }

    public static boolean validarFecha(int dia, int mes) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > 31) {
            return false;
        }

        if ((mes ==4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        }

        return !(mes == 2 && dia > 28);
    }
}