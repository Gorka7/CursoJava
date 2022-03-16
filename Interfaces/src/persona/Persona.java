package persona;

public class Persona {
	
	private String Nombre;
	private int Edad;
	
	
	public Persona(String nombre, int edad) {
		super();
		Nombre = nombre;
		Edad = edad;
	}
	
	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getEdad() {
		return Edad;
	}


	public void setEdad(int edad) {
		Edad = edad;
	}
	

	
	

}
