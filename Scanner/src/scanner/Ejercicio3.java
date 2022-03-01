package scanner;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio3
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el tiempo que ha tardado el atleta :");
		System.out.println("Horas :");
		int horas = teclado.nextInt();
		System.out.println("Minutos :");
		int minutos = teclado.nextInt();
		System.out.println("Segundos :");
		int segundos = teclado.nextInt();
		
		int tiempo = horas*3600+minutos*60+segundos;
		
		System.out.println("El atleta ha realizado la carrera en un total de "+tiempo);
		
		teclado.close();
		

	}

}
