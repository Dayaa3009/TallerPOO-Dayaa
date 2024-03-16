package com.mycompany.taller9;

import java.util.Scanner;

public class Taller9 {
    
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese valor: ");
                
                var valor = teclado.nextInt();
                
     		//Si pensamos en el cuadrado como una tabla de asteriscos,
		// el primer bucle crearía las FILAS//
		 // y el segundo las COLUMNAS//
		for (int fila = 1; fila <= valor; fila++) {
			for (int columna = 1; columna <= valor; columna++)
				System.out.print("*");
			
			System.out.println();//Salto de línea para pasar a la siguiente FILA
		}

	}

}


    