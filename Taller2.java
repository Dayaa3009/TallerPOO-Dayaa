package com.mycompany.taller2;

import java.util.Scanner;

public class Taller2 {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entre 0 y 9.999
        System.out.println("Por favor, ingrese un número entre 0 y 9.999: ");
        int numero = sc.nextInt();

        // Validar que el número esté dentro del rango
        if (numero < 0 || numero > 9999) {
            System.out.println("El número ingresado está fuera del rango válido.");
            return;
        }

        // Contar el número de cifras del número ingresado
        int numCifras = String.valueOf(numero).length();

        // Mostrar el resultado
        System.out.println("El número ingresado tiene " + numCifras + " cifras.");
    }
}