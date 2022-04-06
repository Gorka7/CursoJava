package juego;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero  {

	public JuegoAdivinaImpar(int vidas) {
		super(vidas);
	}

	@Override
	public boolean validaNumero(int numero) {
		if (numero % 2 != 0) {
			return true;
		}
		System.out.println("Numero Incorrecto debe ser ImPar");
		return false;
	}
	
	@Override
	public void MuestraNombre() {
		System.out.println("Adivina un Numero Impar entre 0 y 10.");
	}

	@Override
	public void MuestraInfo() {
		System.out.println("Info : Tienes "+getNumeroDeVidas()+" oportunidades para "+"\n"+"acertar dicho Numero");

	}
	
	@Override
	public void ReiniciaPartida() {
		boolean esNumPar= false;
		do {
			super.ReiniciaPartida();
			if(getAdivinaNumero()%2==0) {
				esNumPar = true; 
			}else {
				esNumPar = false;
			}
		}while(esNumPar);

	}
}
