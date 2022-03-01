package main;
import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int j = i++; //j = 1, i = 2;
		 * int k = ++i; //k = 3, i = 3;
		 */
		//For para hacer Indice,Array (inicicalización,condicion,actualización) 0..N
		for (int i=0;i < 10;i++) {
			System.out.println(i);		
		}
		//While Con Formato For
		int i=0;
		while(i<10) {
			System.out.println(i);
		i++;
		}

		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		//While(condicion) 0,N.... 
		while (numero >=0) {
			System.out.println("Introduce un Numero :");
			numero = teclado.nextInt();
			System.out.println(numero);
		}
		
		//
		int numero2=0;
		do {
			System.out.println("Introduce un Numero :");
			numero2 = teclado.nextInt();
			System.out.println(numero2);
			
		} while (numero2 >=0);
		
		teclado.close();
	}

}
