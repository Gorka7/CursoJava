package main;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean primo = true;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero=teclado.nextInt();
		
		for (int i=2;i<numero;i++) {
			if(numero % i == 0) {
				primo = false;
				System.out.println("No es Primo");
				break;
			}
			
		}
		if(primo) {
			System.out.println("El numero es Primo");
		}
		
		teclado.close();

	}

}
