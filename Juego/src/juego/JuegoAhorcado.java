package juego;

import java.util.Scanner;

import interfaces.Jugable;

public class JuegoAhorcado extends Juego implements Jugable {

	String cadenaAdivinar;

	Scanner teclado = new Scanner(System.in);

	public JuegoAhorcado(int vidas, String Cadena) {
		super(vidas);
		this.cadenaAdivinar = Cadena;

	}

	@Override
	public void Jugar() {
		ReiniciaPartida();
		boolean seguirJugando = false;

		String cadenaOculta = "";

		for (int i = 0; i < cadenaAdivinar.length(); i++) {
			cadenaOculta = cadenaOculta + "-";
		}

		do {
			System.out.println(cadenaOculta);
			System.out.println("Introduce un caracter:");
			String letra = teclado.next();

			boolean existeCaracter = false;
			// Gorka 5
			for (int i = 0; i < cadenaAdivinar.length(); i++) {
				if (cadenaAdivinar.charAt(i) == letra.charAt(0)) {
					cadenaOculta = cadenaOculta.substring(0, i)+ letra+ cadenaOculta.substring(i + 1);
					existeCaracter = true;
					seguirJugando = true;
				}
			}

			if (!existeCaracter) {
				seguirJugando = QuitaVida();
			}

			if (cadenaAdivinar.equals(cadenaOculta)) {
				System.out.println("Has encontrado la palabra oculta: " + cadenaAdivinar);
				System.out.println("Te quedan "+getNumeroDeVidas()+" vidas restantes.");
				seguirJugando = false;
			}
		} while (seguirJugando);

	}

	@Override
	public void MuestraNombre() {
		System.out.println("Juego del Ahorcado.");

	}

	@Override
	public void MuestraInfo() {
		System.out.println("Info : Tines " + getNumeroDeVidas() + " oportunidades para acertar una palabra");
	}

}
