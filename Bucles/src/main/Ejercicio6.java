package main;


import java.util.Scanner;


public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un Numero :");
		int numero = teclado.nextInt();

		int factorial=1;
		System.out.print("!"+numero+" = ");

		for (int i =1; i<=numero;i++) {
			
			if(numero == i) {
				System.out.print(i);
			}else {
				System.out.print(i+"*");
			}
	
			factorial=factorial*i;
			 
		}
		System.out.println(" = "+factorial);

		teclado.close();
	}

}
