package main;

import java.util.Scanner;

public class Ejercicio1 {

	static Scanner teclado = new Scanner(System.in);
	// Crear una variable global llamada animal de tipo array de String de seis
	// posiciones
	static String[][] animales = new String[10][6];
	static int contadorAnimales = 0;

	public static void main(String[] args) {
		// Crear una variable opcion de tipo entero
		int opcion = 0;
		// crear un do...while(mientras que opcion sea distinto de 5)
		do {
			// pintar el menu
			System.out.println("1.-Crear animal");
			System.out.println("2.-Ver animal");
			System.out.println("3.-Editar animal");
			System.out.println("4.-Borrar animal");
			System.out.println("5.-Salir");
			// Pedir al usuario que introduzca una opcion y guardarla en la variable opcion
			System.out.println("Insertar una opción");
			opcion = teclado.nextInt();

			// Hacer un switch con la opcion
			switch (opcion) {
			// En caso que sea 1
			case 1:
				// Insertar los datos del animal
				insertarAnimal();
				break;
			// En caso que sea 2
			case 2:
				// Mostrar por consola los datos del array
				for (int i = 0; i < animales.length; i++) {
					for (int j = 0; j < animales[i].length; j++) {
						if (animales[i][j] != null) {
							System.out.print(animales[i][j]);
						}
					}
					System.out.println("");
				}
				break;
			// En caso que sea 3
			case 3:
				System.out.println("Introduce una fila a Modificar");
				int filamodificar = teclado.nextInt();
				editarAnimal(filamodificar);
				break;
			// En caso que sea 4
			case 4:
				System.out.println("Introduce una fila a Borrar");
				int filaborrar = teclado.nextInt();
				for (int j = 0; j < animales[filaborrar].length; j++) {
					animales[filaborrar][j]=null;
				}
				break;
			case 5:
				System.out.println("**Fin**");
				break;
			default:
				System.out.println("Introduce un numero entre el 1 y el 5");
			}

		} while (opcion != 5);

		teclado.close();

	}

	// [visibilidad] [modificadores] tipoDeRetorno nombreDelMetodo ([parametro1],
	// [parametro2]... [parametroN])
	public static void insertarAnimal() {
		System.out.println("Nombre:");
		animales[contadorAnimales][0] = teclado.next();
		System.out.println("Tipo de animal");
		animales[contadorAnimales][1] = teclado.next();
		System.out.println("Raza");
		animales[contadorAnimales][2] = teclado.next();
		System.out.println("Color");
		animales[contadorAnimales][3] = teclado.next();
		System.out.println("Nombre del dueño");
		animales[contadorAnimales][4] = teclado.next();
		System.out.println("Fecha nacimiento");
		animales[contadorAnimales][5] = teclado.next();

		contadorAnimales++;
	}

	private static void editarAnimal(int fila) {
		System.out.println("Nombre:");
		animales[fila][0] = teclado.next();
		System.out.println("Tipo de animal");
		animales[fila][1] = teclado.next();
		System.out.println("Raza");
		animales[fila][2] = teclado.next();
		System.out.println("Color");
		animales[fila][3] = teclado.next();
		System.out.println("Nombre del dueño");
		animales[fila][4] = teclado.next();
		System.out.println("Fecha nacimiento");
		animales[fila][5] = teclado.next();

		contadorAnimales++;
	}

}
