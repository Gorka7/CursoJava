package main;

public class Loro extends Ave {

	public String region;
	public String color;

	public Loro(String sexo, int edad, String region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;

	}

	public void deDondeEres() {

		if (region == "N") {
			System.out.println("Norte");
		} else if (region == "S") {
			System.out.println("Sur");
		} else if (region == "E") {
			System.out.println("Este");
		} else if (region == "O") {
			System.out.println("Oeste");
		}else {
			System.out.println("Región Desconocida");
		}

	}

}
