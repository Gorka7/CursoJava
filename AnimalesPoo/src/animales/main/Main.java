package animales.main;

import java.util.Scanner;

import animales.Animal;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	static Animal[] animales = new Animal[10];

	public static void main(String[] args) {

		// Crear una variable opcion de tipo entero
		int opcion = 0;
		// Crear un do...while(mientras que opcion sea distinto de 5)
		do {
			// Pintar el menu
			System.out.println("1.-Crear animal");
			System.out.println("2.-Ver animales");
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
				boolean vacio = true;
				for (int i = 0; i < animales.length; i++) {
					if (animales[i] != null) {
						vacio = false;
						System.out.println(animales[i]);
					}
				}
				if (vacio) {
					System.out.println("No hay animales en el sistema");
				}
				break;
			// En caso que sea 3
			case 3:
				System.out.println("Introduce la fila a modificar:");
				int filaModificar = teclado.nextInt();
				editarAnimal(filaModificar);
				break;
			// En caso que sea 4
			case 4:
				System.out.println("Introduce la fila a borrar:");
				int filaBorrar = teclado.nextInt();

				animales[filaBorrar] = null;

				break;
				// En caso que sea 5
			case 5:
				System.out.println("Fin del Programa");
				break;
				// Y si introduces un numero superior al 5
			default:
				System.out.println("Introduce un numero entre el 1 y el 5");
			}

		} while (opcion != 5);

		teclado.close();

	}

	// [Visibilidad] [Modificadores] TipoDeRetorno NombreDelMetodo ([Parametro1],
	// [Parametro2]...)
	public static void insertarAnimal() {
		Animal animal = new Animal(); // Instanciar

		System.out.println("Nombre:");
		animal.nombre = teclado.next();
		System.out.println("Tipo de animal");
		animal.tipoAnimal = teclado.next();
		System.out.println("Raza");
		animal.raza = teclado.next();
		System.out.println("Color");
		animal.color = teclado.next();
		System.out.println("Nombre del dueño");
		animal.nomDueno = teclado.next();
		System.out.println("Fecha nacimiento");
		animal.fechaNacimiento = teclado.next();

		animales[Animal.numeroAnimalesCreados] = animal;

		Animal.numeroAnimalesCreados++;

	}

	public static void editarAnimal(int fila) {
		Animal animal = new Animal();

		System.out.println("Nombre:");
		animal.nombre = teclado.next();
		System.out.println("Tipo de animal");
		animal.tipoAnimal = teclado.next();
		System.out.println("Raza");
		animal.raza = teclado.next();
		System.out.println("Color");
		animal.color = teclado.next();
		System.out.println("Nombre del dueño");
		animal.nomDueno = teclado.next();
		System.out.println("Fecha nacimiento");
		animal.fechaNacimiento = teclado.next();

		animales[fila] = animal;
	}

}