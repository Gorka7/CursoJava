package main;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce filas:");
		int filas = teclado.nextInt();

		System.out.println("Introduce columnas:");
		int columnas = teclado.nextInt();
		for (int j = 0; j < filas; j++) {
			for (int i = 0; i < columnas; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		teclado.close();
	}

}
