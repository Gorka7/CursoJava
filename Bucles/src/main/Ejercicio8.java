package main;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int anterior= Integer.MIN_VALUE;
		int numero=Integer.MIN_VALUE; /*5*/
		double resultado =0;
		int contador = 0;
	
		
		do {
			anterior = numero; /*5*/
			System.out.println("Ingrese un numero :");
			/*5*/	numero = teclado.nextInt();
			
			if(numero > anterior) {
				resultado = resultado + numero;
				contador++;
			}
			
		} while (numero>anterior);
			
		System.out.println("La media es : "+resultado/contador);
		
		 
		teclado.close();
	}
	
	

}
