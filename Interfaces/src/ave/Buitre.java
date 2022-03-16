package ave;

public class Buitre extends Ave {

	private int velocidadVuelo;
	private int peso;

	public Buitre(String sexo, int edad, int velocidadVuelo, int peso) {
		super(sexo, edad);
		this.velocidadVuelo = velocidadVuelo;
		this.peso = peso;
	}

	public int getVelocidadVuelo() {
		return velocidadVuelo;
	}

	public void setVelocidadVuelo(int velocidadVuelo) {
		this.velocidadVuelo = velocidadVuelo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
