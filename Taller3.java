package com.mycompany.taller3;

import java.util.Scanner;

public class Taller3 {
    
 
    public static void main(String[] args) {
        
// Almacenar la contraseña en una variable
        String contrasena = "dayaa123";

        try ( // Pedir al usuario que ingrese la contraseña
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la contraseña: ");
            String intentoContrasena = scanner.nextLine();
            // Verificar si la contraseña ingresada por el usuario coincide con la almacenada
            if (intentoContrasena.equalsIgnoreCase(contrasena)) {
                System.out.println("¡Contraseña correcta!");
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        }
    }
}