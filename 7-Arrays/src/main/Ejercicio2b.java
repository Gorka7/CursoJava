package main;

import java.util.Scanner;

public class Ejercicio2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("De cuantas posiciones quieres el array ?");
				int posiciones = teclado.nextInt();
				
				int[] Numeros = new int [posiciones];
				
				for (int i = 0; i<Numeros.length;i++) {
					
					System.out.println("Introduce un Numero:");
					Numeros[i] = teclado.nextInt();
				}
				for (int i = 0; i<Numeros.length;i++) {
					System.out.println(Numeros[i]);
				}
				
				teclado.close();
	}

}
