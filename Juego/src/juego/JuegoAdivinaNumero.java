package juego;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable {

	private int adivinaNumero;
	Random random;


	Scanner teclado = new Scanner(System.in);

	public JuegoAdivinaNumero(int vidas) {
		super(vidas);
		random = new Random(Calendar.getInstance().getTimeInMillis());
	}

	@Override
	public void Jugar() {
		ReiniciaPartida();
		boolean seguirJugando = false;

		do {
			System.out.println("Introduce un Numero :");
			int numero = teclado.nextInt();

			if (validaNumero(numero) == true) {
				if (numero == adivinaNumero) {
					System.out.println("Acertaste!!");
					ActualizarRecord();
					seguirJugando = false;
				} else {
					seguirJugando = QuitaVida();
					if (seguirJugando) {
						if (numero > adivinaNumero) {
							System.out.println("El numero a adivinar es menor!");
						} else {
							System.out.println("El numero a adivinar es mayor!");
						}
					}

				}
			} else {
				seguirJugando = true;
			}

		} while (seguirJugando);

	}

	public boolean validaNumero(int numero) {
		return true;
	}

	@Override
	public void MuestraNombre() {
		System.out.println("Adivina un Numero entre 0 y 10.");
	}

	@Override
	public void MuestraInfo() {
		System.out.println(
				"Info : Tienes " + getNumeroDeVidas() + " oportunidades para " + "\n" + "acertar dicho Numero");

	}

	@Override
	public void ReiniciaPartida() {
		adivinaNumero = random.nextInt(10) + 1;
		super.ReiniciaPartida();
	}
	
	public int getAdivinaNumero() {
		return adivinaNumero;
	}

	public void setAdivinaNumero(int adivinaNumero) {
		this.adivinaNumero = adivinaNumero;
	}

}
