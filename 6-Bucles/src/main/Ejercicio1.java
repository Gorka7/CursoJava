package main;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=0;
		int resultado =0;
		Scanner teclado = new Scanner(System.in);
	
		do {
			
		System.out.println("Introduce un Numero :");
		numero = teclado.nextInt();
		if(numero > 0) {
			resultado = resultado + numero;
		}
		} while (numero >= 0);
			System.out.println(resultado);

		teclado.close();	
	}
	

}
