package scanner;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ejercicio2
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escribe el valor en Gragos Celsius :");
		double celsius = teclado.nextDouble();
		
		double farenheit = (celsius*1.8) + 32;
		
		System.out.println("Grados Celsius equivale a "+farenheit);
		teclado.close();*/
		
		
		//Ejercicio con Concionales "If"
		/*Scanner teclado = new Scanner(System.in);
		System.out.println("1.- Cº a Fº");
		System.out.println("2.- Fº a Cº");
		
		int opcion = teclado.nextInt();
		
		double celsius = 0;
		double farenheit = 0;
		
		switch(opcion) {
		
		case 1:
			System.out.println("Introduce los grados Celsius Cº :");
			celsius = teclado.nextDouble();
			
			farenheit = (celsius*1.8) + 32;
			
			System.out.println("Los grados Farenheit son :"+farenheit);
			break;
			
		case 2:	
			System.out.println("Introduce los grados Farenheit Fº :");
			farenheit = teclado.nextDouble();
			
			celsius = (farenheit - 32) / 1.8;
			
			System.out.println("Los grados Celsius son :"+celsius);
			break;
			default:
				System.out.println("Opción no valida");
		}
		
		teclado.close();*/
		
		//Ejercicio con Concionales "If"
		Scanner teclado = new Scanner(System.in);
		System.out.println("1.- Cº a Fº");
		System.out.println("2.- Fº a Cº");
		
		int opcion = teclado.nextInt();
		
		double celsius = 0;
		double farenheit = 0;
		
		if(opcion == 1) {
			System.out.println("Introduce los grados Celsius Cº :");
			celsius = teclado.nextDouble();
			
			farenheit = (celsius*1.8) + 32;
			
			System.out.println("Los grados Farenheit son :"+farenheit);
			
		}else if (opcion == 2) {
			System.out.println("Introduce los grados Farenheit Fº :");
			farenheit = teclado.nextDouble();
			
			celsius = (farenheit - 32) / 1.8;
			
			System.out.println("Los grados Celsius son :"+celsius);
		}else {
			System.out.println("Opción Incorrecta");
		}
		
		teclado.close();
	}
	

}
