package com.mycompany.taller1;

import java.util.Scanner;

public class Taller1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su peso: ");
        double peso = sc.nextDouble();
        
        System.out.println("Ingrese su estatura: ");
        double estatura = sc.nextDouble();
        
        double imc = peso / (estatura * estatura);
        
        System.out.println("Su índice de masa corporal es: " + imc);
        
        if(imc < 18.5) {
            System.out.println("Usted tiene un peso inferior al normal.");
        } else if(imc >= 18.5 && imc < 25) {
            
            System.out.println("Usted tiene un peso normal.");
        } else if(imc >= 25 && imc < 30) {
            
            System.out.println("Usted tiene un peso superior al normal.");
        } else {
            System.out.println("Usted tiene obesidad.");
        }
    }
}