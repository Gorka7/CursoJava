package aparato;

import intefaces.Hablador;

public class Radio extends Aparato implements Hablador{

	private boolean cassete;
	private int potencia;

	public Radio(int consumo, int precio, boolean cassete, int potencia) {
		super(consumo, precio);
		this.cassete = cassete;
		this.potencia = potencia;
	}

	public boolean isCassete() {
		return cassete;
	}

	public void setCassete(boolean cassete) {
		this.cassete = cassete;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public void hablar() {
		System.out.println("Hola soy una Radio y se hablar");
		System.out.print("Consumo :" + getConsumo());
		System.out.println(" Precio :"+ getPrecio());
		System.out.print("Cassete :"+cassete);
		System.out.println(" Potencia :"+potencia);
		
	}

}
