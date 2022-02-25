package scanner;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce Numero 1 :");
		int numero1 = teclado.nextInt();
		System.out.println("Introduce Numero 2 :");
		int numero2 = teclado.nextInt();
		System.out.println("Introduce un operador: (+,-,*,/,%)");
		String operador = teclado.next();
		
		//Con If
		/*if (operador.equals("+")) {
			System.out.println("Resultado = "+numero1+numero2);
			}else if(operador.equals("-")) {
				System.out.println("Resultado = "+(numero1-numero2));
					}else if(operador.equals("*")) {
					  System.out.println("Resultado = "+numero1*numero2);
						}else if(operador.equals("/")) {
					       System.out.println("Resultado = "+numero1/numero2);
							}else if(operador.equals("%")) {
								System.out.println("Resultado = "+numero1%numero2);
								}else {
									System.out.println("Operador No Valido");
								}*/
		//Con Switch
		switch (operador) {
		case "+": {
			System.out.println("Resultado = "+numero1+numero2);
			break;
		}case "-": {
			System.out.println("Resultado = "+(numero1-numero2));
			break;
		}case "*": {
			System.out.println("Resultado = "+numero1*numero2);
			break;
		}case "/": {
			System.out.println("Resultado = "+numero1/numero2);
			break;
		}case "%": {
			System.out.println("Resultado = "+numero1%numero2);
			break;
		}default:
			System.out.println("Operador No Valido");
		
		}
		
		teclado.close();
	}

}
