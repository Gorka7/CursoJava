package scanner;

import java.util.Scanner;


public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Ejercicio5
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce Numero 1 :");
		int numero1 = teclado.nextInt();
		System.out.println("Introduce Numero 2 :");
		int numero2 = teclado.nextInt();
		System.out.println("Introduce Numero 3 :");
		int numero3 = teclado.nextInt();
		System.out.println("Introduce Numero 4 :");
		int numero4 = teclado.nextInt();
		System.out.println("Introduce Numero 5 :");
		int numero5 = teclado.nextInt();
		
		//Mayor Version Larga
		/*if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5) {
			System.out.println("El numero "+ numero1+" es el mayor");
			}else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5) {
				System.out.println("El numero "+numero2+" es el mayor");
				}else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5) {
					System.out.println("El numero "+numero3+" es el mayor");
					}else if(numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5) {
						System.out.println("El numero "+numero4+" es el mayor");
						}else if (numero5 > numero1 && numero5 > numero2 && numero5 > numero3 && numero5 > numero4) {
							System.out.println("El numero "+numero5+" es el mayor");
							}else
								System.out.println("Todos los numeros son iguales");*/
		
		//Mayor Version Corta
		int mayor = numero1;
		
		if (numero2 > mayor) {
			mayor = numero2;
		}if (numero3 > mayor) {
			mayor = numero3;
		}if (numero4 > mayor) {
			mayor = numero4;
		}if (numero5 > mayor) {
			mayor = numero5;
		}
		
		System.out.println("El numero "+mayor+" es el mas grande");
		
		
		//Menor Version Larga
				/*if(numero1 < numero2 && numero1 < numero3 && numero1 < numero4 && numero1 < numero5) {
					System.out.println("El numero "+ numero1+" es el menor");
					}else if (numero2 < numero1 && numero2 < numero3 && numero2 < numero4 && numero2 < numero5) {
						System.out.println("El numero "+numero2+" es el menor");
						}else if (numero3 < numero1 && numero3 < numero2 && numero3 < numero4 && numero3 < numero5) {
							System.out.println("El numero "+numero3+" es el menor");
							}else if(numero4 < numero1 && numero4 < numero2 && numero4 < numero3 && numero4 < numero5) {
								System.out.println("El numero "+numero4+" es el menor");
								}else if (numero5 < numero1 && numero5 < numero2 && numero5 < numero3 && numero5 < numero4) {
									System.out.println("El numero "+numero5+" es el menor");
									}else
										System.out.println("Todos los numeros son iguales");*/
		//Menor Version Corta
				int menor = numero1;
				
				if (numero2 < menor) {
					menor = numero2;
				}if (numero3 < menor) {
					menor = numero3;
				}if (numero4 < menor) {
					menor = numero4;
				}if (numero5 < menor) {
					menor = numero5;
				}
				
				System.out.println("El numero "+menor+" es el mas pequeño");
		
		//Media
		double media = (numero1+numero2+numero3+numero4+numero5)/5;
		
		System.out.println("La media de los 5 es :"+media);
		
		
		teclado.close();

	}

}
