package ave;

import intefaces.Hablador;

public class Loro extends Ave implements Hablador {

	private String region;
	private String color;

	public Loro(String sexo, int edad, String region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void hablar() {
		System.out.println("Hola soy una Loro y se hablar");
		System.out.print("Sexo: " + getSexo());
		System.out.println(" Edad: " +getEdad());
		System.out.print("Region: " + region);
		System.out.println(" Color: " + color);
		System.out.println("");
		
	}

}
