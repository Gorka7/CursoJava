package main;


import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int[] Numeros = new int [10];
		
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
