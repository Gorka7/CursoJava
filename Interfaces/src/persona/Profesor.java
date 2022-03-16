package persona;

import intefaces.Hablador;

public class Profesor extends Persona implements Hablador {

	private String despacho;
	private String email;

	public Profesor(String nombre, int edad, String despacho, String email) {
		super(nombre, edad);
		this.despacho = despacho;
		this.email = email;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void hablar() {
		System.out.println("Hola soy un Profesor y se hablar");
		System.out.print("Nombre: " + getNombre());
		System.out.println(" Edad: " + getEdad());
		System.out.print("Despacho: " + despacho);
		System.out.println(" Email: " + email);
		System.out.println("");

	}

}
