package ave;

import intefaces.Hablador;

public class Piolin extends Ave implements Hablador {

	private String canta;
	private int numeroPeliculas;

	public Piolin(String sexo, int edad, String canta, int numeroPeliculas) {
		super(sexo, edad);
		this.canta = canta;
		this.numeroPeliculas = numeroPeliculas;
	}

	public String getCanta() {
		return canta;
	}

	public void setCanta(String canta) {
		this.canta = canta;
	}

	public int getNumeroPeliculas() {
		return numeroPeliculas;
	}

	public void setNumeroPeliculas(int numeroPeliculas) {
		this.numeroPeliculas = numeroPeliculas;
	}

	@Override
	public void hablar() {
		System.out.println("Hola soy una Piolin y se hablar");
		System.out.print("Sexo: " + getSexo());
		System.out.println(" Edad :" + getEdad());
		System.out.print("Canta: " + canta);
		System.out.println(" Nº Peliculas: " + numeroPeliculas);
		System.out.println("");

	}

}
