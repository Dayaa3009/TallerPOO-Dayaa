package com.mycompany.taller8;

import java.util.Scanner;

public class Taller8 {
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        char input;

        do {
            System.out.print("Introduzca un caracter (o un espacio para salir): ");
            input = sc.next().charAt(0);

            if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'
                    || input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
                System.out.println("VOCAL");
            } else if (input != ' ') {
                System.out.println("NO VOCAL");
            }

        } while (input != ' ');

        System.out.println("Programa finalizado.");
    }
}