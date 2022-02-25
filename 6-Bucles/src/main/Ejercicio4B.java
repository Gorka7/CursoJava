package main;
import java.util.Scanner;

public class Ejercicio4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce Filas");
		int filas = teclado.nextInt();
		
		System.out.println("Introduce Columnas");
		int columnas = teclado.nextInt();
		
		for (int j=0 ;j < filas;j++) {
			for (int i=0;i<columnas;i++) {
				if (j == 0) {
				System.out.print("*");
				}else if (j == filas -1) {
					System.out.print("*");
				}else {
					if(i==0) {
					System.out.print("*");
					}else if (i==columnas-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println(" ");
		}
		
		
		teclado.close();

	}

}
