package pajaritos;

public abstract class Ave {
	
	private String sexo;
	private int edad;
	
	private DatosPersonales nombres;

	public static int getNumAvesCreadas() {
		return numAvesCreadas;
	}

	public static void setNumAvesCreadas(int numAvesCreadas) {
		Ave.numAvesCreadas = numAvesCreadas;
	}

	public static int numAvesCreadas = 0;

	public Ave(String sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		
		numAvesCreadas++;
	}
	
	public Ave(String sexo, int edad, DatosPersonales nombres) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		this.nombres = nombres;
		
		numAvesCreadas++;
	}
	
	public abstract void cantar();
	
	public static void numeroAvesCreadas() {
		System.out.println("El numero de aves creadas es: " + numAvesCreadas);
	}
	
	public void quienSoy() {
		System.out.println("Sexo del Ave: "+ sexo);
		System.out.println("Edad del Ave: "+ edad+" a�o(s)");
	}
	
	//GET AND SET
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public DatosPersonales getNombres() {
		return nombres;
	}

	public void setNombres(DatosPersonales nombres) {
		this.nombres = nombres;
	}

}
