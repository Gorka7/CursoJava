package main;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] animal = new String[6];
		Scanner teclado = new Scanner(System.in);

		int opcion = 0;

		do {
			System.out.println("Seleccione una opción");
			System.out.println("1.Crear Animal");
			System.out.println("2.Ver Animal");
			System.out.println("3.Editar Animal");
			System.out.println("4.Borrar Animal");
			System.out.println("5.Salir");
			System.out.println("Inserte una Opción");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1: {
				System.out.println("*Nombre del Animal*");
				animal[0] = teclado.next();
				System.out.println("Tipo del Animal");
				animal[1] = teclado.next();
				System.out.println("Raza del Animal");
				animal[2] = teclado.next();
				System.out.println("Color del Animal");
				animal[3] = teclado.next();
				System.out.println("Nombre del Dueño");
				animal[4] = teclado.next();
				System.out.println("Fecha de Nacimiento");
				animal[5] = teclado.next();
				break;
			}
			case 2: {
				for (int i = 0; i < animal.length; i++) {
					System.out.println(animal[i]);
				}
				break;
			}case 3:{
				System.out.println("**Introuce los datos del Animal**");
				System.out.println("*Nombre del Animal*");
				animal[0] = teclado.next();
				System.out.println("Tipo del Animal");
				animal[1] = teclado.next();
				System.out.println("Raza del Animal");
				animal[2] = teclado.next();
				System.out.println("Color del Animal");
				animal[3] = teclado.next();
				System.out.println("Nombre del Dueño");
				animal[4] = teclado.next();
				System.out.println("Fecha de Nacimiento");
				animal[5] = teclado.next();
				break;
			}case 4:{
				for (int i=0; i<animal.length;i++) {
					animal[i] = null;
				
				}
				break;
			}case 5:{
				System.out.println("**Fin**");
				
			}
			default:
				System.out.println("Introduce un Numero del 1 al 5");
		}

		} while (opcion != 5);

		teclado.close();

	}

}
