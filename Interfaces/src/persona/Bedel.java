package persona;

import intefaces.Hablador;

public class Bedel extends Persona implements Hablador {

	private String turno;
	private int antiguedad;
	
	
	public Bedel(String nombre, int edad, String turno, int antiguedad) {
		super(nombre, edad);
		this.turno = turno;
		this.antiguedad = antiguedad;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public void hablar() {
		System.out.println("Hola soy un Bedel y se hablar");
		System.out.print("Nombre: " + getNombre());
		System.out.println(" Edad: "+ getEdad());
		System.out.print("Turno: " +turno);
		System.out.println(" Antiguedad: " +antiguedad);
		System.out.println("");
		
	}

	

}
