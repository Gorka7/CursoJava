package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int n1 = teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		int n2 = teclado.nextInt();
		
		int resultadoSuma = suma(n1,n2);
		System.out.println(resultadoSuma);
		
		teclado.close();
	}
	
	public static int suma(int numero1 , int numero2) {
		int resultado = numero1+numero2;
		return resultado;
		//si devuelves return puedes acceder a esa variable en los otros metodos
		
	}

}
