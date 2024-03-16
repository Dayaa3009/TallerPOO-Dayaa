package com.mycompany.taller6;

import java.util.Scanner;

public class Taller6 {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Bienvenido a la pizzería Bella Napoli");
            System.out.println("¿Desea una pizza vegetariana? (sí/no)");
            String opcion = sc.nextLine();
            
            if (opcion.equalsIgnoreCase("sí")) {
                System.out.println("Ingredientes disponibles: Pimiento y Tofu");
                System.out.println("Elija un ingrediente: ");
                String ingrediente = sc.nextLine();
                System.out.println("Pizza vegetariana con mozzarella, tomate, " + ingrediente);
            } else {
                System.out.println("Ingredientes disponibles: Peperoni, Jamón y Salmón");
                System.out.println("Elija un ingrediente: ");
                String ingrediente = sc.nextLine();
                System.out.println("Pizza no vegetariana con mozzarella, tomate, " + ingrediente);
            }
        }
    }

    }