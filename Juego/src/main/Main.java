package main;


import java.util.Scanner;
import interfaces.Jugable;
import juego.JuegoAdivinaImpar;
import juego.JuegoAdivinaNumero;
import juego.JuegoAdivinaPar;
import juego.JuegoAhorcado;

public class Main {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		boolean volverJugar = false;

		do {
			Jugable juego = EligeJuego();
			juego.MuestraNombre();
			juego.MuestraInfo();
			juego.Jugar();

			String respuesta = "";

			do {
				System.out.println("Quieres volver a jugar (Si/No)");
				respuesta = teclado.next();
			} while (!"Si".equalsIgnoreCase(respuesta) && !"No".equalsIgnoreCase(respuesta));

			if (respuesta.equalsIgnoreCase("Si")) {
				volverJugar = true;
			} else {
				System.out.println("Fin del juego");
				volverJugar = false;
			}

		} while (volverJugar);
	}

	public static Jugable EligeJuego() {

		Jugable resultado = null;

		int juegoSeleccionado = 0;


		JuegoAdivinaNumero adivinaNumero = new JuegoAdivinaNumero(6);
		JuegoAdivinaPar adivinaPar = new JuegoAdivinaPar(6);
		JuegoAdivinaImpar adivinaImpar = new JuegoAdivinaImpar(6);
		JuegoAhorcado ahorcado = new JuegoAhorcado(6, "Gorka");

		Jugable[] juegos = new Jugable[4];
		juegos[0] = adivinaNumero;
		juegos[1] = adivinaPar;
		juegos[2] = adivinaImpar;
		juegos[3] = ahorcado;

		do {
			System.out.println("Elige un Juego: ");
			for (int i = 0; i < juegos.length; i++) {
				System.out.print((i + 1) + ".-");
				juegos[i].MuestraNombre();
			}

			juegoSeleccionado = teclado.nextInt();

			if (juegoSeleccionado > 0 && juegoSeleccionado <= juegos.length) {
				return juegos[juegoSeleccionado - 1];
			}

		} while (juegoSeleccionado <= 0 || juegoSeleccionado > juegos.length);

		return resultado;
	}

}
