package juego;

public abstract class Juego {

	private int numeroDeVidas;
	private int numeroDeVidasInicial;
	private static int record = 0;

	public Juego(int vidas) {
		super();
		this.numeroDeVidas = vidas;
		this.numeroDeVidasInicial = vidas;
	}


	public void muestraVidasRestantes() {
		System.out.println("Le quedan " + numeroDeVidas + " restantes");
	}

	public boolean QuitaVida() {
		numeroDeVidas--;
		if (numeroDeVidas == 0) {
			System.out.println("¡¡Game Over!!");
			return false;
		} else {
			return true;
		}

	}

	public void ReiniciaPartida() {
		numeroDeVidas = numeroDeVidasInicial;
	}

	public void ActualizarRecord() {
		if (numeroDeVidas == record) {
			System.out.println("Ha alcanzado el Record!!");
		} else if (numeroDeVidas > record) {
			record = numeroDeVidas;
			System.out.println("Nuevo Record MUNDIAL!! " + record);
		}
	}
	public int getNumeroDeVidas() {
		return numeroDeVidas;
	}

}
