package aparato;

import intefaces.Hablador;

public class Tv extends Aparato implements Hablador{
	
	private boolean teletexto;
	private int antiguedad;
	
	public Tv(int consumo, int precio, boolean teletexto, int antiguedad) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.antiguedad = antiguedad;
	}


	public boolean isTeletexto() {
		return teletexto;
	}

	public void setTeletexto(boolean teletexto) {
		this.teletexto = teletexto;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public void hablar() {
		System.out.println("Hola soy una TV y se hablar");
		System.out.print("Consumo: " + getConsumo());
		System.out.println(" Precio:" +getPrecio());
		System.out.print("Teletexto: " + teletexto);
		System.out.println(" Antiguedad: " + antiguedad);
		System.out.println("");
	}

	
	
}
