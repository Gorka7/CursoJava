package pajaritos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		  
		Scanner teclado = new Scanner(System.in);

		System.out.println("---Introduciendo Por Consola---------------");
		System.out.println("Introduce un Loro : ");
		System.out.println("Introduce su Sexo :");
		String sexo = teclado.next();
		System.out.println("Introduce el Edad");
		int edad = teclado.nextInt();
		System.out.println("Introduce el Nombre del Dueño");
		String nomDueno = teclado.next();
		System.out.println("Introduce el Nombre del Ave");
		String nomAve = teclado.next();
		System.out.println("Introduce el Region");
		String region = teclado.next();
		System.out.println("Introduce el Color");
		String color = teclado.next();

		DatosPersonales datosLoro = new DatosPersonales(nomAve, nomDueno);
		Loro loro1 = new Loro(sexo, edad, datosLoro, region, color);

		System.out.println("----------Introducidos Por Consola---------");
		System.out.println("Sexo : " + loro1.getSexo());
		System.out.println("Edad : " + loro1.getEdad());
		System.out.println("Nombre Ave : " + loro1.getNombres().getNombreAve());
		// System.out.println(loro.getNombres());
		System.out.println("Nombre Dueño : " + loro1.getNombres().getNombreDueno());
		System.out.println("Region : " + loro1.getRegion());
		System.out.println("Color : " + loro1.getColor());
		 
		
		Ave.numeroAvesCreadas();
		
		teclado.close();
		
		
	}

}
