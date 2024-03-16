package com.mycompany.taller5;

import java.util.Scanner;

public class Taller5 {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();
            
            System.out.print("Ingrese sus ingresos mensuales: ");
            double ingresos = sc.nextDouble();
            
            if (edad >= 16 && ingresos >= 1000) {
                System.out.println("Tiene que tributar.");
            } else {
                System.out.println("No tiene que tributar.");
            }   }
}
}