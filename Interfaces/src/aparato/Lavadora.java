package aparato;

public class Lavadora extends Aparato{
	
	private int alto,ancho;
	
	
	
	public Lavadora(int consumo, int precio, int alto, int ancho) {
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
	}


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	
	

}
