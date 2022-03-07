package main;

public class Canario extends Ave {

	public double tamanoReal;

	
	public Canario(String sexo, int edad) {
		super(sexo, edad);
		
	}
	
	public Canario(String sexo, int edad, double tamanoReal) {
		super(sexo, edad);
		this.tamanoReal = tamanoReal;
	}


	public void altura() {

		if (tamanoReal > 30) {
			System.out.println("Alto");
		} else if (tamanoReal > 15 && tamanoReal < 30) {
			System.out.println("Mediano");
		} else if (tamanoReal < 15) {
			System.out.println("Bajo");
		}

	}

}
