package scanner;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		/*Ejercicio1 //Forma Corta
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el Lado del Cuadrado");
		int lado = teclado.nextInt();
		System.out.println("El perimetro del cuadrado es : " + lado*4);
		System.out.println("El Area del cuadrado es : " + lado*lado);
		teclado.close();*/
		
		//Ejercicio1 //Forma Larga
		Scanner teclado1 = new Scanner (System.in);
		System.out.println("Introduce un Numero :");
		int lado = teclado1.nextInt();
		
		int perimetro = lado * 4;
		int area = lado * lado;
		
		System.out.println("El perimetro es "+ perimetro);
		System.out.println("El area es " + area);
		
		
		teclado1.close();

	}

}
