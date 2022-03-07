package persona2;


public class Persona {
	
	public String nombre;
	public String apellidos;
	public String estado;
	public String fechaNac;
	public String dni;
	public String numTel;
	public String email;
	
	
	
	public void hablar() {
		System.out.println("Hola");
	}
	
	public void hablar(String frase) {
		
		frase="Hola2";
		System.out.println(frase);
	}

}
