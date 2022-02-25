package main;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mayor=Integer.MAX_VALUE;
		int menor=Integer.MIN_VALUE;
		int suma=0;
		

		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("De cuantas posiciones quieres el array ?");
		int posiciones = teclado.nextInt();
		
		int[] Numeros = new int [posiciones];
		
		for (int i = 0; i<Numeros.length;i++) {
			
			System.out.println("Introduce un Numero:");
			Numeros[i] = teclado.nextInt();
		
		}
		for (int i = 0; i<Numeros.length;i++) {
			
			if(Numeros[i]>mayor) {
				mayor=Numeros[i];
			}
			if(Numeros[i]>menor) {
				menor=Numeros[i];
			}
			
			System.out.println(Numeros[i]);
			
		}
		
		//Visualizar el Numero Mayor
		
		
		
		
		teclado.close();

	}

}
