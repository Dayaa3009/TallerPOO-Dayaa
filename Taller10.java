package com.mycompany.taller10;

import java.util.Scanner;

public class Taller10 {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int totalSum = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = scanner.nextInt();
            totalSum += numero;
        }

        System.out.println("La suma total de los 15 números es: " + totalSum);
    }
   
    }