package juego;



public class JuegoAdivinaPar extends JuegoAdivinaNumero {

	public JuegoAdivinaPar(int vidas) {
		super(vidas);

	}

	@Override
	public boolean validaNumero(int numero) {
		if (numero % 2 == 0) {
			return true;
		}
		System.out.println("Numero Incorrecto debe ser Par.");
		return false;
	}

	@Override
	public void MuestraNombre() {
		System.out.println("Adivina un Numero Par entre 0 y 10");
	}

	@Override
	public void MuestraInfo() {
		System.out.println(
				"Info : Tienes " + getNumeroDeVidas() + " oportunidades para " + "\n" + "acertar dicho Numero");

	}

	@Override
	public void ReiniciaPartida() {
		boolean esNumImpar= false;
		do {
			super.ReiniciaPartida();
			if(getAdivinaNumero()%2==0) {
				esNumImpar = false; 
			}else {
				esNumImpar = true;
			}
		}while(esNumImpar);
	}
}
