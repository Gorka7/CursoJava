package main;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String[] ListaNombres = new String [3];
		
		System.out.println("Introduce un Nombre:");
		ListaNombres[0] = teclado.nextLine();
		
		System.out.println("Introduce un segundo  Nombre:");
		ListaNombres[1] = teclado.nextLine();
		
		System.out.print("Introduce un tercer Nombre:");
		ListaNombres[2] = teclado.nextLine();
	
		for (int i=0; i<ListaNombres.length;i++) {
			System.out.println(ListaNombres[i]);
			
		}
		
		teclado.close();

	}

}
